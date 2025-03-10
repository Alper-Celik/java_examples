package dev.alper_celik.java_examples.second_term;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TimeTest {

  @Test
  void incrementBySeconds() {
    var time = new Time(0, 0, 32);

    assertEquals("0:0:32", time.getTime());
    time.incrementBySeconds((60 * 60) + 60 + 1);
    assertEquals("1:1:33", time.getTime());
  }

  @Test
  void incrementBySecond() {
    var time = new Time(0, 0, 32);

    assertEquals("0:0:32", time.getTime());
    time.incrementSecond();
    assertEquals("0:0:33", time.getTime());
  }

  @Test
  void incrementByMinute() {
    var time = new Time(0, 0, 59);

    assertEquals("0:0:59", time.getTime());
    time.incrementSecond();
    assertEquals("0:1:0", time.getTime());
  }

  @Test
  void incrementByHour() {
    var time = new Time(0, 59, 59);

    assertEquals("0:59:59", time.getTime());
    time.incrementSecond();
    assertEquals("1:0:0", time.getTime());
  }

  @Test
  void incrementByDay() {
    var time = new Time(23, 59, 59);

    assertEquals("23:59:59", time.getTime());
    time.incrementSecond();
    assertEquals("0:0:0", time.getTime());
  }

  @Test
  void invalidSecond() {
    var time = new Time(0, 0, 20);

    assertEquals("0:0:20", time.getTime());
    assertThrowsExactly(IllegalArgumentException.class, () -> time.setSecond(60));
    assertEquals("0:0:20", time.getTime());
    assertThrowsExactly(IllegalArgumentException.class, () -> time.setSecond(-1));
    assertEquals("0:0:20", time.getTime());
  }

  @Test
  void invalidMinute() {
    var time = new Time(0, 20, 0);

    assertEquals("0:20:0", time.getTime());
    assertThrowsExactly(IllegalArgumentException.class, () -> time.setMinute(60));
    assertEquals("0:20:0", time.getTime());
    assertThrowsExactly(IllegalArgumentException.class, () -> time.setMinute(-1));
    assertEquals("0:20:0", time.getTime());
  }

  @Test
  void invalidHour() {
    var time = new Time(5, 0, 0);

    assertEquals("5:0:0", time.getTime());
    assertThrowsExactly(IllegalArgumentException.class, () -> time.setHour(24));
    assertEquals("5:0:0", time.getTime());
    assertThrowsExactly(IllegalArgumentException.class, () -> time.setHour(-1));
    assertEquals("5:0:0", time.getTime());
  }
}
