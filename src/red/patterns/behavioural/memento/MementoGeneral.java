package red.patterns.behavioural.memento;

/**
 * @author Daniil Shreyder
 * Date: 20.07.2021
 */
public class MementoGeneral {
    public static void main(String[] args) {
        User user = new User("John", 28);
        Memento memento = User.save(user);
        System.out.println("Created user " + user);
        System.out.println("Memento for it " + memento);
        System.out.println("Restored User from Memento " + User.restore(memento));
    }
}
