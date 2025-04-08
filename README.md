# emotion-music-recommender


# 🎵 Mood-Based Music Recommendation Web App

This is a Java Spring Boot web application that recommends Spotify tracks based on the user's current mood and time of day. It stores mood logs in a MySQL database and displays past records in a dynamic, styled table using Thymeleaf.

---

## ✨ Features

- 📥 Mood submission form (Username, Mood, Time of Day)
- 🎧 Spotify track suggestion and genre based on mood + time
- 💾 Data saved in MySQL with automatic mood matching
- 📜 Dynamic table view of all user mood logs
- 🧭 Default values (e.g., Happy, Morning) when none selected
- 🎨 Clean and simple UI with Thymeleaf templating

---

## 🛠 Tech Stack

| Layer       | Technology         |
|-------------|--------------------|
| Backend     | Java, Spring Boot  |
| Frontend    | HTML, CSS, Thymeleaf |
| Database    | MySQL              |
| ORM         | Spring Data JPA, Hibernate |
| Templating  | Thymeleaf          |

---

## 📸 Screenshots

### 🎭 Mood Submission Form

http://localhost:8080/moods/new

### 📋 Mood Logs List

http://localhost:8080/moods/all

## 🗃 Database Table (Schema)

```sql
CREATE TABLE mood_logs (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(255) NOT NULL,
    current_mood VARCHAR(255) DEFAULT 'Happy',
    time_of_day VARCHAR(255) DEFAULT 'Morning',
    suggested_genre VARCHAR(255),
    spotify_track_id VARCHAR(255)
);

🙋 Author

Maradana Kiran
📫 kiranmaradana141@gmail.com
📍 Vadodara, Gujarat, India
🌐 LinkedIn https://www.linkedin.com/in/kiran121/

📃 License

This project is open-source and free to use for learning purposes. Add your license here if needed.
---

### ✅ You can now:
1. Copy this content into a `README.md` file.
2. Add it to your root project folder.
3. Push to GitHub with:

```bash
git init
git add .
git commit -m "Initial commit"
git branch -M main
git remote add origin https://github.com/your-username/mood-music-app.git
git push -u origin main
