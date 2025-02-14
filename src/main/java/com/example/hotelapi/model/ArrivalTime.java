package com.example.hotelapi.model;

import jakarta.persistence.Embeddable;

@Embeddable
public class ArrivalTime {
    private int hour;
    private int minute;

    // Getters and setters
    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }
}
