package red.patterns.behavioural.chain.of.responsibility;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class NameFilter extends AbstractRequestFilter {
    @Override
    public void doFilter(Request request) {
        if (request.name().equals("John"))
            throw new FilterException("Bad Name for " + request);
        next.doFilter(request);
    }
}
