package red.patterns.creational.abstractfactory.loud;

import red.patterns.creational.abstractfactory.AbstractFactory;
import red.patterns.creational.abstractfactory.Boat;
import red.patterns.creational.abstractfactory.Car;
import red.patterns.creational.abstractfactory.Plane;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class LoudFactory implements AbstractFactory {
    @Override
    public Boat createBoat() {
        return new LoudBoat();
    }

    @Override
    public Car createCar() {
        return new LoudCar();
    }

    @Override
    public Plane createPlane() {
        return new LoudPlane();
    }
}
