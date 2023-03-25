package com.wodle.utils;

import java.time.Duration;
import java.time.LocalDateTime;

public class LocalDateTimeUtils {

    public long getBetweenDays(LocalDateTime past, LocalDateTime future) {
        return Duration.between(past, future)
            .toDays();
    }
}