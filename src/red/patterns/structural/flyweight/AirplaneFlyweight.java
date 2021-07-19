package red.patterns.structural.flyweight;


import java.util.Map;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public record AirplaneFlyweight(String name, int capacity, Map<String, String> heavyData) {
    @Override
    public String toString() {
        return "Airplane{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", heavyData=" + heavyData +
                '}';
    }
}
