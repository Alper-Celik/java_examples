package dev.alper_celik.java_examples.Util;

import org.junit.jupiter.api.Test;

import dev.alper_celik.java_examples.utils.ArrayUtils;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class ArrayUtilsTests {

  @Test
  void isSortedFromMinToMax_test() {
    assertTrue(ArrayUtils.isSortedFromMinToMax(new Integer[] { 1, 4, 20, 25 }));
    assertTrue(!ArrayUtils.isSortedFromMinToMax(new Integer[] { 1, 4, 20, 30, 25 }));
  }

  @Test
  void arrayToString_test() {
    assertEquals("[ 1, 2, 5, 10 ]", ArrayUtils.arrayToString(List.of(1, 2, 5, 10)));
  }
}
