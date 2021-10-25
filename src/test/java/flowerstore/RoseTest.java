package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoseTest {

    Rose rose1;
    Rose rose2;

    @BeforeEach
    void setUp() {
        rose1 = new Rose(15.0, 18.0);
        rose2 = new Rose(6.0, 19.0);
    }

    @Test
    void testInit() {
        assertEquals(rose1.toString(), "Flower(sepalLength=15.0, color=[255, 0, 0], price=18.0)");
        assertEquals(rose2.toString(), "Flower(sepalLength=6.0, color=[255, 0, 0], price=19.0)");
    }
}