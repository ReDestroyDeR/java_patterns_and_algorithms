package red.patterns.structural.adapter;

import java.util.Arrays;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public record AlienString(byte[] content) {
    @Override
    public String toString() {
        return "AlienString{" +
                "content=" + Arrays.toString(content) +
                '}';
    }
}
