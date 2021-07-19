package red.patterns.creational.factory.beta;

import red.patterns.creational.factory.beta.model.Airplane;
import red.patterns.creational.factory.beta.model.Ticket;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */

public interface TicketFactory {
    Ticket createTicket(Airplane airplane);
}
