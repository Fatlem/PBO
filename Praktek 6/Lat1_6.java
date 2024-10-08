import java.util.Scanner;

public class Lat1_6 {

    public static int hitungFaktorial(int n) {
        if (n == 0 || n == 1) {
            System.out.println("5(" + n + ") = 1");
            return 1;
        } else {
            System.out.println("Hitung Faktorial(" + n + ")");
            int hasil = n * hitungFaktorial(n - 1);
            System.out.println("(" + n + ") = " + n + " * (" + (n - 1) + ") = " + hasil);
            return hasil;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bilangan : ");

        int bilangan = scanner.nextInt();

        if (bilangan < 0) {
            System.out.println("Maaf, tidak terdefinisi.");
        } else {
            System.out.println("Mulai Menghitung Faktorial " + bilangan + " !");
            
            int hasilFaktorial = hitungFaktorial(bilangan);
            System.out.println("Faktorial dari " + bilangan + " adalah: " + hasilFaktorial);
        }

        scanner.close();
    }
}