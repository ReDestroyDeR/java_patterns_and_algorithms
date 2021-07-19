package red.patterns.creational.builder;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class User {
    private String name;
    private int age;
    private double height;
    private User father;
    private User mother;

    public User() {}

    // Long...
    public User(String name, int age, double height, User father, User mother) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.father = father;
        this.mother = mother;
    }

    public String getName() {
        return name;
    }

    public User setName(String name) {
        this.name = name;
        return this;
    }

    public int getAge() {
        return age;
    }

    public User setAge(int age) {
        this.age = age;
        return this;
    }

    public double getHeight() {
        return height;
    }

    public User setHeight(double height) {
        this.height = height;
        return this;
    }

    public User getFather() {
        return father;
    }

    public User setFather(User father) {
        this.father = father;
        return this;
    }

    public User getMother() {
        return mother;
    }

    public User setMother(User mother) {
        this.mother = mother;
        return this;
    }

    @Override
    public String toString() {
        return "User\n{" +
                "\n\t name='" + name + '\'' +
                "\n\t age=" + age +
                "\n\t height=" + height +
                "\n\t father=" + father +
                "\n\t mother=" + mother +
                "\n}";
    }
}
