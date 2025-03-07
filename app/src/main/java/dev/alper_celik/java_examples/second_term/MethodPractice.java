package dev.alper_celik.java_examples.second_term;

import dev.alper_celik.java_examples.utils.*;

public class MethodPractice {// hafta 1
  public static void print_sum(int a, int b) {
    System.out.println(a + b);
  }

  public static double print_avg(long N) {
    double acc = 0;
    for (long i = 1; i <= N; i++) {
      acc += i;
    }
    return acc / (double) N;
  }

  public static void print_array_sum(int[] array) {
    long sum = 0;
    for (int i : array) {
      sum += i;
    }
    System.out.println(sum);
  };

  public static double array_avg(int[] array) {
    long sum = 0;
    for (int i : array) {
      sum += i;
    }

    return sum / (double) array.length;
  }

  public static int array_min(int[] array) {
    int min = array[0];
    for (int i : array) {
      if (min > i) {
        min = i;
      }
    }

    return min;
  }

  public static int array_max(int[] array) {
    int max = array[0];
    for (int i : array) {
      if (max < i) {
        max = i;
      }
    }

    return max;
  }

  public static Float[] add_vectors(Float[] lhs, Float[] rhs) {

    if (lhs.length != rhs.length) {
      throw new IllegalArgumentException();
    }
    var out = new Float[lhs.length];

    for (int i = 0; i < lhs.length; i++) {
      out[i] = lhs[i] + rhs[i];
    }

    return out;
  }

  public static float dot_product(Float[] lhs, Float[] rhs) {

    if (lhs.length != rhs.length) {
      throw new IllegalArgumentException();
    }
    float out = 0;

    for (int i = 0; i < lhs.length; i++) {
      out += lhs[i] * rhs[i];
    }

    return out;
  }

  public static Float[] matrix_min_of_columns(Float[][] matrix) {
    int column_length = matrix[0].length;
    for (Float[] i : matrix) {
      if (i.length != column_length) {
        throw new IllegalArgumentException("input isn't a matrix");
      }
    }

    var out = new Float[matrix.length];

    for (int column_index = 0; column_index < matrix.length; column_index++) {
      Float min_column = matrix[column_index][0];
      for (Float column_element : matrix[column_index]) {
        if (min_column > column_element) {
          min_column = column_element;
        }
      }
      out[column_index] = min_column;
    }

    return out;
  }

  public static Float[] matrix_max_of_rows(Float[][] matrix) {
    int column_length = matrix[0].length;
    for (Float[] i : matrix) {
      if (i.length != column_length) {
        throw new IllegalArgumentException("input isn't a matrix");
      }
    }

    var out = new Float[matrix[0].length];

    for (int row_index = 0; row_index < column_length; row_index++) {
      Float max_row = matrix[0][row_index];

      for (int column_index = 0; column_index < matrix.length; column_index++) {
        if (max_row < matrix[column_index][row_index]) {
          max_row = matrix[column_index][row_index];
        }
      }

      out[row_index] = max_row;
    }

    return out;
  }

  public static void main(String[] args) {
    // sum_of_odd_even();
    MethodPractice.print_sum(5, 10); // example 1
    System.out.println(MethodPractice.print_avg(10)); // example 2
    int[] array = { 1, 5, 6, 2, 3 };
    MethodPractice.print_array_sum(array);// example 3
    System.out.println(MethodPractice.array_avg(array));// example 4
    System.out.println(MethodPractice.array_min(array)); // example 5
    System.out.println(MethodPractice.array_max(array)); // example 6

    Float[] vec1 = { 5f, 6f, 5.5f };
    Float[] vec2 = { 4f, 6f, 0f };
    Float[] vecsum = MethodPractice.add_vectors(vec1, vec2);
    System.out.println(ArrayUtils.arrayToString(vecsum)); // example 7
    System.out.println(MethodPractice.dot_product(vec1, vec2)); // example 8

    Float[][] matrix1 = {
        { 1f, 5f, 4f, 6f },
        { 10f, 5f, 4f, 3f },
        { 2f, 5f, 40f, 6f },
        // { 1f, 55f, 44f, 6f }
    };
    System.out.println(ArrayUtils.arrayToString(MethodPractice.matrix_min_of_columns(matrix1)));// example 9
    System.out.println(ArrayUtils.arrayToString(MethodPractice.matrix_max_of_rows(matrix1)));// example 10

  }
}