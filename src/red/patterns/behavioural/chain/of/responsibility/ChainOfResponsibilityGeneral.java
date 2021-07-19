package red.patterns.behavioural.chain.of.responsibility;

import java.util.List;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class ChainOfResponsibilityGeneral {
    private static RequestFilter entry;

    public static void main(String[] args) {
        initializeChain();
        List.of(
                new Request("bad", "John", "Guest"),
                new Request("255.255.255.255", "John", "Guest"),
                new Request("255.255.255.", "John", "Guest"),
                new Request("255.255.255.2", "John", "Guest"),
                new Request("0.0.0.0", "John", "Guest"),
                new Request("164.234.54.78", "John", "Guest"),
                new Request("164.234.54.78", "Ryan", "Guest"),
                new Request("164.234.54.78", "Ryan", "User")
        ).forEach(request ->
        {
            try {
                entry.doFilter(request);
            } catch (FilterException e) {
                System.err.println(e.getMessage());
            }
        });
    }

    public static void initializeChain() {
        AbstractRequestFilter ipFilter = new IpFilter();
        AbstractRequestFilter nameFilter = new NameFilter();
        AbstractRequestFilter roleFilter = new RoleFilter();
        entry = ipFilter;
        ipFilter.setNext(nameFilter);
        nameFilter.setNext(roleFilter);
    }
}
