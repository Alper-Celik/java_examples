package dev.alper_celik.java_examples;

import dev.alper_celik.java_examples.second_term.*;
import dev.alper_celik.java_examples.utils.ArrayUtils;

public class App {

  public static void main(String[] args) {
    Integer[] arr = { 1, 9, 1, 4, 3, 6, 4, 8, 7 };
    System.out.println(ArrayUtils.arrayToString(arr));
    Sorting.bouble_sort(arr);
    System.out.println(ArrayUtils.arrayToString(arr));
  }
}
