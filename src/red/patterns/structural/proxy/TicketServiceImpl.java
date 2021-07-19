package red.patterns.structural.proxy;

import java.util.Random;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class TicketServiceImpl implements TicketService {

    private TicketServiceImpl() {}

    @Override
    public Ticket createTicket() {
        Ticket ticket = new Ticket();
        ticket.setPrice(100 + new Random().nextInt(100));
        return ticket;
    }

    @Override
    public void payForTicket(Passenger passenger, Ticket ticket) {
        try {
            passenger.removeFromBalance(ticket.getPrice());
            ticket.setActive(true);
            System.out.println(passenger + " payed for " + ticket);
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
    }
}
