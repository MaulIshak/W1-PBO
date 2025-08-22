package part2.soal2;

public class Constants {
  // public static final double CM_PER_INCH = 2.54;
  // Ini sebagai atribut class, kalau tidak pakai static, maka harus dibuat
  // instance dari classnya dulu
  // Deklarasi disini memiliki scope yang lebih luas, bisa dipanggil di banyak
  // function
  // Bisa juga di panggil oleh class lain karena keyword public

  public static void main(String[] args) {
    final double CM_PER_INCH = 2.54;
    // kalau ini variable dalam lingkup method, tidak perlu static
    // Tidak bisa diakses di luar method maupun di luar class

    double paperWidth = 8.5;
    double paperHeight = 11;
    System.out.println("Paper size in centimeters: " + paperWidth *
        CM_PER_INCH + " by " + paperHeight * CM_PER_INCH);
  }
}
