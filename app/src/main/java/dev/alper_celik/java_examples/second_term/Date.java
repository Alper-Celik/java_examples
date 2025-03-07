package dev.alper_celik.java_examples.second_term;

public class Date {
  private int year, month, day;

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  public int getMonth() {
    return month;
  }

  public void setMonth(int month) {
    this.month = month;
  }

  public int getDay() {
    return day;
  }

  public void setDay(int day) {
    this.day = day;
  }

  public void printDate() {
    System.out.printf("%d-%d-%d\n", getYear(), getMonth(), getDay());
  };

  public void nextDay() { // assume every month is 30 days
    if (day < 30) {
      day++;
    } else if (month < 12) {
      month++;
      setDay(1);
    } else {
      year++;
      setDay(1);
      setMonth(1);
    }
  }
}
