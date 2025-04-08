

package com.kiran.mood.controller;

import com.kiran.mood.model.MoodLog;
import com.kiran.mood.service.MoodService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/moods")
public class MoodController {

    @Autowired
    private MoodService moodService;

    @GetMapping("/new")
    public String showForm(Model model) {
        model.addAttribute("moodLog", new MoodLog());
        return "mood-form";
    }

    @PostMapping("/submit")
    public String submitMood(@Valid @ModelAttribute MoodLog moodLog, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "mood-form";
        }
        moodService.saveMood(moodLog);
        return "redirect:/moods/all";
    }

    @GetMapping("/all")
    public String viewAllMoods(Model model) {
        model.addAttribute("logs", moodService.getAllLogs());
        return "mood-list";
    }
}
