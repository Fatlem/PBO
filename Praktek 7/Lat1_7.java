import java.util.Scanner;

public class Lat1_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Jumlah Data : ");
        int jumlahData = scanner.nextInt();

        int[] data = new int[jumlahData];

        //Untuk Memasukan Nilai Data
        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Data ke - " + (i + 1) + " = ");
            data[i] = scanner.nextInt();
        }

        //Mnegeluarkan Hasil Nilai Data
        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Hasil nilai [" + i + "] = " + data[i]);
        }

        scanner.close();
    }
}