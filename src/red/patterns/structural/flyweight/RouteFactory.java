package red.patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class RouteFactory {
    private final Map<String, AirplaneFlyweight> cache = new HashMap<>();

    public int cacheSize() {
        return cache.size();
    }

    public Route createRoute(Airplane airplane) {
        AirplaneFlyweight flyweight = cache.putIfAbsent(airplane.getName(),
                new AirplaneFlyweight(
                        airplane.getName(),
                        airplane.getCapacity(),
                        airplane.getHeavyData()
                )
        );
        Route route = new Route();
        route.setAirplane(flyweight);
        route.setLatitude(airplane.getLatitude());
        route.setLongitude(airplane.getLongitude());
        return route;
    }
}
