package red.patterns.creational.factory.beta.model;

import java.util.Objects;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class Passenger {
    private String name;
    private Ticket ticket;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passenger passenger = (Passenger) o;
        return name.equals(passenger.name)
                && ticket.equals(passenger.ticket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, ticket);
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", ticket=" + ticket +
                '}';
    }
}
