package red.patterns.behavioural.template.method;

/**
 * @author Daniil Shreyder
 * Date: 20.07.2021
 */
public abstract class Transport {
    protected boolean hasFuel;

    public abstract void fillFuelTank();

    public abstract void moveToDestination(long pathLength, int passengers);

    public final void deliverPassengers(long pathLength, int passengers) {
        fillFuelTank();
        moveToDestination(pathLength, passengers);
    }
}
