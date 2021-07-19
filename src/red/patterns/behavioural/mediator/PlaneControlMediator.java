package red.patterns.behavioural.mediator;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Daniil Shreyder
 * Date: 20.07.2021
 */
public class PlaneControlMediator implements Mediator {
    private Set<Plane> planeSet = new HashSet<>();

    public void addPlane(Plane plane) {
        planeSet.add(plane);
    }

    public void removePlane(Plane plane) {
        planeSet.remove(plane);
    }



    @Override
    public void notify(Sender sender, String event) {
        if (!(sender instanceof Plane))
            return;

        if (event.equals("landing")) {

        }
    }
}
