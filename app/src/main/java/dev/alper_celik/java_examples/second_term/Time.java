package dev.alper_celik.java_examples.second_term;

public class Time {

  private int hour;

  public int getHour() {
    return hour;
  }

  public void setHour(int hour) throws IllegalArgumentException {
    if (hour < 24 || hour >= 0) {
      this.hour = hour;
    } else {
      throw new IllegalArgumentException("hour can't be " + hour);
    }
  }

  private int minute;

  public int getMinute() {
    return minute;
  }

  public void setMinute(int minute) throws IllegalArgumentException {
    if (minute < 60 || minute >= 0) {
      this.minute = minute;
    } else {
      throw new IllegalArgumentException("minute can't be " + minute);
    }
  }

  private int second;

  public int getSecond() {
    return second;
  }

  public void setSecond(int second) throws IllegalArgumentException {
    if (second < 60 || second >= 0) { // lets ignore leap seconds
      this.second = second;
    } else {
      throw new IllegalArgumentException("second can't be " + second);
    }
  }

  public Time(int hour, int minute, int second) {
    setHour(hour);
    setMinute(minute);
    setSecond(second);
  }

  public void printTime() {
    System.out.printf("%d:%d:%d\n", getHour(), getMinute(), getSecond());
  }

  public void incrementSecond() {
    if (second < 59) {
      second++;
    } else if (minute < 59) {
      minute++;
      setSecond(0);
    } else if (hour < 23) {
      hour++;
      setSecond(0);
      setMinute(0);
    } else {
      setHour(0);
      setMinute(0);
      setSecond(0);
    }
  }

  public void incrementBySeconds(int seconds) {
    for (int i = 0; i < seconds; i++) {
      incrementSecond();
    }
  }

}
