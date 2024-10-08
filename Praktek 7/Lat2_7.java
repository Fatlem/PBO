import java.util.Scanner;

class Mahasiswa {
    private String nama;
    private int nilaiUas;
    private int nilaiUts;
    private int nilaiTugas;
    private int nilaiAkhir;

    public Mahasiswa(String nama, int nilaiUts, int nilaiUas, int nilaiTugas, int nilaiAkhir) {
        this.nama = nama;
        this.nilaiUas = nilaiUas;
        this.nilaiUts = nilaiUts;
        this.nilaiTugas = nilaiTugas;
        this.nilaiAkhir = nilaiAkhir;
    }

    public String getNama() {
        return nama;
    }

    public int getNilaiUas() {
        return nilaiUas;
    }

    public int getNilaiUts() {
        return nilaiUts;
    }

    public int getNilaiTugas() {
        return nilaiTugas;
    }

    public int getNilaiAkhir() {
        return nilaiAkhir;
    }
}

public class Lat2_7 {
    private static Mahasiswa[] mahasiswas;
    private static int jumlahMahasiswa;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=================================");
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        int jumlah = scanner.nextInt();

        mahasiswas = new Mahasiswa[jumlah];
        jumlahMahasiswa = 0;

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Nama Mahasiswa : ");
            String nama = scanner.next();
            System.out.print("Masukkan Nilai : ");
            int nilaiUas = scanner.nextInt();
            System.out.print("Masukkan Nilai : ");
            int nilaiUts = scanner.nextInt();
            System.out.print("Masukkan Nilai : ");
            int nilaiTugas = scanner.nextInt();
            System.out.print("Masukkan Nilai : ");
            int nilaiAkhir = scanner.nextInt();
            System.out.println("=================================");

            tambahMahasiswa(nama, nilaiUas, nilaiUts, nilaiTugas, nilaiAkhir);
        }

        System.out.println("\nDaftar Nilai Mahasiswa : ");
        daftarNilai();

        scanner.close();
    }

    private static void tambahMahasiswa(String nama, int nilaiUas, int nilaiUts, int nilaiTugas, int nilaiAkhir) {
        Mahasiswa mhs = new Mahasiswa(nama, nilaiUas, nilaiUts, nilaiTugas, nilaiAkhir);
        mahasiswas[jumlahMahasiswa] = mhs;
        jumlahMahasiswa++;
    }

    private static void daftarNilai() {
        for (int i = 0; i < jumlahMahasiswa; i++) {
            Mahasiswa mhs = mahasiswas[i];
            System.out.println("Nama : " + mhs.getNama() + "\nNilaiUAS : " + mhs.getNilaiUas() + "\nNilaiUTS : "
            + mhs.getNilaiUts() + "\nNilaiTUGAS : " + mhs.getNilaiTugas() + "\nNilaiAkhir  : " + mhs.getNilaiAkhir());
            System.out.println("=================================");
        }
    }
}