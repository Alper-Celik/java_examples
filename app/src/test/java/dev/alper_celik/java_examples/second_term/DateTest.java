package dev.alper_celik.java_examples.second_term;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DateTest {

  @Test
  void increment_day() {
    var date = new Date(2024, 1, 1);
    assertEquals("2024-1-1", date.getDate());
    date.nextDay();
    assertEquals("2024-1-2", date.getDate());
  }

  @Test
  void increment_month() {
    var date = new Date(2024, 1, 30);
    assertEquals("2024-1-30", date.getDate());
    date.nextDay();
    assertEquals("2024-2-1", date.getDate());
  }

  @Test
  void increment_year() {
    var date = new Date(2024, 12, 30);
    assertEquals("2024-12-30", date.getDate());
    date.nextDay();
    assertEquals("2025-1-1", date.getDate());
  }

}
