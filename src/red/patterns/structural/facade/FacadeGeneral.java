package red.patterns.structural.facade;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class FacadeGeneral {
    /**
     * Well, Base64 has indeed simple interface but why not...
     *
     * @param args program input data
     */
    public static void main(String[] args) {
        System.out.println("Encoded Hello World (UTF-8) and 䡥汬漠坯牬 (UTF-16)");
        String encoded8 = Base64Facade.encodeUTF8String("Hello World");
        String encoded16 = Base64Facade.encodeUTF16String("䡥汬漠坯牬");

        System.out.println(encoded8);
        System.out.println(encoded16);
        System.out.println();

        System.out.println("Right encodings");
        System.out.println(Base64Facade.decodeUTF8String(encoded8));
        System.out.println(Base64Facade.decodeUTF16String(encoded16));
        System.out.println();

        System.out.println("Wrong encodings");
        System.out.println(Base64Facade.decodeUTF16String(encoded8));
        System.out.println(Base64Facade.decodeUTF8String(encoded16));
    }
}
