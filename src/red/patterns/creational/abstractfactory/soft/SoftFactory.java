package red.patterns.creational.abstractfactory.soft;

import red.patterns.creational.abstractfactory.AbstractFactory;
import red.patterns.creational.abstractfactory.Boat;
import red.patterns.creational.abstractfactory.Car;
import red.patterns.creational.abstractfactory.Plane;
import red.patterns.creational.abstractfactory.normal.NormalBoat;
import red.patterns.creational.abstractfactory.normal.NormalCar;
import red.patterns.creational.abstractfactory.normal.NormalPlane;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class SoftFactory implements AbstractFactory {
    @Override
    public Boat createBoat() {
        return new SoftBoat();
    }

    @Override
    public Car createCar() {
        return new SoftCar();
    }

    @Override
    public Plane createPlane() {
        return new SoftPlane();
    }
}
