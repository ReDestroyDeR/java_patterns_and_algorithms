package red.patterns.behavioural.iterator;

/**
 * @author Daniil Shreyder
 * Date: 20.07.2021
 */
public interface Iterator<T> {
    boolean hasNext();
    T next();
    void remove();
}
