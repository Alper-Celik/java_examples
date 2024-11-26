package org.example;

import java.util.Scanner;

public class App {
  public static void üçgen_kenar() {
    Scanner scan = new Scanner(System.in);
    System.out.print("a kenarını girin :");
    float a = scan.nextFloat();
    System.out.print("b kenarını girin :");
    float b = scan.nextFloat();
    System.out.print("c kenarını girin :");
    float c = scan.nextFloat();

    String üçgen_tipi;

    if (a == b && a == c && b == c) {
      üçgen_tipi = "eşkenar";
    } else if (a != b && a != c && b != c) {
      üçgen_tipi = "çeşitkenar";
    } else {
      üçgen_tipi = "ikizkenar";
    }

    System.out.printf("girdiğiniz üçgen bir %s üçgen", üçgen_tipi);
    scan.close();
  };

  public static void üçgen_alan() {
    Scanner scan = new Scanner(System.in);
    System.out.print("taban uzunluğu giriniz:");
    float taban_uzunluğu = scan.nextFloat();

    System.out.print("yükseklik giriniz:");
    float yükseklik = scan.nextFloat();

    System.out.printf("üçgenin alanı: %f", ((taban_uzunluğu * yükseklik) / 2));
    scan.close();
  }

  public static void hesap_makinesi() {
    Scanner scan = new Scanner(System.in);
    System.out.println("iki sayı giriniz:");
    double sayı1 = scan.nextDouble(), sayı2 = scan.nextDouble();
    System.out.print("işlem seçiniz:");
    String işlem = scan.next();

    double sonuç = 0;
    switch (işlem) {
      case "+":
        sonuç = sayı1 + sayı2;
        break;
      case "-":
        sonuç = sayı1 - sayı2;
        break;
      case "*":
        sonuç = sayı1 * sayı2;
        break;
      case "/":
        sonuç = sayı1 / sayı2;
        break;
      default:
        System.out.println("hata: yanlış işlem");
        System.exit(10);
    }
    System.out.printf("sonuç: %f", sonuç);

scan.close();
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("sırasıyla vize ve final notunuzu giriniz");
    double vize_notu = scan.nextDouble();
    double final_notu = scan.nextDouble();

    String harf_notu = "FF";
    double not = (vize_notu * 0.4) + (final_notu * 0.6);

    if (not >= 90) {
      harf_notu = "AA";
    } else if (not >= 85) {
      harf_notu = "BA";
    } else if (not >= 80) {
      harf_notu = "BB";
    } else if (not >= 75) {
      harf_notu = "CB";
    } else if (not >= 70) {
      harf_notu = "CC";
    } else if (not >= 65) {
      harf_notu = "DC";
    } else if (not >= 60) {
      harf_notu = "DD";
    }

    System.out.printf("notunuz: %f, harf notunuz: %s", not, harf_notu);
    scan.close();
  }
}
