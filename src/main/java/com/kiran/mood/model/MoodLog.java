package com.kiran.mood.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "mood_logs")
public class MoodLog {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Username is required")
    private String username;

    @NotBlank(message = "Mood is required")
    @Column(name = "currentMood")
    private String currentMood;

    @NotBlank(message = "Time of Day is required")
    @Column(name = "timeOfDay")
    private String timeOfDay;

    @Column(name = "suggestedGenre")
    private String suggestGenre;

    @Column(name = "spotifyTrackId")
    private String spotifyTrackId;

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getCurrentMood() { return currentMood; }
    public void setCurrentMood(String currentMood) { this.currentMood = currentMood; }

    public String getTimeOfDay() { return timeOfDay; }
    public void setTimeOfDay(String timeOfDay) { this.timeOfDay = timeOfDay; }

    public String getSuggestGenre() { return suggestGenre; }
    public void setSuggestGenre(String suggestGenre) { this.suggestGenre = suggestGenre; }

    public String getSpotifyTrackId() { return spotifyTrackId; }
    public void setSpotifyTrackId(String spotifyTrackId) { this.spotifyTrackId = spotifyTrackId; }
}
