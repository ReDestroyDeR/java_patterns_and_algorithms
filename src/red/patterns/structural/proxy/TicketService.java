package red.patterns.structural.proxy;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public interface TicketService {
    Ticket createTicket();
    void payForTicket(Passenger passenger, Ticket ticket);
}
