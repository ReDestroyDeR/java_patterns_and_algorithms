package red.patterns.creational.abstractfactory.loud;

import red.patterns.creational.abstractfactory.Plane;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class LoudPlane implements Plane {
    @Override
    public void fly() {
        System.out.println("WUSUDWUSUUUHHH WE FLYYYY");
    }
}
