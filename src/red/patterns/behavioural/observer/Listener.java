package red.patterns.behavioural.observer;

import java.util.List;

/**
 * @author Daniil Shreyder
 * Date: 20.07.2021
 */
public interface Listener {
    void handleEvent(List<String> orders);
}
