package red.patterns.behavioural.observer;

import java.util.List;

/**
 * @author Daniil Shreyder
 * Date: 20.07.2021
 */
public class Customer implements Listener {
    private final String name;
    private int memorizedCount;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void handleEvent(List<String> orders) {
        int localCount = orders.size();
        if (localCount < memorizedCount)
            System.out.println(this + ": I hope it's my order");
        else
            System.out.println(this + ": Please, I hope that it's me who placed the order and it will be done quickly");

        memorizedCount = localCount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", memorizedCount=" + memorizedCount +
                '}';
    }
}
