package red.patterns.structural.decorator;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class WarnNotification implements Notification {
    private Notification notification;
    private final String message;

    public WarnNotification(String message) {
        this.message = message;
    }

    public WarnNotification(Notification notification, String message) {
        this.notification = notification;
        this.message = message;
    }

    @Override
    public void sendNotification() {
        if (notification != null)
            notification.sendNotification();

        System.out.println("[WARN] " + message);

    }
}
