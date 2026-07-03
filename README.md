# TrustLens - Intelligent Content Analysis System

<div align="center">

![TrustLens Banner](https://img.shields.io/badge/TrustLens-AI%20Content%20Analysis-blue)
![Java](https://img.shields.io/badge/Java-17-orange)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.4.4-green)
![Python](https://img.shields.io/badge/Python-3.9+-yellow)
![MySQL](https://img.shields.io/badge/MySQL-8.0-blue)
![License](https://img.shields.io/badge/License-MIT-red)

**An AI-powered platform for Sentiment Analysis & Fake News Detection**

[Features](#-features) • [Tech Stack](#-tech-stack) • [Installation](#-installation) • [Deployment](#-deployment) • [API](#-api-endpoints)

</div>

---

## 📖 Overview

**TrustLens** is a full-stack web application that uses **Machine Learning** and **Natural Language Processing (NLP)** to analyze textual content. The system integrates two powerful modules:

1. **Sentiment Analysis** – Classifies user comments/reviews as Positive, Negative, or Neutral
2. **Fake News Detection** – Identifies misleading or fake information in news articles

TrustLens helps organizations, governments, and businesses understand public opinion, improve decision-making, and combat misinformation in digital communication platforms.

---

## 🎯 Problem Statement

Digital platforms generate massive volumes of textual data daily. Manual analysis is:
- ❌ Time-consuming and inefficient
- ❌ Prone to human error and bias
- ❌ Unable to scale with growing data

Additionally, the rapid spread of fake news and misleading information through social media and online platforms creates:
- ❌ Confusion among users
- ❌ Reduced trust in digital systems
- ❌ Negative influence on public opinion

TrustLens solves these challenges through intelligent automation.

---

## ✨ Features

### For Users
- 🔐 **Secure Authentication** – Register and login with role-based access
- 💬 **Sentiment Analysis** – Analyze comments, reviews, and feedback
- 📰 **Fake News Detection** – Verify the credibility of news content
- 📊 **Trust Scores** – View trust and misleading scores with explanations
- 📱 **Responsive UI** – Works on desktop, tablet, and mobile

### For Admins
- 👥 **User Management** – Monitor registered users
- 📝 **Content Monitoring** – View all submitted comments and news
- 📈 **Analytics Dashboard** – Track system activity and results
- 🛠️ **System Control** – Manage records and oversee platform

### Technical Features
- 🤖 **Machine Learning Integration** – Python-based ML models
- 🔄 **REST API** – Full API support for frontend-backend communication
- 🗄️ **Database Management** – Structured MySQL database
- 🏗️ **Modular Architecture** – Scalable and maintainable design
- 🔒 **Role-Based Access Control** – User vs. Admin privileges

---

## 🛠️ Tech Stack

```text
TrustLens-main/
├── README.md
├── LICENSE
├── .gitignore
├── .gitattributes
│
├── backend/
│   ├── pom.xml
│   ├── mvnw
│   ├── mvnw.cmd
│   ├── .gitattributes
│   ├── .gitignore
│   │
│   ├── .mvn/
│   │   └── wrapper/
│   │       └── maven-wrapper.properties
│   │
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com/
│   │   │   │       └── trustlens/
│   │   │   │           └── backend/
│   │   │   │               ├── BackendApplication.java
│   │   │   │               ├── controllers/
│   │   │   │               │   ├── AdminController.java
│   │   │   │               │   ├── AuthController.java
│   │   │   │               │   ├── ContactController.java
│   │   │   │               │   ├── FakeNewsController.java
│   │   │   │               │   └── ReviewController.java
│   │   │   │               ├── models/
│   │   │   │               │   ├── User.java
│   │   │   │               │   ├── Review.java
│   │   │   │               │   ├── AnalysisResult.java
│   │   │   │               │   ├── FakeNews.java
│   │   │   │               │   ├── FakeNewsResult.java
│   │   │   │               │   ├── ContactMessage.java
│   │   │   │               │   ├── ReviewRequest.java
│   │   │   │               │   └── ReviewResponse.java
│   │   │   │               ├── repositories/
│   │   │   │               │   ├── UserRepository.java
│   │   │   │               │   ├── ReviewRepository.java
│   │   │   │               │   ├── AnalysisResultRepository.java
│   │   │   │               │   ├── FakeNewsRepository.java
│   │   │   │               │   ├── FakeNewsResultRepository.java
│   │   │   │               │   └── ContactMessageRepository.java
│   │   │   │               └── services/
│   │   │   │                   └── ReviewService.java
│   │   │   └── resources/
│   │   │       ├── application.properties
│   │   │       └── static/
│   │   └── test/
│   │       └── java/
│   │           └── com/
│   │               └── trustlens/
│   │                   └── backend/
│   │                       └── BackendApplicationTests.java
│   │
│   ├── ml/
│   │   ├── ml_engine.py
│   │   ├── train_model.py
│   │   ├── train_fake_news.py
│   │   ├── evaluate_all.py
│   │   ├── test_cases.py
│   │   ├── test_sentiment.py
│   │   ├── test_v2.py
│   │   ├── datasets/
│   │   │   ├── Fake.csv
│   │   │   ├── True.csv
│   │   │   ├── gossipcop_fake.csv
│   │   │   ├── gossipcop_real.csv
│   │   │   ├── politifact_fake.csv
│   │   │   ├── politifact_real.csv
│   │   │   ├── twitter_training.csv
│   │   │   └── twitter_validation.csv
│   │   └── models/
│   │       ├── sentiment_model.pkl
│   │       ├── fake_news_model.pkl
│   │       ├── fake_news_full.pkl
│   │       └── fake_news_title.pkl
│   │
│   ├── SentimentServer.java
│   └── trustlens_database.sql
│
├── frontend/
│   ├── README.md
│   ├── index.html
│   ├── login.html
│   ├── register.html
│   ├── dashboard.html
│   ├── sentiment.html
│   ├── fake-news.html
│   ├── fake-news-result.html
│   ├── analyze.html
│   ├── result.html
│   ├── admin.html
│   ├── about.html
│   ├── contact.html
│   ├── css/
│   │   ├── style.css
│   │   ├── responsive.css
│   │   └── theme.css
│   ├── js/
│   │   ├── app.js
│   │   ├── auth.js
│   │   ├── dashboard.js
│   │   ├── validation.js
│   │   ├── animation.js
│   │   └── script.js
│   └── assets/
│       ├── images/
│       └── icons/
│
└── docs/
    ├── Final Java project Report.pdf
    ├── API_DOCUMENTATION.md
    ├── DEPLOYMENT.md
    └── CONTRIBUTING.md
```
