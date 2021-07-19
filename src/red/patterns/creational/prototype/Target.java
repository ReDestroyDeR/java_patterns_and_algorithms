package red.patterns.creational.prototype;

import java.util.Objects;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */

public class Target implements Cloneable {
    private String name;
    private int age;
    private Target child;

    public Target getChild() {
        return child;
    }

    public void setChild(Target child) {
        this.child = child;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Target target = (Target) o;
        return age == target.age
                && Objects.equals(name, target.name)
                && Objects.equals(child, target.child);
    }

    // I hate checked exceptions
    @Override
    public Target clone() {
        try {
            return (Target) super.clone();
        } catch (CloneNotSupportedException e) {
            // NOT POSSIBLE
            return null;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Target{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", child=" + child +
                '}';
    }
}
