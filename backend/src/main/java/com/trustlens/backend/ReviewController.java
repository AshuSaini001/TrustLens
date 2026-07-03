package com.trustlens.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/reviews")
@CrossOrigin(origins = "*")
public class ReviewController {

    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private AnalysisResultRepository analysisResultRepository;

    private final String PYTHON_API_URL = "http://127.0.0.1:5050/analyze-sentiment";

    @PostMapping("/analyze")
    public AnalysisResult analyzeReview(@RequestBody Review review) {
        Review savedReview = reviewRepository.save(review);

        RestTemplate restTemplate = new RestTemplate();

        Map<String, String> requestBody = new HashMap<>();
        requestBody.put("text", savedReview.getReviewText());

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<Map<String, String>> requestEntity = new HttpEntity<>(requestBody, headers);

        ResponseEntity<Map> response = restTemplate.postForEntity(PYTHON_API_URL, requestEntity, Map.class);
        Map<String, Object> mlResult = response.getBody();

        AnalysisResult result = new AnalysisResult();
        result.setReviewId(savedReview.getReviewId());

        if (mlResult != null) {
            result.setSentiment(String.valueOf(mlResult.get("sentiment")));
            result.setSentimentConfidence(Double.parseDouble(mlResult.get("sentimentConfidence").toString()));
            result.setFakePrediction(String.valueOf(mlResult.get("fakePrediction")));
            result.setMisleadingScore(Integer.parseInt(mlResult.get("misleadingScore").toString()));
            result.setTrustScore(Integer.parseInt(mlResult.get("trustScore").toString()));
            result.setExplanation(String.valueOf(mlResult.get("reason")));
        } else {
            result.setSentiment("UNKNOWN");
            result.setSentimentConfidence(0.0);
            result.setFakePrediction("UNKNOWN");
            result.setMisleadingScore(0);
            result.setTrustScore(0);
            result.setExplanation("No result from ML service.");
        }

        analysisResultRepository.save(result);
        return result;
    }

    // =========================
    // ADMIN - GET ALL REVIEW RESULTS
    // =========================
    @GetMapping
    public List<AnalysisResult> getAllReviews() {
        return analysisResultRepository.findAll();
    }
}