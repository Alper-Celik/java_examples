package dev.alper_celik.java_examples.utils;

import java.util.List;
import java.util.Random;

public class ArrayUtils {
  public static Integer[] generate_random_array(int length, int min, int max) {
    var rand = new Random();
    var arr = new Integer[length];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = rand.nextInt(min, max);
    }

    return arr;
  }

  public static boolean isSortedFromMinToMax(Integer[] arr) {
    for (int i = 0; i <= arr.length - 2; i++) {
      if (arr[i] > arr[i + 1])
        return false;
    }
    return true;
  }

  public static <T> String arrayToString(T[] array) {
    var sb = new StringBuilder();
    sb.append("[ ");
    for (int i = 0; i < array.length; i++) {
      sb.append(array[i]);
      if (i != (array.length - 1)) {
        sb.append(", ");
      }
    }
    sb.append(" ]");
    return sb.toString();
  }

  public static <T> String arrayToString(List<T> list) {
    return arrayToString(list.toArray());
  }
}
