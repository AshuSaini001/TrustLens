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

TrustLens-main/
│
├── README.md                                 # Project documentation
├── LICENSE                                   # License file
├── .gitignore                               # Git ignore rules
├── .gitattributes                           # Git LFS configuration
│
├── backend/                                 # Spring Boot Backend
│   ├── pom.xml                             # Maven dependencies
│   ├── mvnw                                 # Maven wrapper (Unix)
│   ├── mvnw.cmd                            # Maven wrapper (Windows)
│   ├── .gitattributes                      # Backend LFS config
│   ├── .gitignore                           # Backend git ignore
│   │
│   ├── .mvn/                                # Maven wrapper folder
│   │   └── wrapper/
│   │       └── maven-wrapper.properties
│   │
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com/
│   │   │   │       └── trustlens/
│   │   │   │           └── backend/
│   │   │   │               ├── BackendApplication.java          # Main Spring Boot class
│   │   │   │               │
│   │   │   │               ├── controllers/
│   │   │   │               │   ├── AdminController.java        # Admin dashboard APIs
│   │   │   │               │   ├── AuthController.java         # Auth APIs (register/login)
│   │   │   │               │   ├── ContactController.java      # Contact form API
│   │   │   │               │   ├── FakeNewsController.java    # Fake news detection APIs
│   │   │   │               │   └── ReviewController.java      # Sentiment analysis APIs
│   │   │   │               │
│   │   │   │               ├── models/
│   │   │   │               │   ├── User.java                  # User entity
│   │   │   │               │   ├── Review.java                # Review entity
│   │   │   │               │   ├── AnalysisResult.java        # Analysis result entity
│   │   │   │               │   ├── FakeNews.java              # Fake news input entity
│   │   │   │               │   ├── FakeNewsResult.java        # Fake news result entity
│   │   │   │               │   ├── ContactMessage.java        # Contact message entity
│   │   │   │               │   ├── ReviewRequest.java         # Review request DTO
│   │   │   │               │   └── ReviewResponse.java        # Review response DTO
│   │   │   │               │
│   │   │   │               ├── repositories/
│   │   │   │               │   ├── UserRepository.java
│   │   │   │               │   ├── ReviewRepository.java
│   │   │   │               │   ├── AnalysisResultRepository.java
│   │   │   │               │   ├── FakeNewsRepository.java
│   │   │   │               │   ├── FakeNewsResultRepository.java
│   │   │   │               │   └── ContactMessageRepository.java
│   │   │   │               │
│   │   │   │               └── services/
│   │   │   │                   └── ReviewService.java          # Business logic
│   │   │   │
│   │   │   └── resources/
│   │   │       ├── application.properties                     # App configuration
│   │   │       └── static/                                     # Static resources
│   │   │
│   │   └── test/
│   │       └── java/
│   │           └── com/
│   │               └── trustlens/
│   │                   └── backend/
│   │                       └── BackendApplicationTests.java   # Unit tests
│   │
│   ├── ml/                                    # Python ML Module
│   │   ├── ml_engine.py                      # Main ML service (Flask API)
│   │   ├── train_model.py                    # Sentiment model training script
│   │   ├── train_fake_news.py                # Fake news model training script
│   │   ├── evaluate_all.py                   # Model evaluation script
│   │   ├── test_cases.py                     # Test cases
│   │   ├── test_sentiment.py                 # Sentiment test
│   │   ├── test_v2.py                        # Additional tests
│   │   │
│   │   ├── datasets/                          # Training datasets
│   │   │   ├── Fake.csv                      # Fake news dataset
│   │   │   ├── True.csv                      # Real news dataset
│   │   │   ├── gossipcop_fake.csv            # GossipCop fake news
│   │   │   ├── gossipcop_real.csv            # GossipCop real news
│   │   │   ├── politifact_fake.csv           # Politifact fake news
│   │   │   ├── politifact_real.csv           # Politifact real news
│   │   │   ├── twitter_training.csv          # Twitter training data
│   │   │   └── twitter_validation.csv        # Twitter validation data
│   │   │
│   │   └── models/                            # Trained ML models (LFS)
│   │       ├── sentiment_model.pkl           # Sentiment analysis model (LFS)
│   │       ├── fake_news_model.pkl           # Fake news detection model (LFS)
│   │       ├── fake_news_full.pkl            # Full fake news model (LFS)
│   │       └── fake_news_title.pkl           # Title-based model (LFS)
│   │
│   ├── SentimentServer.java                  # Standalone sentiment server
│   └── trustlens_database.sql                # MySQL database schema
│
├── frontend/                                 # Static Frontend
│   ├── README.md                             # Frontend documentation
│   │
│   ├── index.html                            # Landing/home page
│   ├── login.html                            # Login page
│   ├── register.html                         # Registration page
│   ├── dashboard.html                        # Admin dashboard
│   ├── sentiment.html                        # Sentiment analysis page
│   ├── fake-news.html                        # Fake news detection page
│   ├── fake-news-result.html                 # Fake news results page
│   ├── analyze.html                          # Analysis page
│   ├── result.html                           # Results page
│   ├── admin.html                            # Admin management page
│   ├── about.html                            # About page
│   ├── contact.html                          # Contact page
│   │
│   ├── css/
│   │   ├── style.css                         # Main stylesheet
│   │   ├── responsive.css                    # Responsive styles
│   │   └── theme.css                         # Theme customization
│   │
│   ├── js/
│   │   ├── app.js                            # Main application logic
│   │   ├── auth.js                           # Authentication logic
│   │   ├── dashboard.js                      # Dashboard functions
│   │   ├── validation.js                     # Form validation
│   │   ├── animation.js                      # Animations
│   │   └── script.js                         # Additional scripts
│   │
│   └── assets/                                # Images and icons
│       ├── images/
│       └── icons/
│
└── docs/                                     # Documentation
    ├── Final Java project Report.pdf          # Full project report
    ├── API_DOCUMENTATION.md                   # API reference
    ├── DEPLOYMENT.md                          # Deployment guide
    └── CONTRIBUTING.md                        # Contributing guidelines
