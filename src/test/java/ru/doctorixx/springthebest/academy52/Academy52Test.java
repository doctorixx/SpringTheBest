package ru.doctorixx.springthebest.academy52;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ru.doctorixx.springthebest.inject.Academy52;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest(classes = Academy52TestConfig.class)
class Academy52Test {

    @Autowired
    private Academy52 academy52;

    @Test
    void contextLoads() {
    }

    @Test
    void firstFloorMethod() {
        assertTrue(academy52.diningRoomFloorIsFirst());
    }


}
