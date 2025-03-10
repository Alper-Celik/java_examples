package dev.alper_celik.java_examples.second_term;

public class Date {
  private int year, month, day;

  Date(int year, int month, int day) {
    setYear(year);
    setMonth(month);
    setDay(day);
  }

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

  public String getDate() {
    return String.format("%d-%d-%d", getYear(), getMonth(), getDay());
  };

  public void nextDay() { // assume every month is 30 days
    if (getDay() < 30) {
      setDay(getDay() + 1);
    } else if (month < 12) {
      setMonth(getMonth() + 1);
      setDay(1);
    } else {
      setYear(getYear() + 1);
      setDay(1);
      setMonth(1);
    }
  }
}
