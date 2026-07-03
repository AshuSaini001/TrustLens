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

### Frontend
| Technology | Purpose |
|------------|---------|
| **HTML5** | Page structure |
| **CSS3** | Styling & responsiveness |
| **JavaScript** | Dynamic functionality & API calls |

### Backend
| Technology | Purpose |
|------------|---------|
| **Java 17** | Core programming language |
| **Spring Boot 3.4.4** | REST API framework |
| **Spring Data JPA** | Database ORM |
| **MySQL 8.0** | Relational database |

### Machine Learning
| Technology | Purpose |
|------------|---------|
| **Python 3.9+** | ML implementation |
| **Scikit-learn** | Model training & classification |
| **Pandas** | Data preprocessing |
| **NumPy** | Numerical computations |
| **NLTK / VADER** | NLP preprocessing |

### Tools & Integration
| Tool | Purpose |
|------|---------|
| **REST APIs** | Backend-ML communication |
| **Postman** | API testing |
| **Git** | Version control |
| **VS Code** | Development IDE |

---

## 📁 Project Structure
TrustLens-main/
├── backend/ # Spring Boot Backend
│ ├── src/main/java/... # Java source code
│ │ ├── AdminController.java
│ │ ├── AuthController.java
│ │ ├── ReviewController.java
│ │ ├── FakeNewsController.java
│ │ ├── User.java
│ │ ├── Review.java
│ │ └── ... (other controllers & models)
│ ├── src/main/resources/
│ │ └── application.properties
│ ├── ml/ # Python ML Module
│ │ ├── ml_engine.py # ML service logic
│ │ ├── train_model.py # Model training scripts
│ │ ├── train_fake_news.py # Fake news training
│ │ ├── sentiment_model.pkl # Trained sentiment model
│ │ ├── fake_news_model.pkl # Trained fake news model
│ │ └── *.csv # Training datasets
│ ├── pom.xml # Maven dependencies
│ └── trustlens_database.sql # Database schema
│
├── frontend/ # Static Frontend
│ ├── css/
│ │ └── style.css
│ ├── js/
│ │ ├── app.js # Main application logic
│ │ ├── auth.js # Authentication logic
│ │ └── validation.js # Form validation
│ ├── index.html # Landing page
│ ├── login.html
│ ├── register.html
│ ├── dashboard.html # Admin dashboard
│ ├── sentiment.html # Sentiment analysis page
│ ├── fake-news.html # Fake news detection page
│ └── ... (other HTML pages)
│
├── .gitignore
├── .gitattributes # Git LFS configuration
└── README.md
