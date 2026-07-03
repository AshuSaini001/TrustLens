package com.trustlens.backend;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "fake_news_inputs")
public class FakeNews {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer fakeNewsId;

    private Integer userId;

    @Column(columnDefinition = "TEXT")
    private String newsText;

    private LocalDateTime createdAt = LocalDateTime.now();

    public Integer getFakeNewsId() {
        return fakeNewsId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getNewsText() {
        return newsText;
    }

    public void setNewsText(String newsText) {
        this.newsText = newsText;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
}
