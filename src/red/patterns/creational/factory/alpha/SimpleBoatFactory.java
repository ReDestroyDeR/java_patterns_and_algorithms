package red.patterns.creational.factory.alpha;

import red.patterns.creational.factory.alpha.model.Boat;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class SimpleBoatFactory implements BoatFactory {
    @Override
    public Boat createBoat() {
        Boat boat = new Boat();
        boat.setModel("Generic Wooden Boat");
        boat.setLength(2.0);
        boat.setWidth(.7);
        boat.setDepth(.5);
        return boat;
    }
}
