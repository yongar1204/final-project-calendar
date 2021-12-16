package com.larry.fc.finalproject.core;

import com.larry.fc.finalproject.core.domain.ScheduleType;
import com.larry.fc.finalproject.core.domain.entity.Engagement;
import com.larry.fc.finalproject.core.domain.Event;
import com.larry.fc.finalproject.core.domain.RequestStatus;
import com.larry.fc.finalproject.core.domain.entity.Schedule;
import com.larry.fc.finalproject.core.domain.entity.User;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DomainCreateTest {
    @Test
    void eventCreate() {
        final User me = new User("yong", "yong@yong", "pw", LocalDate.now());
        final Schedule task = Schedule.task("할일", "청소하기", LocalDateTime.now(), me);
        assertEquals(task.getScheduleType(), ScheduleType.TASK);
        assertEquals(task.toTask().getTitle(), "할일");
    }
}
