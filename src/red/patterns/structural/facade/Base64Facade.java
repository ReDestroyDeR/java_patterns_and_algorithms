package red.patterns.structural.facade;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class Base64Facade {
    private static final Base64.Encoder encoder = Base64.getEncoder();
    private static final Base64.Decoder decoder = Base64.getDecoder();

    private Base64Facade() {}

    public static String encodeUTF8String(String data) {
        return encoder.encodeToString(data.getBytes(StandardCharsets.UTF_8));
    }

    public static String encodeUTF16String(String data) {
        return encoder.encodeToString(data.getBytes(StandardCharsets.UTF_16));
    }

    public static String decodeUTF8String(String data) {
        return new String(decoder.decode(data.getBytes(StandardCharsets.US_ASCII)), StandardCharsets.UTF_8);
    }

    public static String decodeUTF16String(String data) {
        return new String(decoder.decode(data.getBytes(StandardCharsets.US_ASCII)), StandardCharsets.UTF_16);
    }
}
