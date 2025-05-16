package dev.alper_celik.java_examples.second_term;

import static org.junit.jupiter.api.Assertions.*;

import java.util.function.Function;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import dev.alper_celik.java_examples.utils.ArrayUtils;

class SortingTests {
  static Stream<Function<Integer[], Integer[]>> methodProvider() {
    return Stream.of(
        ((x) -> Sorting.insertion_sort(x)),
        ((x) -> Sorting.bouble_sort(x)),
        ((x) -> Sorting.merge_sort(x)));
  }

  @ParameterizedTest
  @MethodSource("methodProvider")
  void sortingTests(Function<Integer[], Integer[]> fun) {
    var random_array = ArrayUtils.generate_random_array(50_000, Integer.MIN_VALUE, Integer.MAX_VALUE);
    assertTrue(ArrayUtils.isSortedFromMinToMax(fun.apply(random_array)));
  }
}
