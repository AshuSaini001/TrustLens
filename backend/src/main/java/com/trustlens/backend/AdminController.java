package com.trustlens.backend;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admin")
@CrossOrigin(origins = "*")
public class AdminController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private AnalysisResultRepository analysisResultRepository;

    @Autowired
    private FakeNewsRepository fakeNewsRepository;

    @Autowired
    private FakeNewsResultRepository fakeNewsResultRepository;

    @Autowired
    private ContactMessageRepository contactMessageRepository;

    @GetMapping("/dashboard")
    public Map<String, Object> getDashboardData() {
        Map<String, Object> data = new HashMap<>();

        data.put("users", userRepository.findAll());
        data.put("reviews", reviewRepository.findAll());
        data.put("results", analysisResultRepository.findAll());
        data.put("fakeNews", fakeNewsRepository.findAll());
        data.put("fakeNewsResults", fakeNewsResultRepository.findAll());
        data.put("contactMessages", contactMessageRepository.findAll());

        return data;
    }
}