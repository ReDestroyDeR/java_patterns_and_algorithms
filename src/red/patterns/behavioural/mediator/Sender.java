package red.patterns.behavioural.mediator;

/**
 * @author Daniil Shreyder
 * Date: 20.07.2021
 */
public interface Sender {
    void postEvent(String event);
    void processEvent(Sender sender, String event);
}
