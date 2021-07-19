package red.patterns.structural.proxy;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class Ticket {
    private int price;
    private boolean active;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "price=" + price +
                ", active=" + active +
                '}';
    }
}
