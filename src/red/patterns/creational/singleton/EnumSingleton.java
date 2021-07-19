package red.patterns.creational.singleton;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public enum EnumSingleton {
    INSTANCE1,
    INSTANCE2;

    private String stringField;

    public String getStringField() {
        return stringField;
    }

    public void setStringField(String stringField) {
        this.stringField = stringField;
    }
}
