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

Digital platforms generate massive volumes of textual data daily through comments, reviews, feedback, and news articles. Organizations, governments, and businesses struggle to process this data effectively.

### ❌ Current Challenges

| Challenge | Impact |
|-----------|--------|
| ❌ **Manual analysis is slow** | Reading thousands of comments daily is time-consuming and inefficient |
| ❌ **Human error and bias** | Reviewers overlook important opinions and misunderstand emotional context |
| ❌ **Cannot scale** | Manual methods fail when data volume grows exponentially |
| ❌ **Fake news spreads fast** | Misinformation circulates without proper verification |
| ❌ **Reduced trust** | Misleading content confuses users and damages credibility |
| ❌ **No integrated solution** | Existing systems handle either sentiment OR fake news, not both |

---

### ✅ How TrustLens Solves These Problems

| Solution | Benefit |
|----------|---------|
| ✅ **Automated sentiment analysis** | Classifies comments as Positive, Negative, or Neutral in seconds |
| ✅ **Fake news detection** | Identifies misleading content using Machine Learning |
| ✅ **Trust & Misleading scores** | Provides quantitative reliability indicators |
| ✅ **Scalable architecture** | Handles large volumes of text efficiently |
| ✅ **Integrated platform** | Combines sentiment + fake news detection in one system |
| ✅ **Admin dashboard** | Monitor users, content, and analytics in real-time |

---

## 📊 Quick Comparison

| Aspect | ❌ Before TrustLens | ✅ After TrustLens |
|--------|---------------------|---------------------|
| **Analysis Speed** | Hours/Days | Seconds |
| **Accuracy** | Inconsistent | Consistent (ML-driven) |
| **Scalability** | Limited | High |
| **Fake News Detection** | Manual verification | Automated ML classification |
| **Cost** | High (manual labor) | Low (automated) |
| **User Understanding** | Vague | Clear with scores & explanations |

---

## 🚀 The Solution

**TrustLens** bridges the gap between raw user-generated content and actionable insights. By combining **Sentiment Analysis** and **Fake News Detection** into a single intelligent platform, TrustLens helps organizations:

- 📊 **Understand public opinion** at scale
- 🔍 **Verify content credibility** instantly
- ⏱️ **Save time and resources** through automation
- 🤝 **Build trust** in digital communication platforms
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

<div align="center">
  <img src="https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=java" alt="Java"/>
  <img src="https://img.shields.io/badge/Spring%20Boot-3.4.4-brightgreen?style=for-the-badge&logo=spring-boot" alt="Spring Boot"/>
  <img src="https://img.shields.io/badge/Python-3.9+-yellow?style=for-the-badge&logo=python" alt="Python"/>
  <img src="https://img.shields.io/badge/MySQL-8.0-blue?style=for-the-badge&logo=mysql" alt="MySQL"/>
  <img src="https://img.shields.io/badge/HTML-5-orange?style=for-the-badge&logo=html5" alt="HTML5"/>
  <img src="https://img.shields.io/badge/CSS-3-blue?style=for-the-badge&logo=css3" alt="CSS3"/>
  <img src="https://img.shields.io/badge/JavaScript-ES6-yellow?style=for-the-badge&logo=javascript" alt="JavaScript"/>
</div>

| **Category**       | **Technologies** |
|---------------------|------------------|
| **Frontend**        | HTML5, CSS3, JavaScript |
| **Backend**         | Java 17, Spring Boot 3.4.4, Spring Data JPA |
| **Database**        | MySQL 8.0 |
| **Machine Learning**| Python 3.9+, Scikit-learn, Pandas, NumPy, NLTK / VADER |
| **API & Integration**| RESTful APIs, REST Template |
| **Build & Dev Tools**| Maven, Git, Postman, VS Code |
| **ML Service**      | Flask (Python) for serving models |
| **Deployment**      | Netlify / Render (frontend & backend) |
| **Version Control** | Git / GitHub |

