package red.patterns.creational.abstractfactory.normal;

import red.patterns.creational.abstractfactory.Car;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class NormalCar implements Car {
    @Override
    public void drive() {
        System.out.println("Brr Brrr we drive");
    }
}
