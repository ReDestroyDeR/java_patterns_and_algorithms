package red.patterns.structural.bridge;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.IntStream;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public abstract class Shape {
    private final Color color;
    private final int vertices;
    private final int[] lengths;

    protected Shape(int vertices) {
        this.vertices = vertices;
        this.lengths = IntStream.generate(() -> 1).limit(vertices).toArray();
        this.color = Colors.WHITE.color;
    }

    protected Shape(int vertices, int[] lengths) {
        if (lengths.length != vertices)
            throw new IllegalArgumentException(
                    String.format(
                            "Given %d lengths with only %d vertices present",
                            lengths.length, vertices
                    )
            );

        this.vertices = vertices;
        this.lengths = lengths;
        this.color = Colors.WHITE.color;
    }

    public int getPerimeter() {
        return Arrays.stream(lengths).sum();
    }

    public abstract double getArea();

    public void setColor(Color color) {
        this.color.setRGB(color);
    }

    public Color getColor() {
        return color;
    }

    public int getVertices() {
        return vertices;
    }

    public int[] getLengths() {
        return lengths;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shape shape = (Shape) o;
        return vertices == shape.vertices
                && Objects.equals(color, shape.color)
                && Arrays.equals(lengths, shape.lengths);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(color, vertices);
        result = 31 * result + Arrays.hashCode(lengths);
        return result;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color=" + color +
                ", vertices=" + vertices +
                ", lengths=" + Arrays.toString(lengths) +
                ", area=" + getArea() +
                ", perimeter=" + getPerimeter() +
                '}';
    }
}
