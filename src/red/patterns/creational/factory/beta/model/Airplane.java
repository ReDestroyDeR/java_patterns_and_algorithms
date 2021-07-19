package red.patterns.creational.factory.beta.model;

import java.util.Arrays;
import java.util.Objects;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class Airplane {
    private String airline;
    private String model;
    private FuelType fuelType;
    private final Passenger[] passengers;

    public Airplane(int capacity) {
        passengers = new Passenger[capacity];
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public Passenger[] getPassengers() {
        return passengers;
    }

    public void addPassenger(Passenger passenger) {
        passengers[(int) (Arrays.stream(passengers).count() + 1)] = passenger;
    }

    public void removePassenger(Passenger passenger) {
        for (int i = 0; i < passengers.length; i++) {
            if (passengers[i].equals(passenger)) {
                System.arraycopy(
                        passengers,
                        i + 1,
                        passengers,
                        i,
                        passengers.length - i - 1);
                return;
            }
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airplane airplane = (Airplane) o;
        return airline.equals(airplane.airline)
                && model.equals(airplane.model)
                && fuelType == airplane.fuelType
                && Arrays.equals(passengers, airplane.passengers);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(airline, model, fuelType);
        result = 31 * result + Arrays.hashCode(passengers);
        return result;
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "airline='" + airline + '\'' +
                ", model='" + model + '\'' +
                ", fuelType=" + fuelType +
                ", passengers=" + Arrays.toString(passengers) +
                '}';
    }
}
