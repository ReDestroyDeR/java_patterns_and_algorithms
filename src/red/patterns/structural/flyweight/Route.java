package red.patterns.structural.flyweight;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class Route {
    private AirplaneFlyweight airplane;
    private double longitude, latitude;

    public AirplaneFlyweight getAirplane() {
        return airplane;
    }

    public void setAirplane(AirplaneFlyweight airplane) {
        this.airplane = airplane;
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
        return "Route{" +
                "airplane=" + airplane +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                '}';
    }
}
