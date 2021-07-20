package red.patterns.behavioural.template.method;

/**
 * @author Daniil Shreyder
 * Date: 20.07.2021
 */
public class Plane extends Transport {
    @Override
    public void fillFuelTank() {
        this.hasFuel = true;
    }

    @Override
    public void moveToDestination(long pathLength, int passengers) {
        if (!hasFuel)
            throw new IllegalStateException("No fuel to fly");

        if (pathLength * passengers / 2 > 10000)
            throw new IllegalArgumentException("Plane will crash with these inputs");

        hasFuel = false;
        System.out.println("Successfully delivered " + passengers + " passengers for " + pathLength + " meters");
    }
}
