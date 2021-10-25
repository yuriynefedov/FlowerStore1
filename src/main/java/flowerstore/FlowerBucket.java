package flowerstore;

public class FlowerBucket {
    FlowerPack flowerPack;
    int amount;

    FlowerBucket(FlowerPack flowerPack, int amount) {
        this.flowerPack = flowerPack;
        this.amount = amount;
    }

    float price() {
        return this.amount * this.flowerPack.price();
    }

    public static void main(String[] args) {
        FlowerBucket flowerBucket = new FlowerBucket(new FlowerPack(new Rose(1.0f, 12.0f), 12), 12);
    }
}
