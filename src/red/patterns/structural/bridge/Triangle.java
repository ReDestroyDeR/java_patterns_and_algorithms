package red.patterns.structural.bridge;

import java.util.Arrays;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class Triangle extends Shape {
    public Triangle() {
        super(3);
    }

    public Triangle(int[] lengths) {
        super(3, lengths);
    }

    @Override
    public double getArea() {
        return Arrays
                .stream(getLengths())
                .sorted()
                .limit(2)
                .mapToDouble(x -> (double) x)
                .reduce((x, y) -> x * y / 2d)
                .orElseThrow();
    }
}
