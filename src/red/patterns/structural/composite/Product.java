package red.patterns.structural.composite;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class Product implements CompositeProduct {
    private String name;
    private int price;

    public Product() {}

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nProduct{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
