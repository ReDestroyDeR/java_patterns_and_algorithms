package red.patterns.structural.bridge;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class BridgeGeneral {
    /**
     * This example is strange because we don't fully implement the <code>Bridge</code> pattern<br>
     * The only thing we <i>bridge</i> is basically {@link Color} into {@link Shape} and that's it<br>
     * The best example of the <code>Bridge</code> pattern is JDBC. It uses it everywhere.<br>
     * JDBC can be considered as a bridge itself because
     * it is an <code>abstraction</code> for a <code>realization</code> of a DBMS Driver.<br><br>
     *
     * P.S. At least we implement the <code>open-closed principle</code>
     *
     * @param args program input data
     */
    public static void main(String[] args) {
        Shape triangle = new Triangle(new int[] {7, 4, 8});
        Shape square = new Square(7);

        System.out.println(triangle);
        System.out.println(square);

        triangle.setColor(Colors.BLUE.color);
        square.setColor(Colors.GREEN.color);

        System.out.println(triangle);
        System.out.println(square);
    }
}
