package red.patterns.behavioural.strategy;

/**
 * @author Daniil Shreyder
 * Date: 20.07.2021
 */
public class StrategyGeneral {
    public static void main(String[] args) {
        Button button = new Button(() -> System.out.println("We made our strategy via functional interface because I am bored"));
        button.onClick();
    }
}
