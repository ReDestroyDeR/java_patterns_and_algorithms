package red.patterns.behavioural.command;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class CommandGeneral {
    public static void main(String[] args) {
        DecodeCommand decodeCommand = new DecodeCommand();
        EncodeCommand encodeCommand = new EncodeCommand();
        String hwUTF8 = encodeCommand.execute("Hello world", true);
        String dUTF8 = encodeCommand.execute("Desert", true);
        String hwUTF16 = encodeCommand.execute("Hello world", false);
        String dUTF16 = encodeCommand.execute("Desert", false);

        System.out.println("Hello world UTF8 Encoded: " + hwUTF8);
        System.out.println("Hello world UTF16 Encoded: " + hwUTF16);
        System.out.println("Desert UTF8 Encoded: " + dUTF8);
        System.out.println("Desert UTF16 Encoded: " + dUTF16);

        System.out.println();
        System.out.println("Decoded from encoded strings with right encodings: ");
        System.out.println(decodeCommand.execute(hwUTF8, true));
        System.out.println(decodeCommand.execute(hwUTF16, false));
        System.out.println(decodeCommand.execute(dUTF8, true));
        System.out.println(decodeCommand.execute(dUTF16, false));
    }
}
