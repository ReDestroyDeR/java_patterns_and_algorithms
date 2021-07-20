package red.patterns.behavioural.memento;

/**
 * @author Daniil Shreyder
 * Date: 20.07.2021
 */
public class Memento {
    private String user;

    public Memento(String name, int age) {
        user = name + "|%|" + age;
    }

    public String getName() {
        return user.split("[|][%][|]")[0];
    }

    public int getAge() {
        return Integer.parseInt(user.split("[|][%][|]")[1]);
    }

    @Override
    public String toString() {
        return "Memento{" +
                "user='" + user + '\'' +
                '}';
    }
}
