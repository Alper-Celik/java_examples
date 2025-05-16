package dev.alper_celik.java_examples;

import java.util.concurrent.*;

import dev.alper_celik.java_examples.second_term.*;
import dev.alper_celik.java_examples.utils.ArrayUtils;
import dev.alper_celik.java_examples.utils.MethodUtils;
import dev.alper_celik.java_examples.second_term.forms.user_login;

public class App {

  public static void main(String[] args) throws InterruptedException, ExecutionException {
    // Integer[] arr = ArrayUtils.generate_random_array(100_000_000,
    // Integer.MIN_VALUE, Integer.MAX_VALUE);
    // Integer[] result = null;
    // var dur = MethodUtils.execution_time_of(() -> {
    // return Sorting.merge_sort(arr);
    // });
    // System.out.println(dur.getKey());
    //
    user_login.main(args);
  }
}
