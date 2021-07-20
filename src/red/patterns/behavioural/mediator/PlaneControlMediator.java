package red.patterns.behavioural.mediator;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Daniil Shreyder
 * Date: 20.07.2021
 */
public class PlaneControlMediator implements Mediator {
    private final Set<Sender> senderSet = new HashSet<>();

    public void addSender(Sender sender) {
        senderSet.add(sender);
        System.out.println("Added " + sender);
    }

    public void removeSender(Sender sender) {
        senderSet.remove(sender);
        System.out.println("Removed " + sender);
    }

    @Override
    public void mediateEvent(Sender sender, String event) {
        senderSet.stream()
                .filter(s -> !s.equals(sender))
                .forEach(s -> s.processEvent(sender, event));
    }

    @Override
    public String toString() {
        return "PlaneControlMediator{" +
                "senderSet=" + senderSet.size() +
                '}';
    }
}
