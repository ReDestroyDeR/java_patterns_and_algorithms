package red.patterns.behavioural.mediator;

/**
 * @author Daniil Shreyder
 * Date: 20.07.2021
 */
public interface Mediator {
    void mediateEvent(Sender sender, String event);
}
