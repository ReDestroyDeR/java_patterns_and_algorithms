package red.patterns.creational.factory.beta.model;

import java.util.Objects;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class Ticket {
    private int price;
    private int seat;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return price == ticket.price && seat == ticket.seat;
    }

    @Override
    public int hashCode() {
        return Objects.hash(price, seat);
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "price=" + price +
                ", seat=" + seat +
                '}';
    }
}
