package com.trustlens.backend;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "analysis_results")
public class AnalysisResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer resultId;

    private Integer reviewId;
    private String sentiment;
    private Double sentimentConfidence;
    private String fakePrediction;
    private Integer misleadingScore;
    private Integer trustScore;

    @Column(columnDefinition = "TEXT")
    private String explanation;

    private LocalDateTime analyzedAt = LocalDateTime.now();

    public Integer getResultId() {
        return resultId;
    }

    public Integer getReviewId() {
        return reviewId;
    }

    public void setReviewId(Integer reviewId) {
        this.reviewId = reviewId;
    }

    public String getSentiment() {
        return sentiment;
    }

    public void setSentiment(String sentiment) {
        this.sentiment = sentiment;
    }

    public Double getSentimentConfidence() {
        return sentimentConfidence;
    }

    public void setSentimentConfidence(Double sentimentConfidence) {
        this.sentimentConfidence = sentimentConfidence;
    }

    public String getFakePrediction() {
        return fakePrediction;
    }

    public void setFakePrediction(String fakePrediction) {
        this.fakePrediction = fakePrediction;
    }

    public Integer getMisleadingScore() {
        return misleadingScore;
    }

    public void setMisleadingScore(Integer misleadingScore) {
        this.misleadingScore = misleadingScore;
    }

    public Integer getTrustScore() {
        return trustScore;
    }

    public void setTrustScore(Integer trustScore) {
        this.trustScore = trustScore;
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