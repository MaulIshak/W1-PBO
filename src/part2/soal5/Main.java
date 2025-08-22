package part2.soal5;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    String A, B;

    try (Scanner input = new Scanner(System.in)) {
      A = input.nextLine();
      B = input.nextLine();

      System.out.println(A.length() + B.length());
      if (A.compareTo(B) > 0) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }
      System.out.println(A.substring(0, 1).toUpperCase() + A.substring(1) + " " + B.substring(0, 1) + B.substring(1));
    }

  }
}
