package red.patterns.behavioural.chain.of.responsibility;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public interface RequestFilter {
    void doFilter(Request request);
}
