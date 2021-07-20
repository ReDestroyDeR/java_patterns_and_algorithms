package red.patterns.behavioural.strategy;

/**
 * @author Daniil Shreyder
 * Date: 20.07.2021
 */
public record Button(OnClickStrategy onClickStrategy) {

    public void onClick() {
        onClickStrategy.onClick();
    }
}
