package red.patterns.structural.flyweight;

import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.stream.Stream;

/**
 * @author Daniil Shreyder
 * Date: 19.07.2021
 */
public class FlyweightGeneral {
    // WARNING!!! Running this will eat AT MOST 3 Gigabytes of RAM and 100% Processor time at the start until cache gets filled
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        RouteFactory routeFactory = new RouteFactory();
        List<Route> routeList = new CopyOnWriteArrayList<>();
        long start = System.nanoTime();
        Runnable runnable = () -> {
            for (int i = 0; i < 100000; i++) {
                Map<String, String> garbage = new ConcurrentHashMap<>();
                Stream.generate(() -> "OfweoipfWIOEJFPWEIFHwefowef" + new Random().nextLong()).limit(1000)
                        .parallel()
                        .forEach(x -> garbage.put(x + new Random().nextInt(2048), x));
                routeList.add(routeFactory
                        .createRoute(
                                new Airplane(
                                        "Airplane" + new Random().nextInt(2048),
                                        (int) new Random().nextLong(),
                                        garbage,
                                        new Random().nextDouble() * 1000d,
                                        new Random().nextDouble() * 1000d
                                )
                        )
                );
                System.out.println(100000 - i);
            }
        };

        CompletableFuture.runAsync(runnable).get();

        System.out.println("Congratulations! You waited through this. It took - " + (System.nanoTime() - start) / 1000000000 + " seconds") ;
        System.out.println("Filled RAM with ~1.6 Gigabytes of Route & Airplane data");
        System.out.println("Garbage size 1.000");
        System.out.println("Flyweight cache size " + routeFactory.cacheSize());
        System.out.println("Number of routes " + routeList.size());
        Thread.sleep(50000);
    }
}
