

package com.kiran.mood.service;

import com.kiran.mood.model.MoodLog;
import com.kiran.mood.repository.MoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoodService {

    @Autowired
    private MoodRepository moodRepository;

    public String suggestGenre(String mood, String time) {
        if (mood.equalsIgnoreCase("happy")) {
            return time.equalsIgnoreCase("morning") ? "Pop" : "Dance";
        } else if (mood.equalsIgnoreCase("sad")) {
            return "Blues";
        } else if (mood.equalsIgnoreCase("angry")) {
            return "Rock";
        } else if (mood.equalsIgnoreCase("relaxed")) {
            return "Jazz";
        }
        return "Classical";
    }

    public String getSpotifyTrackId(String mood, String time) {
        if (mood.equalsIgnoreCase("happy") && time.equalsIgnoreCase("morning")) {
            return "6I3mqTwhRpn34SLVafSH7G";
        } else if (mood.equalsIgnoreCase("sad") && time.equalsIgnoreCase("evening")) {
            return "0q6LuUqGLUiCPP1cbdwFs3";
        } else if (mood.equalsIgnoreCase("angry")) {
            return "2TpxZ7JUBn3uw46aR7qd6V";
        } else if (mood.equalsIgnoreCase("relaxed")) {
            return "3KkXRkHbMCARz0aVfEt68P";
        }
        return "1AhDOtG9vPSOmsWgNW0BEY";
    }

    public MoodLog saveMood(MoodLog log) {
        log.setSuggestGenre(suggestGenre(log.getCurrentMood(), log.getTimeOfDay()));
        log.setSpotifyTrackId(getSpotifyTrackId(log.getCurrentMood(), log.getTimeOfDay()));
        return moodRepository.save(log);
    }

    public List<MoodLog> getAllLogs() {
        return moodRepository.findAll();
    }
}
