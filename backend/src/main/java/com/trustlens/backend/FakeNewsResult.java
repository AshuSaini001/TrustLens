package com.trustlens.backend;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "fake_news_results")
public class FakeNewsResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer resultId;

    private Integer fakeNewsId;
    private String prediction;
    private Double confidence;
    private Integer trustScore;
    private Integer misleadingScore;

    @Column(columnDefinition = "TEXT")
    private String explanation;

    private LocalDateTime analyzedAt = LocalDateTime.now();

    public Integer getResultId() {
        return resultId;
    }

    public Integer getFakeNewsId() {
        return fakeNewsId;
    }

    public void setFakeNewsId(Integer fakeNewsId) {
        this.fakeNewsId = fakeNewsId;
    }

    public String getPrediction() {
        return prediction;
    }

    public void setPrediction(String prediction) {
        this.prediction = prediction;
    }

    public Double getConfidence() {
        return confidence;
    }

    public void setConfidence(Double confidence) {
        this.confidence = confidence;
    }

    public Integer getTrustScore() {
        return trustScore;
    }

    public void setTrustScore(Integer trustScore) {
        this.trustScore = trustScore;
    }

    public Integer getMisleadingScore() {
        return misleadingScore;
    }

    public void setMisleadingScore(Integer misleadingScore) {
        this.misleadingScore = misleadingScore;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }

    public LocalDateTime getAnalyzedAt() {
        return analyzedAt;
    }
}