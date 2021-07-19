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
public class NoFlyweightGeneral {
    // WARNING!!! This algorithm will lag out your computer until JVM crashes
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        List<Airplane> airplaneList = new CopyOnWriteArrayList<>();
        Runnable runnable = () -> {
            for (int i = 0; i < 100000; i++) {
                Map<String, String> garbage = new ConcurrentHashMap<>();
                Stream.generate(() -> "OfweoipfWIOEJFPWEIFHwefowef" + new Random().nextLong()).limit(1000)
                        .parallel()
                        .forEach(x -> garbage.put(x + new Random().nextInt(2048), x));
                airplaneList.add(
                        new Airplane(
                                "Airplane" + new Random().nextInt(2048),
                                (int) new Random().nextLong(),
                                garbage,
                                new Random().nextDouble() * 1000d,
                                new Random().nextDouble() * 1000d
                        )
                );
                System.out.println(100000 - i);
            }
        };

        // Program stops doing work resulting in livelock when one of the workers gets OutOfMemoryError.
        CompletableFuture.runAsync(runnable).get();

        System.out.println(airplaneList.size());
        System.out.println("Can't reach here because we get out of memory / CPU time");
        Thread.sleep(10000);
    }
}
