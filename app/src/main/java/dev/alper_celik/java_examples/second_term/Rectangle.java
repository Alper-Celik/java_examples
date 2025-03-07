package dev.alper_celik.java_examples.second_term;

public class Rectangle {

  private double height;
  private double width;

  public Rectangle(double height, double width) {
    setHeight(height);
    setWidth(width);
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getPerimeter() {
    return (getHeight() * 2) + (getWidth() * 2);
  }

  public double getArea() {
    return getHeight() * getWidth();
  }

  public String getInfo() {
    return String.format("width: %f, height: %f \narea: %f, perimiter: %f\n", getWidth(), getHeight(), getArea(),
        getPerimeter());
  }
}
