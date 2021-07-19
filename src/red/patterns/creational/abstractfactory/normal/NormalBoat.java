package red.patterns.creational.abstractfactory.normal;

import red.patterns.creational.abstractfactory.Boat;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class NormalBoat implements Boat {
    @Override
    public void swim() {
        System.out.println("Pshush we swim");
    }
}
