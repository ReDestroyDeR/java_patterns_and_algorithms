package red.patterns.structural.bridge;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class Color {
    private byte R;
    private byte G;
    private byte B;

    public Color() {}

    public Color(int r, int g, int b) {
        setRGB(r, g, b);
    }

    public byte[] getRGB() {
        return new byte[] {R, G, B};
    }

    public void setRGB(Color color) {
        this.R = color.getR();
        this.G = color.getG();
        this.B = color.getB();
    }

    public void setRGB(int R, int G, int B) {
        setR(R);
        setG(G);
        setB(B);
    }

    public byte getR() {
        return R;
    }

    public void setR(int r) {
        R = unsignedByteToByte(r);
    }

    public byte getG() {
        return G;
    }

    public void setG(int g) {
        G = unsignedByteToByte(g);
    }

    public byte getB() {
        return B;
    }

    public void setB(int b) {
        B = unsignedByteToByte(b);
    }

    private byte unsignedByteToByte(int unsigned) {
        if (unsigned < 0 || unsigned > 255)
            throw new IllegalArgumentException(String.format("Bad color value - %d", unsigned));

        return (byte) (unsigned - 128);
    }

    @Override
    public String toString() {
        return "Color{" +
                "R=" + R +
                ", G=" + G +
                ", B=" + B +
                '}';
    }
}
