package red.patterns.behavioural.chain.of.responsibility;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class RoleFilter extends AbstractRequestFilter {
    @Override
    public void doFilter(Request request) {
        if (request.role().equals("Guest"))
            throw new FilterException("Bad Role for " + request);
        next.doFilter(request);
    }
}
