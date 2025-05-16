package dev.alper_celik.java_examples.second_term;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class MethodPracticeTests {
  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
  private final PrintStream originalOut = System.out;
  private final PrintStream originalErr = System.err;

  @BeforeEach
  void setUpStreams() {
    outContent.reset();
    errContent.reset();
    System.setOut(new PrintStream(outContent));
    System.setErr(new PrintStream(errContent));
  }

  @AfterEach
  void restoreStreams() {
    System.setOut(originalOut);
    System.setErr(originalErr);
  }

  @Test
  void print_sum_test() {
    MethodPractice.print_sum(5, 3);
    assertEquals("8\n", outContent.toString());
  }

  @Test
  void print_avg_test() {
    assertEquals(3, MethodPractice.print_avg(5));
  }

  @Test
  void print_array_sum_test() {
    int[] array = { 5, 6, 8, 2 };
    MethodPractice.print_array_sum(array);
    assertEquals("21\n", outContent.toString());
  }

  @Test
  void array_avg_test() {
    int[] array = { 1, 2, 3, 4, 5 };
    assertEquals(3, MethodPractice.array_avg(array));
  }

  @Test
  void array_min_test() {
    int[] array = { 5, 6, 8, 5, 4, 3, 9 };
    assertEquals(3, MethodPractice.array_min(array));
  }

  @Test
  void array_max_test() {
    int[] array = { 5, 6, 8, 5, 4, 3, 9 };
    assertEquals(9, MethodPractice.array_max(array));
  }

  @Test
  void add_vectors_test() {
    Float[] vec1 = { 5f, 6f, 5.5f };
    Float[] vec2 = { 3f, 4f, 2.5f };
    assertArrayEquals(new Float[] { 8f, 10f, 8f }, MethodPractice.add_vectors(vec1, vec2));

    Float[] vec2d = { 3f, 4f };
    assertThrowsExactly(IllegalArgumentException.class, () -> MethodPractice.add_vectors(vec1, vec2d));
  }

  @Test
  void dot_product_test() {
    Float[] vec1 = { 5f, 6f, 5.5f };
    Float[] vec2 = { 3f, 4f, 2.5f };
    assertEquals(52.75f, MethodPractice.dot_product(vec1, vec2));

    Float[] vec2d = { 3f, 4f };
    assertThrowsExactly(IllegalArgumentException.class, () -> MethodPractice.dot_product(vec1, vec2d));
  }

  @Test
  void matrix_min_of_columnsmatrix_min_of_columns_test() {
    Float[][] matrix1 = {
        { 1f, 5f, 4f, 6f },
        { 10f, 5f, 4f, 3f },
        { 2f, 5f, 40f, 6f },
    };
    assertArrayEquals(new Float[] { 1f, 3f, 2f }, MethodPractice.matrix_min_of_columns(matrix1));

    Float[][] not_matrix = {
        { 1f, 5f, 4f, 6f },
        { 10f, 5f, 4f, 3f },
        { 2f, 5f, 40f, 6f, 2f },
    };
    assertThrowsExactly(IllegalArgumentException.class, () -> MethodPractice.matrix_min_of_columns(not_matrix));
  }

  @Test
  void matrix_max_of_rows_test() {
    Float[][] matrix1 = {
        { 1f, 5f, 4f, 6f },
        { 10f, 5f, 4f, 3f },
        { 2f, 5f, 40f, 6f },
    };
    assertArrayEquals(new Float[] { 10f, 5f, 40f, 6f }, MethodPractice.matrix_max_of_rows(matrix1));

    Float[][] not_matrix = {
        { 1f, 5f, 4f, 6f },
        { 10f, 5f, 4f, 3f },
        { 2f, 5f, 40f, 6f, 2f },
    };
    assertThrowsExactly(IllegalArgumentException.class, () -> MethodPractice.matrix_max_of_rows(not_matrix));
  }
}
