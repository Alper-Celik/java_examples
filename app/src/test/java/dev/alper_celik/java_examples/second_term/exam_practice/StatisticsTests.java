package dev.alper_celik.java_examples.second_term.exam_practice;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Scanner;

import org.junit.jupiter.api.Test;

class StatisticsTests {

  @Test
  void countTest() {
    var st = new Statistics();
    st.addNumber(0);
    st.addNumber(0);
    st.addNumber(0);
    assertEquals(3, st.getCount());
  }

  @Test
  void sumTest() {
    var st = new Statistics();
    st.addNumber(5);
    st.addNumber(12);
    st.addNumber(3);
    assertEquals(20, st.sum());
  }

  @Test
  void avarageTest() {
    var st = new Statistics();
    st.addNumber(5);
    st.addNumber(12);
    st.addNumber(3);
    st.addNumber(4);
    assertEquals(6, st.avarage());
  }

  @Test
  void userInputTest() {
    String userInput = "5 10 20 -1";
    assertEquals(35, Statistics.sumOfUserProvidedNumbers(new Scanner(userInput)));
    assertEquals(5, Statistics.sumOfUserProvidedNumbers(new Scanner(userInput), Statistics.SumType.ODD));
    assertEquals(30, Statistics.sumOfUserProvidedNumbers(new Scanner(userInput), Statistics.SumType.EVEN));
  }
}
