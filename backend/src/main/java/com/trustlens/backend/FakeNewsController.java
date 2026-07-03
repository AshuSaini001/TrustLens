package com.trustlens.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/fakenews")
@CrossOrigin(origins = "*")
public class FakeNewsController {

    @Autowired
    private FakeNewsRepository fakeNewsRepository;

    @Autowired
    private FakeNewsResultRepository fakeNewsResultRepository;

    private final String PYTHON_API_URL = "http://127.0.0.1:5050/analyze-fakenews";

    @PostMapping("/analyze")
    public FakeNewsResult analyzeFakeNews(@RequestBody FakeNews fakeNews) {
        FakeNews savedNews = fakeNewsRepository.save(fakeNews);

        RestTemplate restTemplate = new RestTemplate();

        Map<String, String> requestBody = new HashMap<>();
        requestBody.put("text", savedNews.getNewsText());

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        HttpEntity<Map<String, String>> requestEntity = new HttpEntity<>(requestBody, headers);

        ResponseEntity<Map> response = restTemplate.postForEntity(PYTHON_API_URL, requestEntity, Map.class);
        Map<String, Object> mlResult = response.getBody();

        FakeNewsResult result = new FakeNewsResult();
        result.setFakeNewsId(savedNews.getFakeNewsId());

        if (mlResult != null) {
            result.setPrediction(String.valueOf(mlResult.get("prediction")));
            result.setConfidence(Double.parseDouble(mlResult.get("confidence").toString()));
            result.setTrustScore(Integer.parseInt(mlResult.get("trustScore").toString()));
            result.setMisleadingScore(Integer.parseInt(mlResult.get("misleadingScore").toString()));
            result.setExplanation(String.valueOf(mlResult.get("reason")));
        } else {
            result.setPrediction("UNKNOWN");
            result.setConfidence(0.0);
            result.setTrustScore(0);
            result.setMisleadingScore(0);
            result.setExplanation("No result from ML service.");
        }

        fakeNewsResultRepository.save(result);
        return result;
    }

    // =========================
    // ADMIN - GET ALL FAKE NEWS RESULTS
    // =========================
    @GetMapping
    public List<FakeNewsResult> getAllFakeNews() {
        return fakeNewsResultRepository.findAll();
    }
}