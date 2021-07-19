package red.patterns.creational.abstractfactory.soft;

import red.patterns.creational.abstractfactory.Car;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class SoftCar implements Car {
    @Override
    public void drive() {
        System.out.println("brrr we drive");
    }
}
