package red.patterns.structural.proxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class TicketServiceProxy implements TicketService {
    private final TicketService ticketService;

    public TicketServiceProxy() {
        try {
            // We access target through Reflection API because it's normally inaccessible
            Constructor<?> constructor = Class
                    .forName("red.patterns.structural.proxy.TicketServiceImpl")
                    .getDeclaredConstructors()[0];
            constructor.setAccessible(true);
            this.ticketService = (TicketService) constructor.newInstance();
        } catch (ClassNotFoundException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public Ticket createTicket() {
        return ticketService.createTicket();
    }

    @Override
    public void payForTicket(Passenger passenger, Ticket ticket) {
        ticketService.payForTicket(passenger, ticket);
    }
}
