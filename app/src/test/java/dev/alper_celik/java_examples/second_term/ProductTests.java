package dev.alper_celik.java_examples.second_term;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProductTests {
  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  private final PrintStream originalOut = System.out;

  @BeforeEach
  public void setUpStreams() {
    outContent.reset();
    System.setOut(new PrintStream(outContent));
  }

  @AfterEach
  public void restoreStreams() {
    System.setOut(originalOut);
  }

  @Test
  public void Product_test() {
    Product car = new Product("lux car", 50000, 3);
    car.printProduct();
    assertEquals("lux car,50000.0,3 pcs\n", outContent.toString());

    assertEquals(150000, car.totalPrice());
  }

  @Test
  public void Product_constroctor_test() {
    var prd1 = new Product("car");
    var prd2 = new Product("car", 5);

    assertEquals(1, prd1.getPrice());
    assertEquals(1, prd1.getQuantity());

    prd1.setName("car++");
    prd1.setPrice(2);
    prd1.setQuantity(6);
    assertEquals("car++", prd1.getName());
    assertEquals(2, prd1.getPrice());
    assertEquals(6, prd1.getQuantity());

    assertEquals(1, prd2.getQuantity());
  }

}
