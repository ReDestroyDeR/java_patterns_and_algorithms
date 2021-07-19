package red.patterns.structural.proxy;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class ProxyGeneral {
    public static void main(String[] args) {
        TicketService ticketService = new TicketServiceProxy();
        Passenger passenger = new Passenger();
        passenger.setName("John");
        passenger.addToBalance(200);
        Ticket ticket = ticketService.createTicket();
        ticketService.payForTicket(passenger, ticket);
        ticketService.payForTicket(passenger, ticket);
    }
}
