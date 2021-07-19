package red.patterns.behavioural.iterator;

/**
 * @author Daniil Shreyder
 * Date: 20.07.2021
 */
public class IteratorGeneral {
    public static void main(String[] args) {
        Array<String> array = new Array<>();
        for (int i = 0; i < 15; i++) {
            array.add("Test String in Array " + (i + 1));
        }

        System.out.println("Array capacity: " + array.capacity());
        System.out.println("Array size: " + array.size());
        array.remove(5);
        System.out.println("Removed 6'th element - size: " + array.size());

        Iterator<String> iterator = array.iterator();
        while (iterator.hasNext()) {
            System.out.println("Iterator walking! Got: " + iterator.next());
            iterator.remove();
            System.out.println("Removed!");
        }

        System.out.println("Array capacity: " + array.capacity());
        System.out.println("Array size: " + array.size());


        // Let's get concurrent exception here
        System.out.println("Concurrent modification exception");
        for (int i = 0; i < 10; i++) {
            array.add("Test String in Array " + (i + 1));
            System.out.println("Added: " + array.get(i));
        }

        System.out.println("Created iterator");
        iterator = array.iterator();
        array.remove(5);
        System.out.println("Removed index 5 via array.remove()");
        while (iterator.hasNext()) {
            System.out.println("Calling iterator.next()");
            iterator.next();
        }
    }
}
