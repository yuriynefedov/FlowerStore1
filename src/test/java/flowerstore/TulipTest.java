package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TulipTest {

    Tulip tulip1;
    Tulip tulip2;

    @BeforeEach
    void setUp() {
        tulip1 = new Tulip(12.0, 13.0);
        tulip2 = new Tulip(7.0, 11.0);
    }

    @Test
    void testInit() {
        assertEquals(tulip1.toString(), "Flower(sepalLength=12.0, color=[0, 0, 255], price=13.0)");
        assertEquals(tulip2.toString(), "Flower(sepalLength=7.0, color=[0, 0, 255], price=11.0)");
    }
}