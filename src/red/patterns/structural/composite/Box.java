package red.patterns.structural.composite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class Box implements CompositeProduct {
    private List<CompositeProduct> products = new ArrayList<>();

    public Box() {}

    public Box(CompositeProduct...products) {
        this.products.addAll(Arrays.stream(products).toList());
    }

    public Box(List<CompositeProduct> products) {
        this.products = products;
    }

    public List<CompositeProduct> getProducts() {
        return products;
    }

    @Override
    public int getPrice() {
        return products.stream().mapToInt(CompositeProduct::getPrice).sum();
    }

    @Override
    public String toString() {
        return "\nBox{" +
                "products=" + products +
                '}';
    }
}
