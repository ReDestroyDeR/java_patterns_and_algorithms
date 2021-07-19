package red.patterns.creational.builder;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class OldUser {
    private String name;
    private int age;
    private double height;
    private OldUser father;
    private OldUser mother;

    public OldUser() {}

    // Long...
    public OldUser(String name, int age, double height, OldUser father, OldUser mother) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.father = father;
        this.mother = mother;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public OldUser getFather() {
        return father;
    }

    public void setFather(OldUser father) {
        this.father = father;
    }

    public OldUser getMother() {
        return mother;
    }

    public void setMother(OldUser mother) {
        this.mother = mother;
    }

    @Override
    public String toString() {
        return "OldUser\n{" +
                "\n\t name='" + name + '\'' +
                "\n\t age=" + age +
                "\n\t height=" + height +
                "\n\t father=" + father +
                "\n\t mother=" + mother +
                "\n}";
    }
}
