

package com.kiran.mood.repository;

import com.kiran.mood.model.MoodLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoodRepository extends JpaRepository<MoodLog, Long> {
}
