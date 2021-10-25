package flowerstore;

public class Chamomile extends Flower {
    public static void main(String[] args) {
        System.out.println(new Rose(1.0f, 12.0f));
    }

    Chamomile(double sepalLength, double price) {
        setSepalLength(sepalLength);
        setColor(new int[]{255, 255, 255});
        setPrice(price);
    }
}
