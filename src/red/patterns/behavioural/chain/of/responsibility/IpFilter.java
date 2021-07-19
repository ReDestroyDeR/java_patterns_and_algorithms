package red.patterns.behavioural.chain.of.responsibility;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class IpFilter extends AbstractRequestFilter {
    @Override
    public void doFilter(Request request) {
        if (
                !request.ip().matches("^(([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])(\\.(?!$)|$)){4}$") ||
                request.ip().equals("255.255.255.255") ||
                request.ip().equals("0.0.0.0")
        )
            throw new FilterException("Bad IP for " + request);
        next.doFilter(request);
    }
}
