package red.patterns.structural.decorator;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class DecoratorGeneral {
    public static void main(String[] args) {
        Notification error = new ErrorNotification("Some error");
        Notification out = new OutNotification(error, "Some out message");
        Notification warn = new WarnNotification(out, "Some warn message");
        warn.sendNotification();
    }
}
