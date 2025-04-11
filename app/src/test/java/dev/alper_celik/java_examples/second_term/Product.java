package dev.alper_celik.java_examples.second_term;

public class Product {

  private String Name;

  public String getName() {
    return Name;
  }

  public void setName(String name) {
    Name = name;
  }

  private double Price;

  public double getPrice() {
    return Price;
  }

  public void setPrice(double price) {
    Price = price;
  }

  private int Quantity;

  public int getQuantity() {
    return Quantity;
  }

  public void setQuantity(int quantity) {
    Quantity = quantity;
  }

  public Product(String initialName, double initialPrice, int initialQuantity) {
    setName(initialName);
    setPrice(initialPrice);
    setQuantity(initialQuantity);
  }

  public Product(String initialName, double initialPrice) {
    setName(initialName);
    setPrice(initialPrice);
    setQuantity(1);
  }

  public Product(String initialName) {
    setName(initialName);
    setPrice(1);
    setQuantity(1);
  }

  public void printProduct() {
    System.out.println(getName() + "," + getPrice() + "," + getQuantity() + " pcs");
  }

  public double totalPrice() {
    return getPrice() * getQuantity();
  }
}
