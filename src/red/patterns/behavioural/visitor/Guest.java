package red.patterns.behavioural.visitor;

/**
 * @author Daniil Shreyder
 * Date: 20.07.2021
 */
public class Guest {
    private String name;

    public Guest(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "name='" + name + '\'' +
                '}';
    }
}
