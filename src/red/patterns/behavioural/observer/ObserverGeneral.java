package red.patterns.behavioural.observer;

/**
 * @author Daniil Shreyder
 * Date: 20.07.2021
 */
public class ObserverGeneral {
    public static void main(String[] args) {
        Listener firstListener = new Customer("John");
        Listener secondListener = new Customer("Ryan");
        Listener thirdListener = new Customer("Ion");
        Cafe cafe = new Cafe();
        cafe.addListener(firstListener);
        cafe.addListener(secondListener);
        cafe.addOrder("Order one");
        cafe.addListener(thirdListener);
        cafe.removeOrder("Order one");
        cafe.addOrder("Order two");
        cafe.addOrder("Order three");
        cafe.removeListener(secondListener);
        cafe.removeOrder("Order two");
    }
}
