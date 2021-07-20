package red.patterns.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Daniil Shreyder
 * Date: 20.07.2021
 */
public class Cafe implements Producer {
    private List<Listener> listeners = new ArrayList<>();
    private List<String> orders = new ArrayList<>();

    public void addListener(Listener listener) {
        System.out.println("\nCafe added listener! " + listener);
        listeners.add(listener);
    }

    public void removeListener(Listener listener) {
        System.out.println("\nCafe removed listener! " + listener);
        listeners.remove(listener);
    }

    public void addOrder(String order) {
        System.out.println("\nCafe added order! " + order);
        orders.add(order);
        notifyListeners();
    }

    public void removeOrder(String order) {
        System.out.println("\nCafe removed order! " + order);
        orders.remove(order);
        notifyListeners();
    }

    @Override
    public void notifyListeners() {
        listeners.forEach(listener -> listener.handleEvent(orders));
    }
}
