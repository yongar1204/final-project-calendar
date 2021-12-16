package com.larry.fc.finalproject.core.domain;

import com.larry.fc.finalproject.core.domain.entity.Engagement;
import com.larry.fc.finalproject.core.domain.entity.Schedule;
import com.larry.fc.finalproject.core.domain.entity.User;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Getter
@NoArgsConstructor
public class Event {
    private Schedule schedule;

    public Event(Schedule schedule) {
        this.schedule = schedule;
    }
}
