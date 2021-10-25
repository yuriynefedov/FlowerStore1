package flowerstore;

import java.util.Arrays;
import lombok.Setter;
import lombok.Getter;
import lombok.ToString;


@Getter @Setter @ToString
abstract public class Flower {
    protected double sepalLength;
    protected int[] color;
    protected double price;

    void setColor(int[] newValue) {
        this.color = Arrays.copyOf(newValue, newValue.length);
    }

}
