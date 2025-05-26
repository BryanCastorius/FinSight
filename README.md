# 🧠 FinSight – Smart Gmail-Based Expense Tracker

**FinSight** is a personal finance tracker that automatically extracts and analyzes transaction emails from Gmail, storing them in a secure PostgreSQL database. Designed to reduce manual entry and offer dynamic monthly summaries, FinSight is backend-driven and privacy-conscious — perfect for local personal use.

---

## 📦 Tech Stack

| Layer       | Tech Used                  |
|-------------|----------------------------|
| Backend     | Java, Spring Boot          |
| Database    | PostgreSQL                 |
| Auth        | Spring Security, JWT       |
| Email Sync  | Gmail API (OAuth2)         |
| Frontend    | Flutter                    |

---

## 🚀 Features

- 🔐 JWT-based authentication
- 📬 Gmail sync for PayLah! transaction emails via Google API
- 🧠 Regex-powered email parsing to extract transactions
- 🗓️ Monthly spending summaries
- 🔄 Deduplication and last-sync tracking
