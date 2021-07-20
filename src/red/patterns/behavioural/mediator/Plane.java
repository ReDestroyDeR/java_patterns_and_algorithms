package red.patterns.behavioural.mediator;

import java.util.Objects;

/**
 * @author Daniil Shreyder
 * Date: 20.07.2021
 */
public class Plane implements Sender {
    private Mediator mediator;
    private String flight;

    public Plane(Mediator mediator, String flight) {
        this.mediator = mediator;
        this.flight = flight;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public String getFlight() {
        return flight;
    }

    public void setFlight(String flight) {
        this.flight = flight;
    }

    @Override
    public void postEvent(String event) {
        mediator.mediateEvent(this, event);
    }

    @Override
    public void processEvent(Sender sender, String event) {
        // !!!
        System.out.println(this.flight + " received from " + ((Plane) sender).getFlight() + ": " + event);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plane plane = (Plane) o;
        return Objects.equals(mediator, plane.mediator)
                && Objects.equals(flight, plane.flight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mediator, flight);
    }

    @Override
    public String toString() {
        return "Plane{" +
                "mediator=" + mediator +
                ", flight='" + flight + '\'' +
                '}';
    }
}
