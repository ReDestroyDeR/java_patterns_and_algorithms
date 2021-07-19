package red.patterns.creational.factory.alpha.model;

import java.util.Objects;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class Engine {
    private String model;
    private Double power;
    private Double mass;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Double getPower() {
        return power;
    }

    public void setPower(Double power) {
        this.power = power;
    }

    public Double getMass() {
        return mass;
    }

    public void setMass(Double mass) {
        this.mass = mass;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return model.equals(engine.model) && power.equals(engine.power) && mass.equals(engine.mass);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, power, mass);
    }

    @Override
    public String toString() {
        return "Engine{" +
                "model='" + model + '\'' +
                ", power=" + power +
                ", mass=" + mass +
                '}';
    }
}
