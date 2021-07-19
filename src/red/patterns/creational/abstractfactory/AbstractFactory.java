package red.patterns.creational.abstractfactory;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public interface AbstractFactory {
    Boat createBoat();
    Car createCar();
    Plane createPlane();
}
