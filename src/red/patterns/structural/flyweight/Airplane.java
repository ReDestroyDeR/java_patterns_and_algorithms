package red.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class Airplane {
    private String name;
    private int capacity;
    private Map<String, String> heavyData;
    private double longitude, latitude;

    public Airplane(String name, int capacity, Map<String, String> heavyData, double longitude, double latitude) {
        this.name = name;
        this.capacity = capacity;
        this.heavyData = heavyData;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Map<String, String> getHeavyData() {
        return heavyData;
    }

    public void setHeavyData(HashMap<String, String> heavyData) {
        this.heavyData = heavyData;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "name='" + name + '\'' +
                ", capacity=" + capacity +
                ", heavyData=" + heavyData +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                '}';
    }
}
