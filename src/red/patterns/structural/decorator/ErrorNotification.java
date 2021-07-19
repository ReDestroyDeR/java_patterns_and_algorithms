package red.patterns.structural.decorator;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class ErrorNotification implements Notification {
    private Notification notification;
    private final String message;

    public ErrorNotification(String message) {
        this.message = message;
    }

    public ErrorNotification(Notification notification, String message) {
        this.notification = notification;
        this.message = message;
    }

    @Override
    public void sendNotification() {
        if (notification != null)
            notification.sendNotification();

        System.err.println(message);
    }
}
