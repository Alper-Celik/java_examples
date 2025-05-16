package dev.alper_celik.java_examples.second_term.exam_practice;

public class Gauge {
  private int value;

  public Gauge() {
    value = 0;
  }

  public void increase() {
    value++;
  }

  public void decrese() {
    value--;
  }

  public int value() {
    return value;
  }

  public boolean full() {
    return value == 5;
  }
}
