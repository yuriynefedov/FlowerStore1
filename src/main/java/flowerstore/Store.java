package flowerstore;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Store {
    FlowerBucket[] buckets;

    boolean[] search(Flower flower) {
        boolean[] result = new boolean[buckets.length];
        for (int i = 0; i < buckets.length; i++) {
            if (buckets[i].flowerPack.flower == flower) {
                result[i] = true;
            }
        }
        return result;
    }
}
