package ru.doctorixx.springthebest.inject;

public class Academy52 {
    private DiningRoom diningRoom;

    public void printSomething() {
        System.out.println("Столовая на " + diningRoom.getFloor() + " этаже");
        System.out.println(diningRoom.hashCode());
    }

    public void setDiningRoom(DiningRoom diningRoom) {
        this.diningRoom = diningRoom;
    }

    public boolean diningRoomFloorIsFirst(){
        return diningRoom.getFloor() == 1;
    }
}
