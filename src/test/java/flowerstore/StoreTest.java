package flowerstore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class StoreTest {

    Store store;
    boolean[] roseSearchResult;
    boolean[] tulipSearchResult;
    boolean[] wrongRoseSearchResult;
    boolean[] wrongTulipSearchResult;

    @BeforeEach
    void setUp() {
        Rose rose = new Rose(12.0, 15.0);
        FlowerPack rosePack = new FlowerPack(rose, 15);
        FlowerBucket roseBucket = new FlowerBucket(rosePack, 17);

        Tulip tulip = new Tulip(12.0, 15.0);
        FlowerPack tulipPack = new FlowerPack(tulip, 15);
        FlowerBucket tulipBucket = new FlowerBucket(tulipPack, 17);

        FlowerBucket[] buckets = new FlowerBucket[2];
        buckets[0] = roseBucket;
        buckets[1] = tulipBucket;

        store = new Store();
        store.buckets = buckets;

        roseSearchResult = store.search(rose);
        tulipSearchResult = store.search(tulip);
        wrongRoseSearchResult = store.search(new Rose(13.0, 15.0));
        wrongTulipSearchResult = store.search(new Tulip(13.0, 15.0));
    }

    @Test
    void search() {
        assertEquals(Arrays.toString(roseSearchResult), Arrays.toString(new boolean[]{true, false}));
        assertEquals(Arrays.toString(tulipSearchResult), Arrays.toString(new boolean[]{false, true}));
        assertEquals(Arrays.toString(wrongRoseSearchResult), Arrays.toString(new boolean[]{false, false}));
        assertEquals(Arrays.toString(wrongTulipSearchResult), Arrays.toString(new boolean[]{false, false}));
    }
}