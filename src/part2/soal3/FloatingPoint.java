package part2.soal3;
public class FloatingPoint {
  public static void main(String[] args) {
    double x = 92.98;
    int nx = (int) Math.round(x); // Harus casting karena returnnya long
    System.out.println(nx);
  }
}
