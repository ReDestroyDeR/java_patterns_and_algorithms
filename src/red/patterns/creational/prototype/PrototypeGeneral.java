package red.patterns.creational.prototype;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class PrototypeGeneral {

    public static void main(String[] args) {
        Target target = new Target();
        target.setName("Desired Name");
        target.setAge(0x1F);

        Target child = new Target();
        child.setName("Kid");
        child.setAge(5);

        target.setChild(child);

        System.out.println("Source Target: ");
        System.out.println(target);

        Target clone = target.clone();
        System.out.println("Cloned Target: ");
        System.out.println(clone);

        System.out.println("Target equals Clone? " + target.equals(clone));
    }
}
