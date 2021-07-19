package red.patterns.creational.builder;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class OldUserBuilder {
    private final OldUser oldUser = new OldUser();

    public OldUserBuilder setName(String name) {
        oldUser.setName(name);
        return this;
    }

    public OldUserBuilder setAge(int age) {
        oldUser.setAge(age);
        return this;
    }

    public OldUserBuilder setHeight(double height) {
        oldUser.setHeight(height);
        return this;
    }

    public OldUserBuilder setFather(OldUser father) {
        oldUser.setFather(father);
        return this;
    }

    public OldUserBuilder setMother(OldUser mother) {
        oldUser.setMother(mother);
        return this;
    }

    public OldUser build() {
        return oldUser;
    }
}
