package red.patterns.creational.builder;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class BuilderGeneral {
    public static void main(String[] args) {
        // Builder in a Setter Fashion
        User user = new User()
                .setAge(5)
                .setFather(new User()
                    .setName("Father")
                    .setAge(69)
                    .setHeight(169.53))
                .setMother(new User()
                    .setName("Mother")
                    .setAge(42)
                    .setHeight(180.2))
                .setHeight(65.2)
                .setName("Joshua");

        // Builder Like Top-Level class fashion
        OldUser oldUser = new OldUserBuilder()
                .setAge(5)
                .setFather(new OldUserBuilder()
                        .setName("Father")
                        .setAge(69)
                        .setHeight(169.53)
                        .build())
                .setMother(new OldUserBuilder()
                        .setName("Mother")
                        .setAge(42)
                        .setHeight(180.2)
                        .build())
                .setHeight(65.2)
                .setName("Joshua")
                .build();

        System.out.println(user);
        System.out.println(oldUser);
    }
}
