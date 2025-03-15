package dev.alper_celik.java_examples.second_term;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Sorting {
  public static Integer[] generate_random_array(int length, int min, int max) {
    var rand = new Random();
    var arr = new Integer[length];

    for (int i = 0; i < arr.length; i++) {
      arr[i] = rand.nextInt(min, max);
    }

    return arr;
  }

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

  public static Integer[] merge_sort(Integer[] arr) {
    return merge_sort_clas.merge_sort(arr);
  }

  private class merge_sort_clas {
    public static Integer[] merge_sort(Integer[] arr) {

      if (arr.length == 2) {
        if (arr[0] > arr[1]) {
          var tmp = arr[0];
          arr[0] = arr[1];
          arr[1] = tmp;
        }
        return arr;
      }

      if (arr.length < 2) {
        return arr;
      }

      var half_arr_right = Arrays.copyOfRange(arr, 0, (arr.length / 2));
      var half_arr_left = Arrays.copyOfRange(arr, (arr.length / 2), arr.length);

      half_arr_right = merge_sort(half_arr_right);
      half_arr_left = merge_sort(half_arr_left);

      return merge(half_arr_right, half_arr_left);
    }

    public static Integer[] merge(Integer[] rhs_arr, Integer[] lhs_arr) {
      var result = new Integer[rhs_arr.length + lhs_arr.length];
      int right_key = 0, left_key = 0;

      for (int i = 0; i < result.length; i++) {

        if (right_key == rhs_arr.length) {
          result[i] = lhs_arr[left_key];
          left_key++;
          continue;
        }
        if (left_key == lhs_arr.length) {
          result[i] = rhs_arr[right_key];
          right_key++;
          continue;
        }

        if (rhs_arr[right_key] < lhs_arr[left_key]) {
          result[i] = rhs_arr[right_key];
          right_key++;
        } else {
          result[i] = lhs_arr[left_key];
          left_key++;
        }
      }

      return result;
    }
  }
}
