package red.patterns.creational.abstractfactory.normal;

import red.patterns.creational.abstractfactory.AbstractFactory;
import red.patterns.creational.abstractfactory.Boat;
import red.patterns.creational.abstractfactory.Car;
import red.patterns.creational.abstractfactory.Plane;
import red.patterns.creational.abstractfactory.loud.LoudBoat;
import red.patterns.creational.abstractfactory.loud.LoudCar;
import red.patterns.creational.abstractfactory.loud.LoudPlane;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class NormalFactory implements AbstractFactory {
    @Override
    public Boat createBoat() {
        return new NormalBoat();
    }

    @Override
    public Car createCar() {
        return new NormalCar();
    }

    @Override
    public Plane createPlane() {
        return new NormalPlane();
    }
}
