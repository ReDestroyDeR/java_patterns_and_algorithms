package red.patterns.creational.abstractfactory.loud;

import red.patterns.creational.abstractfactory.Car;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class LoudCar implements Car {
    @Override
    public void drive() {
        System.out.println("BRRRRRRRR BRRRRRRRRRRRRRRRR");
    }
}
