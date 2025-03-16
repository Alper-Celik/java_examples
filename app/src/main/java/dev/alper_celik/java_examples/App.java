package dev.alper_celik.java_examples;

import java.util.concurrent.*;

import dev.alper_celik.java_examples.second_term.*;
import dev.alper_celik.java_examples.utils.MethodUtils;

public class App {

  public static void main(String[] args) throws InterruptedException, ExecutionException {
    Integer[] arr = Sorting.generate_random_array(100_000_000, Integer.MIN_VALUE, Integer.MAX_VALUE);
    Integer[] result = null;
    var dur = MethodUtils.execution_time_of(() -> {
      try {
        return Sorting.merge_sort(arr);
      } catch (InterruptedException | ExecutionException e) {
        e.printStackTrace();
      }
      return null;
    });
    System.out.println(dur.getKey());
  }
}
