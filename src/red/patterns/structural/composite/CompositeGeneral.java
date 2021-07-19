package red.patterns.structural.composite;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class CompositeGeneral {
    public static void main(String[] args) throws InterruptedException {
        Product airpods = new Product("Airpods", 13000);
        Product check = new Product("Check", 0);
        Product phone = new Product("iPhone", 120000);
        Product speaker = new Product("JBL Speaker", 5000);
        Product microphone = new Product("HyperX Quad cast", 7000);

        Box castBox = new Box(speaker, microphone);
        Box appleBox = new Box(airpods, phone);
        Box biggerBox = new Box(castBox, appleBox, check);

        System.out.println("Total price: " + biggerBox.getPrice());
        Thread.sleep(500);
        System.out.println("Contents:" + biggerBox);
    }
}
