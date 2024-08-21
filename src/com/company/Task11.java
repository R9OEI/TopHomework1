package com.company;

import java.time.Duration;
import java.time.LocalDateTime;

public class Task11 {
    public static void main(String[] args) {
        LocalDateTime timeNow = LocalDateTime.now();
        LocalDateTime newYear = LocalDateTime.of(2025,1,1,0,0,0,0);
        System.out.println("Сейчас время: " + timeNow);
        long between = Duration.between(timeNow, newYear).getSeconds();
        int days = (int) (between / 86400);
        between = between % 86400;
        int hours = (int) (between / 3600);
        between = between % 3600;
        int minutes = (int) (between / 60);
        between = between % 60;
        int seconds = (int) between;
        System.out.println("До нового года осталось: " + days + " дней, " + hours + " часов, " + minutes + " минут, " + seconds + " секунд");
    }
}
