package org.example;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FirstTerm {
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

  public static void not_hesaplama() {
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

  public static BigInteger factorial(BigInteger i) {
    if (i == BigInteger.valueOf(0)) {
      return BigInteger.valueOf(1);
    }
    return i.multiply(factorial(i.subtract(BigInteger.ONE)));
  }

  public static void artık_yıl() {
    var scan = new Scanner(System.in);

    System.out.print("bir yılı giriniz: ");
    var yıl = scan.nextInt();
    boolean artık_yıl = (yıl % 4 == 0) || ((yıl % 100 == 0) && (yıl % 400 == 0));

    if (artık_yıl) {
      System.out.printf("%d artık bir yıldır \n", yıl);
    } else {
      System.out.printf("%d artık bir yıl değildir \n", yıl);
    }

    scan.close();

  }

  public static void basamak_toplamı() {
    var scan = new Scanner(System.in);
    var sayı = scan.nextLong();
    long toplam = 0;

    var sayı_tmp = sayı;
    while (sayı_tmp != 0) {
      toplam += sayı_tmp % 10;
      sayı_tmp = sayı_tmp / 10;
    }
    System.out.printf("%d sayısının basamak sayısı %d", sayı, toplam);
    scan.close();
  }

  public static void pozitif_çarpma(String[] args) {
    var scan = new Scanner(System.in);

    long sayı1 = scan.nextLong(), sayı2 = scan.nextLong(), toplam = 0;

    for (int i = 0; i < sayı1; i++) {
      toplam += sayı2;
    }

    System.out.println(toplam);

    scan.close();
  }

  public static void kare_çiz(String[] args) {
    while (true) {
      var scan = new Scanner(System.in);

      System.out.println("sırasıyla satır ve sütün sayısını giriniz \n*herhangi birine sıfır girerek çıkabilirsiniz");
      long sayı1 = scan.nextLong(), sayı2 = scan.nextLong();

      if (sayı1 == 0 || sayı2 == 0) {
        break;
      }

      for (int i = 0; i < sayı1; i++) {
        for (int j = 0; j < sayı2; j++) {
          System.out.print("⭐");
        }
        System.out.println("");
      }
      scan.close();
    }
  }

  public static ArrayList<Integer> PozitifTamBölenler(int sayı) {
    var tam_bölenler = new ArrayList<Integer>();

    for (int i = 1; i <= sayı; i++) {
      if (sayı % i == 0) {
        tam_bölenler.add(i);
      }
    }

    return tam_bölenler;
  }

  public static boolean sihirli_sayı_mı(int sayı) {

    var tam_bölenler = PozitifTamBölenler(sayı);
    tam_bölenler.removeLast();

    int toplam = 0;
    for (int i = 0; i < tam_bölenler.size(); i++) {
      toplam += tam_bölenler.get(i);
    }

    return toplam == sayı;
  }

  public static void mükemmek_sayı(String[] args) {
    var scan = new Scanner(System.in);

    var son_sayı = scan.nextInt();

    ExecutorService executorService = Executors.newFixedThreadPool(32);

    for (int sayı = 1; sayı < son_sayı; sayı++) {
      int sayı_tmp = sayı;
      Runnable f = () -> {
        if (sihirli_sayı_mı(sayı_tmp)) {
          System.out.printf("⭐ %d bir sihirli sayı\n", sayı_tmp);
        } else {
          // System.out.printf("%d bir sihirli sayı değil", sayı);
        }
      };
      executorService.execute(f);

    }

    // son_sayı = scan.nextInt();
    executorService.close();

    scan.close();

  }

  public static void içi_boş_dörtgen(String[] args) {

    var scan = new Scanner(System.in);

    int en = scan.nextInt(), boy = scan.nextInt();

    for (int i = 1; i <= boy; i++) {
      for (int j = 1; j <= en; j++) {
        if (i == 1 || i == boy) {
          System.out.print("*");
        } else if (j == 1 || j == en) {
          System.out.print("*");
        } else {
          System.out.print(" ");
        }
      }
      System.out.print("\n");
    }
    scan.close();
  }

  public static void array_practice(String[] args) {
    var scan = new Scanner(System.in);

    System.out.println("kaç sayı gireceksiniz");

    int sayı_sayısı = scan.nextInt();
    float[] sayılar = new float[sayı_sayısı];

    for (int i = 0; i < sayılar.length; i++) {
      System.out.printf("%s. sayıyı giriniz: ", i + 1);
      sayılar[i] = scan.nextFloat();
    }

    float min = sayılar[0], max = sayılar[0], sum = 0;

    for (float f : sayılar) {
      if (min > f) {
        min = f;
      }
      if (max < f) {
        max = f;
      }
      // min = Math.min(min, f); // öğrenince kullanacakmışız ughh
      // max = Math.max(max, f);
      sum += f;
    }

    float avarage = sum / sayılar.length;

    System.out.printf("en girdiğiniz en küçük sayı : %f, en büyük sayı %f, ortalaması: %f, toplamı: %f", min, max,
        avarage, sum);
    scan.close();
  }

  public static void find_indexes_of_random_array(String[] args) {
    var scan = new Scanner(System.in);
    var rand = new Random();

    System.out.print("Kaç tane rastgele sayı seçilsin: ");
    var random_numbers = new Integer[scan.nextInt()];
    System.out.print("En küçük rastgele değer: ");
    var rand_min = scan.nextInt();
    System.out.print("En büyük rastgele değer: ");
    var rand_max = scan.nextInt() + 1;

    for (int i = 0; i < random_numbers.length; i++) {
      random_numbers[i] = rand.nextInt(rand_min, rand_max);
    }

    System.out.println(Utils.arrayToString(random_numbers));

    System.out.println("Bulmak istediğiniz sayı: ");
    var searched_num = scan.nextInt();
    var found_indicies = new ArrayList<Integer>();

    for (int i = 0; i < random_numbers.length; i++) {
      if (random_numbers[i] == searched_num) {
        found_indicies.add(i);
      }
    }

    if (found_indicies.isEmpty()) {
      System.out.println("hiçbir sayı bulunamadı");
    } else if (found_indicies.size() == 1) {
      System.out.printf("Sayının endeksi %d\n", found_indicies.getFirst());
    } else {
      System.out.printf("Sayının endexleri(0 dan başlayan): %s\n", Utils.arrayToString(found_indicies));
      System.out.printf("Sayının oludğu dizinin eleman sayısı: %d\n", random_numbers.length);
      System.out.printf("Sayının tekrar miktarı: %d\n", found_indicies.size());
      System.out.printf("Sayının çıkma olasılığı: %% %f\n",
          (((float) found_indicies.size()) / ((float) random_numbers.length)) * 100);
    }

    scan.close();
  }

  public static void sum_of_square_of_array(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("dizinin boyutunu giriniz: ");
    var array = new BigInteger[scan.nextInt()];

    for (int i = 0; i < array.length; i++) {
      System.err.printf("Dizi[%d] giriniz: ", i);
      array[i] = scan.nextBigInteger();
    }
    var sqaure_sum = new BigInteger("0");

    for (BigInteger bigInteger : array) {
      sqaure_sum = sqaure_sum.add((bigInteger.multiply(bigInteger)));
    }

    System.err.printf("karelerinin toplamı : %s", sqaure_sum.toString());

    scan.close();

  }

  public static void reverse_the_array(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("dizinin boyutunu giriniz: ");
    var array = new Long[scan.nextInt()];

    for (int i = 0; i < array.length; i++) {
      System.err.printf("Dizi[%d] giriniz: ", i);
      array[i] = scan.nextLong();
    }
    System.out.printf("regular array : %s \n", Utils.arrayToString(array));

    var reverse_array = array.clone();
    for (int i = 0; i < array.length; i++) {
      int reverse_index = (array.length - 1) - i;

      reverse_array[i] = array[reverse_index];
    }

    System.out.printf("reverse array : %s \n", Utils.arrayToString(reverse_array));

    scan.close();
  }

  public class ortalama_hesap {

    public static double find_avarage_note(double midterms, double finals) {
      return (midterms * 0.4) + (finals * 0.6);
    }

    public static char character_note(double avarage) {
      if (avarage >= 90) {
        return 'A';
      } else if (avarage >= 80) {
        return 'B';
      } else if (avarage >= 70) {
        return 'C';
      } else if (avarage >= 60) {
        return 'D';
      } else {
        return 'F';
      }
    }

    public static void main(String[] args) {
      var scan = new Scanner(System.in);

      System.out.printf("lütfen hesaplanacak öğrenci sayısını giriniz: ");

      for (int i = scan.nextInt(); 0 < i; i--) {
        System.out.printf("öğrencinin vize notunu giriniz: ");
        var midterm_note = scan.nextDouble();
        System.out.printf("öğrencinin final notunu giriniz: ");
        var final_note = scan.nextDouble();
        System.out.printf("--> Öğrencinin harf notu = '%s' \n\n",
            character_note(find_avarage_note(midterm_note, final_note)));

      }

      scan.close();
    }
  }

  public static double Dizi_ortalama_hesap(double[] array) {
    double out = 0;
    for (double d : array) {
      out += d;
    }
    return out / array.length;
  }

  public static void sum_of_odd_even() {
    var scan = new Scanner(System.in);
    int N = 0;
    System.out.println("please enter a number");
    N = scan.nextInt();

    sum_of_odd_even(N);

    scan.close();
  }

  public static void sum_of_odd_even(int N) {

    long oddSum = 0, evenSum = 0;

    for (int i = 1; i <= N; i++) {
      if (i % 2 == 0) {
        evenSum += i;
      } else {
        oddSum += i;
      }
    }

    System.out.printf("sum of odd numbers = %d , sum of even numbers = %d", oddSum, evenSum);

  }
}
