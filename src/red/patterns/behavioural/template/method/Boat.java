package red.patterns.behavioural.template.method;

/**
 * @author Daniil Shreyder
 * Date: 20.07.2021
 */
public class Boat extends Transport {
    @Override
    public void fillFuelTank() {
        // Boat doesn't use fuel
    }

    @Override
    public void moveToDestination(long pathLength, int passengers) {
        if (passengers > 6)
            throw new IllegalArgumentException("Too many passengers!");

        System.out.println("Successfully delivered " + passengers + " passengers for " + pathLength + " meters");
    }
}
