package red.patterns.creational.abstractfactory.soft;

import red.patterns.creational.abstractfactory.Boat;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class SoftBoat implements Boat {
    @Override
    public void swim() {
        System.out.println("pluh we swim");
    }
}
