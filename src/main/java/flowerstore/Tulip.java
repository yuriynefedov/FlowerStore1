package flowerstore;

public class Tulip extends Flower {
    public static void main(String[] args) {
        System.out.println(new Tulip(3.0f, 16.0f));
    }

    Tulip(double sepalLength, double price) {
        setSepalLength(sepalLength);
        setColor(new int[]{0, 0, 255});
        setPrice(price);
    }
}
