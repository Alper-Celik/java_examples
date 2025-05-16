package dev.alper_celik.java_examples.second_term;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class WhistleTests {
  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  private final PrintStream originalOut = System.out;

  @BeforeEach
  void setUpStreams() {
    outContent.reset();
    System.setOut(new PrintStream(outContent));
  }

  @AfterEach
  void restoreStreams() {
    System.setOut(originalOut);
  }

  @Test
  void Whistle_test() {
    Whistle duckWhistle = new Whistle("Kvaak");
    Whistle roosterWhistle = new Whistle("Peef");

    duckWhistle.sound();
    assertEquals("Kvaak\n", outContent.toString());
    outContent.reset();

    roosterWhistle.sound();
    assertEquals("Peef\n", outContent.toString());
    outContent.reset();

    duckWhistle.sound();
    assertEquals("Kvaak\n", outContent.toString());
    outContent.reset();

  }

}
