package red.patterns.creational.factory.alpha;

import red.patterns.creational.factory.alpha.model.Boat;
import red.patterns.creational.factory.alpha.model.Engine;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class YamahaBoatFactory implements BoatFactory, EngineFactory {

    @Override
    public Boat createBoat() {
        Boat boat = new Boat();
        boat.setModel("Yamaha Diesel Powered Boat");
        boat.setLength(3.2);
        boat.setWidth(.9);
        boat.setDepth(.7);
        boat.setEngine(createEngine());
        return boat;
    }

    @Override
    public Engine createEngine() {
        Engine engine = new Engine();
        engine.setModel("Yamaha 2.5 Engine");
        engine.setPower(250d);
        engine.setMass(5.0);
        return engine;
    }
}
