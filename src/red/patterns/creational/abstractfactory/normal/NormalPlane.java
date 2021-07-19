package red.patterns.creational.abstractfactory.normal;

import red.patterns.creational.abstractfactory.Plane;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class NormalPlane implements Plane {
    @Override
    public void fly() {
        System.out.println("Wshuh Wshuh We fly");
    }
}
