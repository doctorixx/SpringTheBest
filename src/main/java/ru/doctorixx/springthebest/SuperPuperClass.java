package ru.doctorixx.springthebest;

import ru.doctorixx.springthebest.inject.Academy52;
import ru.doctorixx.springthebest.inject.DiningRoom;
import ru.doctorixx.springthebest.inject.Floor1;

public class SuperPuperClass {
    public static void main(String[] args) {
        DiningRoom room = new DiningRoom();
        room.setFloor(1);

        Academy52 academy52 = new Academy52();
        academy52.setDiningRoom(room);

        Floor1 floor1 = new Floor1();
        floor1.setDiningRoom(room);

        floor1.printSomething();
        academy52.printSomething();

    }
}
