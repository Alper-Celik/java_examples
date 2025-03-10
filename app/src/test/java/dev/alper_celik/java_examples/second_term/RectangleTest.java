package dev.alper_celik.java_examples.second_term;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
  @Test
  void RectanglePerimiterTest() {
    var rect = new Rectangle(5, 10);
    assertEquals(30, rect.getPerimeter());
  }

  @Test
  void RectangleAreaTest() {
    var rect = new Rectangle(5, 10);
    assertEquals(50, rect.getArea());
  }

  @Test
  void RectangleInfoTest() {
    var rect = new Rectangle(5, 10);
    assertTrue(rect.getInfo().contains("width: 10.000000, height: 5.000000"));
    assertTrue(rect.getInfo().contains("area: 50.000000, perimiter: 30.000000"));
  }

}
