package dev.alper_celik.java_examples.second_term;

public class Time {

  private int hour, minute, second;

  public int getHour() {
    return hour;
  }

  public void setHour(int hour) throws IllegalArgumentException {
    if (hour < 24 && hour >= 0) {
      this.hour = hour;
    } else {
      throw new IllegalArgumentException("hour can't be " + hour);
    }
  }

  public int getMinute() {
    return minute;
  }

  public void setMinute(int minute) throws IllegalArgumentException {
    if (minute < 60 && minute >= 0) {
      this.minute = minute;
    } else {
      throw new IllegalArgumentException("minute can't be " + minute);
    }
  }

  public int getSecond() {
    return second;
  }

  public void setSecond(int second) throws IllegalArgumentException {
    if (second < 60 && second >= 0) { // lets ignore leap seconds
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

  public String getTime() {
    return String.format("%d:%d:%d", getHour(), getMinute(), getSecond());
  }

  public void incrementSecond() {
    if (getSecond() < 59) {
      setSecond(getSecond() + 1);
    } else if (getMinute() < 59) {
      setMinute(getMinute() + 1);
      setSecond(0);
    } else if (getHour() < 23) {
      setHour(getHour() + 1);
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
