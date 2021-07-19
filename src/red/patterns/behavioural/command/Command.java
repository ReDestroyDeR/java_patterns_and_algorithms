package red.patterns.behavioural.command;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public interface Command {
    String execute(String data, boolean utf8);
}
