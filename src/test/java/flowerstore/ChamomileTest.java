package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChamomileTest {

    Chamomile chamomile1;
    Chamomile chamomile2;

    @BeforeEach
    void setUp() {
        chamomile1 = new Chamomile(15.0, 18.0);
        chamomile2 = new Chamomile(6.0, 19.0);
    }

    @Test
    void testInit() {
        assertEquals(chamomile1.toString(), "Flower(sepalLength=15.0, color=[255, 255, 255], price=18.0)");
        assertEquals(chamomile2.toString(), "Flower(sepalLength=6.0, color=[255, 255, 255], price=19.0)");
    }
}