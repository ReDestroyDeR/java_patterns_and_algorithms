package red.patterns.creational.abstractfactory.soft;

import red.patterns.creational.abstractfactory.Plane;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class SoftPlane implements Plane {
    @Override
    public void fly() {
        System.out.println("whush fly");
    }
}
