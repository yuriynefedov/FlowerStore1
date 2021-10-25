package flowerstore;

public class FlowerPack {
    Flower flower;
    int amount;

    FlowerPack(Flower flower, int amount) {
        this.flower = flower;
        this.amount = amount;
    }

    float price() {
        return (float) (flower.price * amount);
    }

    public static void main(String[] args) {
        FlowerPack flowerPack = new FlowerPack(new Rose(1.0, 12.0), 15);
        System.out.println(flowerPack.price());
    }
}
