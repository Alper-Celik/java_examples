package dev.alper_celik.java_examples.second_term;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class AccountTests {

  @Test
  void accountTests() {
    Account artosAccount = new Account("Arto's account", 100.00);
    assertEquals(100.00, artosAccount.balance());
    assertEquals("Arto's account", artosAccount.getAccountName());

    artosAccount.deposit(50);
    assertEquals(150.00, artosAccount.balance());

    artosAccount.withdraw(100);
    assertEquals(50.00, artosAccount.balance());

    assertThrows(IllegalArgumentException.class, () -> artosAccount.withdraw(100));
    assertEquals(50.00, artosAccount.balance());

    assertTrue(artosAccount.toString().contains("Arto's account"));

  }
}
