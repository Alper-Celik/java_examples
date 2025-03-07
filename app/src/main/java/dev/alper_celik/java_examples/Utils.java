package dev.alper_celik.java_examples;

import java.util.List;

public class Utils {
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
