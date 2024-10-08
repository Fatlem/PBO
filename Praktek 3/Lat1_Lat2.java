import java.util.Scanner;

class Matematika {
    // Method Menghitung Tambah
    public static int tambah(int a, int b) {
        return a + b;
    }

    // Method Menghitun Pengurangan
    public static int kurang(int a, int b) {
        return a - b;
    }

    // Method Menghitun Perkalian
    public static int kali(int a, int b) {
        return a * b;
    }

    // Method Menghitun Pembagian
    public static int bagi(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("tdk bisa dibagi nol");
        }
    }
}

public class Lat1_Lat2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan Nilai Celcius : ");
        double celcius = scanner.nextDouble();

        // Rumus Konversi Suhu
        double kelvin = celcius + 273.15;
        double fahrenheit = celcius * 1.8 + 32;
        double rankine = celcius * 1.8 + 491.67;
        double delisle = (100 - celcius) * 1.5;
        double newton = celcius * 33 / 100;
        double reaumur = celcius * 0.8;
        double romer = celcius * 21 / 40 + 7.5;

        System.out.println("Ubah Suhu    :");
        System.out.println("Kelvin      : " + kelvin + " K");
        System.out.println("Fahrenheit  : " + fahrenheit + " F");
        System.out.println("Rankine     : " + rankine + " Ra");
        System.out.println("Delisle     : " + delisle + " De");
        System.out.println("Newton      : " + newton + " N");
        System.out.println("Reaumur     : " + reaumur + " Re");
        System.out.println("Romer       : " + romer + " Ro");

        scanner.close();

        System.out.println("================================================");

        // Menampilkan Hasilnya Method
        System.out.println("Pertambahan = " + Matematika.tambah(10, 2));
        System.out.println("Pengurangan = " + Matematika.kurang(10, 2));
        System.out.println("Perkalian   = " + Matematika.kali(10, 2));
        System.out.println("Pembagian   = " + Matematika.bagi(10, 2));
    }

}
