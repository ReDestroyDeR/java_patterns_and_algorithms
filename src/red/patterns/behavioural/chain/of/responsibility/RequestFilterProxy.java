package red.patterns.behavioural.chain.of.responsibility;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class RequestFilterProxy implements RequestFilter {
    @Override
    public void doFilter(Request request) {
        System.out.println("Reached RequestFilterProxy! Your " + request + " is good");
    }
}
