package red.patterns.behavioural.state;

/**
 * @author Daniil Shreyder
 * Date: 20.07.2021
 */
public class Plane {
    private State state;

    public Plane(State state) {
        this.state = state;
    }

    public void changeState() {
        switch (state) {
            case ON_LAND -> state = State.PREPARING_FOR_FLIGHT;
            case PREPARING_FOR_FLIGHT -> state = State.TAKEOFF;
            case TAKEOFF -> state = State.FLYING;
            case FLYING -> state = State.LANDING;
            case LANDING -> state = State.ON_LAND;
            default -> throw new UnknownError();
        }
    }

    @Override
    public String toString() {
        return "Plane{" +
                "state=" + state +
                '}';
    }
}
