package red.patterns.behavioural.memento;

/**
 * @author Daniil Shreyder
 * Date: 20.07.2021
 */
public record User(String name, int age) {

    public static Memento save(User user) {
        return new Memento(user.name, user.age);
    }

    public static User restore(Memento memento) {
        return new User(memento.getName(), memento.getAge());
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
