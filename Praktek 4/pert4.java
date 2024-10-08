import java.util.Scanner;

class mhs {
    // Attribut
    private String nama;
    private int umur;
    private String nim;

    // Method
    public void belajar() {
        System.out.println("Sedang Belajar");
    }

    public int tahunlahir() {
        return 2024 - this.umur;
    }

     // Getter dan setter untuk umur
     public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }
}

public class pert4 {
    public static void main(String[] args) {
        // System.out.println("Hitung Luas Segitiga");
        // Buat Objek
        mhs susi = new mhs();
        susi.setUmur(20);

        double alas = 9, tinggi = 12, luas, keliling;
        luas = 0.5 * alas * tinggi;

        System.out.println("Luas Segi3: " + luas);

        Scanner inputan = new Scanner(System.in);
        System.out.print("Input alas: ");
        alas = inputan.nextInt();

        // Keliling Segitiga
        
    }
}