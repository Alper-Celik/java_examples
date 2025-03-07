package org.example;

public class App {

  public static void main(String[] args) {
    Rectangle rect = new Rectangle(100, 50);
    rect.printInfo();

    var time = new Time(22, 25, 10);
    time.incrementBySeconds(60 * 60);
    time.printTime();
  }
}
