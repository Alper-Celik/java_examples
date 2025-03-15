package dev.alper_celik.java_examples;

import java.util.concurrent.*;

import dev.alper_celik.java_examples.second_term.*;
import dev.alper_celik.java_examples.utils.ArrayUtils;
import dev.alper_celik.java_examples.utils.MethodUtils;

public class App {

  public static void main(String[] args) throws InterruptedException, ExecutionException {
    Integer[] arr = Sorting.generate_random_array(100_000_000, Integer.MIN_VALUE, Integer.MAX_VALUE);
    // System.out.println(ArrayUtils.arrayToString(arr));
    var dur = MethodUtils.execution_time_of(() -> {
      try {
        Sorting.merge_sort(arr);
      } catch (InterruptedException | ExecutionException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    });
    System.out.println(dur);
    // System.out.println(ArrayUtils.arrayToString(arr));
  }
}
