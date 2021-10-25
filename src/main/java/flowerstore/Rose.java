package flowerstore;

public class Rose extends Flower {
    public static void main(String[] args) {
        System.out.println(new Rose(1.0f, 12.0f));
    }

    Rose(double sepalLength, double price) {
        setSepalLength(sepalLength);
        setColor(new int[]{255, 0, 0});
        setPrice(price);
    }
}
