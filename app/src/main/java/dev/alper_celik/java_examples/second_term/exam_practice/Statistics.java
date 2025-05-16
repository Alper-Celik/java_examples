package dev.alper_celik.java_examples.second_term.exam_practice;

import java.util.Scanner;

public class Statistics {
  private int count = 0;
  private int sum = 0;

  public void addNumber(int num) {
    this.count++;
    this.sum += num;
  }

  public int getCount() {
    return this.count;
  }

  public int sum() {
    return this.sum;
  }

  public double avarage() {
    if (this.count == 0) {
      return 0;
    }
    return (double) this.sum / (double) this.count;
  }

  public enum SumType {
    EVEN,
    ODD,
    ALL
  }

  public static int sumOfUserProvidedNumbers(Scanner scan) {
    return sumOfUserProvidedNumbers(scan, SumType.ALL);
  }

  public static int sumOfUserProvidedNumbers(Scanner scan, SumType sm) {
    var st = new Statistics();
    while (true) {
      int num = scan.nextInt();

      if (num == -1) {
        break;
      }
      switch (sm) {
        case EVEN:
          if (num % 2 == 0) {
            st.addNumber(num);
          }
          break;

        case ODD:
          if (num % 2 == 1) {
            st.addNumber(num);
          }
          break;

        case ALL:
          st.addNumber(num);
          break;
      }
    }
    return st.sum();

  }

}
