package ru.doctorixx.springthebest.inject;

public class Floor1 {
    private DiningRoom diningRoom;

    public void printSomething() {
        System.out.println("Я first floor Столовая на " + diningRoom.getFloor() + " этаже");
        System.out.println(diningRoom.hashCode());

    }

    public void setDiningRoom(DiningRoom diningRoom) {
        this.diningRoom = diningRoom;
    }
}
