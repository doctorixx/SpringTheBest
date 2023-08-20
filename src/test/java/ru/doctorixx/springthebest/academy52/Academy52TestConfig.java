package ru.doctorixx.springthebest.academy52;

import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import ru.doctorixx.springthebest.inject.Academy52;
import ru.doctorixx.springthebest.inject.DiningRoom;
import ru.doctorixx.springthebest.inject.Floor1;

import static org.mockito.Mockito.*;


@TestConfiguration
public class Academy52TestConfig {
    @Bean
    public DiningRoom diningRoom() {
        DiningRoom diningRoom = mock();

        when(diningRoom.getFloor()).thenReturn(1);

        return diningRoom;
    }

    @Bean
    public Academy52 academy52(DiningRoom diningRoom) {
        Academy52 academy52 = new Academy52();
        academy52.setDiningRoom(diningRoom);
        return academy52;
    }

    @Bean
    public Floor1 floor1(DiningRoom diningRoom) {
        Floor1 academy52 = new Floor1();
        academy52.setDiningRoom(diningRoom);
        return academy52;
    }
}
