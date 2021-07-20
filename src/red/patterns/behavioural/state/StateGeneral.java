package red.patterns.behavioural.state;

/**
 * @author Daniil Shreyder
 * Date: 20.07.2021
 */
public class StateGeneral {
    public static void main(String[] args) {
        Plane plane = new Plane(State.ON_LAND);
        System.out.println(plane);
        for (int i = 0; i < 10; i++) {
            plane.changeState();
            System.out.println(plane);
        }
    }
}
