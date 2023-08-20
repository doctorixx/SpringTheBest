package ru.doctorixx.springthebest.inject;

import org.springframework.beans.factory.annotation.Value;

public class DiningRoom {
    @Value("${floor}")
    private int floor;

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

}
