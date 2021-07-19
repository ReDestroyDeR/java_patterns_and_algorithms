package red.patterns.behavioural.command;

import red.patterns.structural.facade.Base64Facade;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class EncodeCommand implements Command {
    @Override
    public String execute(String data, boolean utf8) {
        return (utf8)
                ? Base64Facade.encodeUTF8String(data)
                : Base64Facade.encodeUTF16String(data);
    }
}
