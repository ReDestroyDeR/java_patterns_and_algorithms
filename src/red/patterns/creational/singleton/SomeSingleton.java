package red.patterns.creational.singleton;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class SomeSingleton {
    private static final SomeSingleton INSTANCE = new SomeSingleton();
    private String stringField;

    private SomeSingleton() {
    }

    public static SomeSingleton getINSTANCE() {
        return INSTANCE;
    }

    public String getStringField() {
        return stringField;
    }

    public void setStringField(String stringField) {
        this.stringField = stringField;
    }
}
