package red.patterns.creational.factory.alpha;

import red.patterns.creational.factory.alpha.model.Boat;

import java.util.Scanner;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class BoatService {
    public static void main(String[] args) {
        boolean flag;
        System.out.println("Please enter, do you want to have a simple boat or yamaha? (true/false) ");
        Scanner scanner = new Scanner(System.in);
        flag = scanner.nextBoolean();

        BoatFactory factory = (flag) ? new SimpleBoatFactory() : new YamahaBoatFactory();
        Boat boat = factory.createBoat();
        System.out.println(boat.toString());
    }
}
