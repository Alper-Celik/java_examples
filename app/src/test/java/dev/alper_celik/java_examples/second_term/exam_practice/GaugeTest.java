package dev.alper_celik.java_examples.second_term.exam_practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GaugeTest {

  @Test
  void Gauge_test() {
    var gauge = new Gauge();
    assertEquals(0, gauge.value());
    gauge.increase();
    assertEquals(1, gauge.value());

    gauge.increase();
    gauge.increase();
    gauge.increase();
    gauge.increase();
    assertEquals(5, gauge.value());
    assertEquals(true, gauge.full());

    gauge.decrese();
    assertEquals(4, gauge.value());
  }

}
