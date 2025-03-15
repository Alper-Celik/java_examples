package dev.alper_celik.java_examples;

import dev.alper_celik.java_examples.second_term.*;
import dev.alper_celik.java_examples.utils.ArrayUtils;
import dev.alper_celik.java_examples.utils.MethodUtils;

public class App {

  public static void main(String[] args) {
    Integer[] arr = Sorting.generate_random_array(100000000, Integer.MIN_VALUE, Integer.MAX_VALUE);
    // System.out.println(ArrayUtils.arrayToString(arr));
    var dur = MethodUtils.execution_time_of(() -> Sorting.merge_sort(arr));
    System.out.println(dur);
    // System.out.println(ArrayUtils.arrayToString(arr));
  }
}
