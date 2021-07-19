package red.patterns.creational.singleton;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class SingletonGeneral {
    public static void main(String[] args) {
        SomeSingleton singleton = SomeSingleton.getINSTANCE();
        singleton.setStringField("peanuts");
        assert SomeSingleton.getINSTANCE().getStringField().equals("peanuts");

        EnumSingleton.INSTANCE1.setStringField("enumPeanuts1");
        assert EnumSingleton.INSTANCE1.getStringField().equals("enumPeanuts1");

        EnumSingleton.INSTANCE2.setStringField("enumPeanuts2");
        assert EnumSingleton.INSTANCE2.getStringField().equals("enumPeanuts2");

        assert !EnumSingleton.INSTANCE1.getStringField().equals(EnumSingleton.INSTANCE2.getStringField());
    }
}
