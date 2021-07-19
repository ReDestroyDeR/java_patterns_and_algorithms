package red.patterns.creational.abstractfactory;

import red.patterns.creational.abstractfactory.loud.LoudFactory;
import red.patterns.creational.abstractfactory.normal.NormalFactory;
import red.patterns.creational.abstractfactory.soft.SoftFactory;

import java.util.Scanner;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class AbstractFactoryGeneral {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select mode\n\t1 - Soft\n\t2 - Normal\n\t3 - Loud");
        int mode = scanner.nextInt();

        AbstractFactory factory =
                (mode == 1)
                        ? new SoftFactory()
                        : (mode == 2)
                            ? new NormalFactory()
                            : new LoudFactory();

        System.out.println("Thanks for order! Now you have Boat, Car and Plane!");
        System.out.println("BOAT: ");
        Boat boat = factory.createBoat();
        System.out.println(boat);
        boat.swim();

        System.out.println("CAR: ");
        Car car = factory.createCar();
        System.out.println(car);
        car.drive();

        System.out.println("PLANE: ");
        Plane plane = factory.createPlane();
        System.out.println(plane);
        plane.fly();
    }
}
