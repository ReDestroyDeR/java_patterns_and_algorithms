package red.patterns.structural.bridge;

import java.util.Arrays;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class Square extends Shape {
    public Square() {
        super(4);
    }

    public Square(int length) {
        super(4, new int[] {length, length, length, length});
    }

    public Square(int[] lengths) {
        super(4);
        throw new UnsupportedOperationException("Impossible to calculate area");
    }

    @Override
    public double getArea() {
        return Math.pow(getLengths()[1], 2);
    }
}
