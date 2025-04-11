package dev.alper_celik.java_examples.second_term;

public class Account {

  private String accountName;
  private double ballance;

  public String getAccountName() {
    return accountName;
  }

  public double balance() {
    return ballance;
  }

  public Account(String name, double money) {
    this.accountName = name;
    this.ballance = money;
  }

  public void deposit(double money) {
    ballance += money;
  }

  public void withdraw(double money) {
    if (money <= ballance) {
      ballance -= money;
      return;
    }

    throw new IllegalArgumentException("not enough moy to withdraw");
  }

  @Override
  public String toString() {
    return "Account Name: \"" + getAccountName() + "\", Ballance: " + balance();
  }

}
