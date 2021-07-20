package red.patterns.behavioural.mediator;

/**
 * @author Daniil Shreyder
 * Date: 20.07.2021
 */
public class PlaneGeneral {
    public static void main(String[] args) {
        PlaneControlMediator mediator = new PlaneControlMediator();
        Sender plane1 = new Plane(mediator, "FLIGHT-ABC");
        Sender plane2 = new Plane(mediator, "FLIGHT-CDE");
        Sender plane3 = new Plane(mediator, "FLIGHT-OEM");
        mediator.addSender(plane1);
        mediator.addSender(plane2);
        mediator.addSender(plane3);
        plane1.postEvent("mate I just posted my first event");
        System.out.println();
        plane2.postEvent("here is the second one");
        System.out.println();
        mediator.removeSender(plane1);
        plane3.postEvent("and the last, third");
    }
}
