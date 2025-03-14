package dev.alper_celik.java_examples.second_term;

public class Sorting {
  public static void insertion_sort(Integer[] arr) {
    for (int i = 1; i < arr.length; i++) {
      int key = arr[i];
      int j = i - 1;

      while (j >= 0 && arr[j] > key) {
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = key;
    }
  }

  public static void bouble_sort(Integer[] arr) {
    int n = arr.length;

    for (int i = 0; i < n - 1; i++) {
      for (int j = 0; j < n - i - 1; j++) {
        if (arr[j] > arr[j + 1]) {

          int temp = arr[j + 1];
          arr[j + 1] = arr[j];
          arr[j] = temp;

        }
      }
    }
  }
}
