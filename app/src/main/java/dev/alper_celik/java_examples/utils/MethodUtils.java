package dev.alper_celik.java_examples.utils;

import java.time.Instant;
import java.time.Duration;

public class MethodUtils {
  public static Duration execution_time_of(Runnable metthod) {
    var start_time = Instant.now();
    metthod.run();
    var end_time = Instant.now();
    return Duration.between(start_time, end_time);
  }
}
