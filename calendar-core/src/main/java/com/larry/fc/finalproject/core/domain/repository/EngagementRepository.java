package com.larry.fc.finalproject.core.domain.repository;

import com.larry.fc.finalproject.core.domain.entity.Engagement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EngagementRepository extends JpaRepository<Engagement, Long> {
}
