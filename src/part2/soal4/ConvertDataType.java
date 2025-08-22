package part2.soal4;

public class ConvertDataType {
  static short methodOne(long l) {
    int i = (int) l;
    return (short) i;
  }

  public static void main(String[] args) {
    double d = 10.25;
    float f = (float) d; // Tingkat presisinya akan berubah, namun disini tidak terlihat karena cuma 2
                         // angka di belakang koma
    byte b = (byte) methodOne((long) f); // Casting return valuenye ke byte, Casting argumennya ke long
    System.out.println(b);
  }
}
