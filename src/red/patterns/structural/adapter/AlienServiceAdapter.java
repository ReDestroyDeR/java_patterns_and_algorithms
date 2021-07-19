package red.patterns.structural.adapter;

import java.nio.charset.StandardCharsets;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public record AlienServiceAdapter(AlienService alienService) implements IAlienService {

    @Override
    public void alienEnhancedMethod(String string) {
        AlienString alienString = new AlienString(string.getBytes(StandardCharsets.UTF_8));
        alienService.alienServiceMethod(alienString);
    }
}
