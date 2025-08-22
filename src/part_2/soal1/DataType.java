package part_2.soal1;
import java.util.Scanner;

public class DataType {
  public static void main(String[] args) {
    int T;
    String[] nums;

    try (Scanner input = new Scanner(System.in)) {
      T = input.nextInt();
      nums = new String[T];
      for (int i = 0; i < T; i++) {
        nums[i] = input.next();
      }
    }

    for (String l : nums) {
      long num;
      try {
        num = Long.parseLong(l.trim());
      } catch (NumberFormatException e) {
        System.out.println(l + " can't be fitted anywhere.");
        continue;
      }
      System.out.println(l + " can be fitted in: ");
      PrintFittedType(num);
    }

  }

  private static void PrintFittedType(long num) {
    if (num <= Byte.MAX_VALUE && num >= Byte.MIN_VALUE) {
      System.out.println("* Byte");
    }
    if (num <= Short.MAX_VALUE && num >= Short.MIN_VALUE) {
      System.out.println("* Short");
    }
    if (num <= Integer.MAX_VALUE && num >= Integer.MIN_VALUE) {
      System.out.println("* Int");
    }
    if (num <= Long.MAX_VALUE && num >= Long.MIN_VALUE) {
      System.out.println("* Long");
    }

  }
}