package red.patterns.behavioural.template.method;

/**
 * @author Daniil Shreyder
 * Date: 20.07.2021
 */
public class TemplateMethodGeneral {
    public static void main(String[] args) {
        Transport boat = new Boat();
        Transport plane = new Plane();
        boat.deliverPassengers(100, 5);
        boat.deliverPassengers(100, 6);
        try {
            boat.deliverPassengers(100, 7);
        } catch (Exception e) {
            System.out.println("ERROR " + e.getMessage());
        }
        try {
            plane.deliverPassengers(1000, 100);
        } catch (Exception e) {
            System.out.println("ERROR " + e.getMessage());
        }
        plane.deliverPassengers(1000, 7);
        plane.deliverPassengers(500, 5);
    }
}
