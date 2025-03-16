package dev.alper_celik.java_examples.utils;

import java.time.Instant;
import java.util.function.Supplier;
import java.time.Duration;

public class MethodUtils {
  public static Pair<Duration, Object> execution_time_of(Supplier metthod) {
    var start_time = Instant.now();
    var result = metthod.get();
    var end_time = Instant.now();
    return new Pair<Duration, Object>(Duration.between(start_time, end_time), (Object) result);
  }
}
