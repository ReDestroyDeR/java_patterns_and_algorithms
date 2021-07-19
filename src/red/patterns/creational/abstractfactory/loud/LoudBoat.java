package red.patterns.creational.abstractfactory.loud;

import red.patterns.creational.abstractfactory.Boat;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class LoudBoat implements Boat {
    @Override
    public void swim() {
        System.out.println("AAAAAAAAAAAAAAAAAAA SWIIIIIMMMM");
    }
}
