package dev.alper_celik.java_examples;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.math.BigInteger;
import java.util.Scanner;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class FirstTermTests {
  private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
  private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
  private final PrintStream originalOut = System.out;
  private final PrintStream originalErr = System.err;

  @BeforeEach
  public void setUpStreams() {
    outContent.reset();
    errContent.reset();
    System.setOut(new PrintStream(outContent));
    System.setErr(new PrintStream(errContent));
  }

  @AfterEach
  public void restoreStreams() {
    System.setOut(originalOut);
    System.setErr(originalErr);
  }

  @Test
  void ucgen_kenar_test() {
    FirstTerm.ucgen_kenar(new Scanner("10 10 10"));
    assertTrue(outContent.toString().contains("eşkenar"));
    outContent.reset();

    FirstTerm.ucgen_kenar(new Scanner("10 5 10"));
    assertTrue(outContent.toString().contains("ikizkenar"));
    outContent.reset();

    FirstTerm.ucgen_kenar(new Scanner("10 5 9"));
    assertTrue(outContent.toString().contains("çeşitkenar"));
  }

  @Test
  void ucgen_alan_test() {
    FirstTerm.ucgen_alan(new Scanner("10 10"));
    assertTrue(outContent.toString().contains("50"));
  }

  @Test
  void hesap_makinesi() {
    FirstTerm.hesap_makinesi(new Scanner("10 10 +"));
    assertTrue(outContent.toString().contains("20"));
    outContent.reset();

    FirstTerm.hesap_makinesi(new Scanner("10 5 -"));
    assertTrue(outContent.toString().contains("5"));
    outContent.reset();

    FirstTerm.hesap_makinesi(new Scanner("10 10 *"));
    assertTrue(outContent.toString().contains("100"));
    outContent.reset();

    FirstTerm.hesap_makinesi(new Scanner("10 2 /"));
    assertTrue(outContent.toString().contains("5"));
    outContent.reset();

    FirstTerm.hesap_makinesi(new Scanner("10 10 invalid"));
    assertTrue(outContent.toString().contains("hata"));
    outContent.reset();
  }

  @ParameterizedTest
  @CsvSource({
      "90, 95, AA, 93",
      "80, 90, BA, 86",
      "80, 80, BB, 80",
      "75, 75, CB, 75",
      "70, 70, CC, 70",
      "65, 65, DC, 65",
      "60, 60, DD, 60",
      "50, 50, FF, 50"
  })
  void not_hesaplama_test(String vize_notu, String final_notu, String harf_notu, String not) {
    FirstTerm.not_hesaplama(new Scanner(String.format("%s %s", vize_notu, final_notu)));
    assertTrue(outContent.toString().contains(harf_notu));
    assertTrue(outContent.toString().contains(not));

  }

  @Test
  void factorial_test() {
    assertEquals(BigInteger.valueOf(1), FirstTerm.factorial(BigInteger.valueOf(0)));

    assertEquals(BigInteger.valueOf(3628800), FirstTerm.factorial(BigInteger.valueOf(10)));
  }

  @ParameterizedTest
  @CsvSource({
      "1996, true",
      "2000, true",
      "2100, false",
      "2104, true",
  })
  void artık_yıl_test(String date, boolean is_leap_year) {
    FirstTerm.artık_yıl(new Scanner(date));
    assertTrue(outContent.toString().contains("artık bir yıldır") == is_leap_year);
  }

  @ParameterizedTest
  @CsvSource({
      "4,4",
      "35,8",
      "126,9",
      "54545454,36"
  })
  void basamak_toplamı_test(String number, String sum) {
    FirstTerm.basamak_toplamı(new Scanner(number));

    assertTrue(outContent.toString().contains("toplamı " + sum));
  }
}
