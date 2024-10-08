import java.util.Scanner;

class Mobil {
    private String nama;
    private int tahunProduksi;
    private int muatan;
    private String kategori;

    public Mobil(String nama, int tahunProduksi, int muatan, String kategori) {
        this.nama = nama;
        this.tahunProduksi = tahunProduksi;
        this.muatan = muatan;
        this.kategori = kategori;
    }

    public String getNama() {
        return nama;
    }

    public int getTahunProduksi() {
        return tahunProduksi;
    }

    public int getMuatan() {
        return muatan;
    }

    public String getKategori() {
        return kategori;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data mobil
        Mobil mobil1 = new Mobil("Isuzu Elf", 2019, 14, "Mobil Angkutan");
        Mobil mobil2 = new Mobil("Ford Mustang", 2020, 2, "Mobil Sports");
        Mobil mobil3 = new Mobil("Toyota Inova", 2023, 7, "Mobil Keluarga");

        // Cetak informasi mobil
        System.out.println("Nama = " + mobil1.getNama());
        System.out.println("Tahun Produksi = " + mobil1.getTahunProduksi());
        System.out.println("Muatan = " + mobil1.getMuatan() + " orang");
        System.out.println("Kategori = " + mobil1.getKategori());
        System.out.println();

        System.out.println("Nama = " + mobil2.getNama());
        System.out.println("Tahun Produksi = " + mobil2.getTahunProduksi());
        System.out.println("Muatan = " + mobil2.getMuatan() + " orang");
        System.out.println("Kategori = " + mobil2.getKategori());
        System.out.println();

        System.out.println("Nama = " + mobil3.getNama());
        System.out.println("Tahun Produksi = " + mobil3.getTahunProduksi());
        System.out.println("Muatan = " + mobil3.getMuatan() + " orang");
        System.out.println("Kategori = " + mobil3.getKategori());
        System.out.println();

        // Menemukan mobil dengan muatan paling sedikit
        Mobil mobilTerkecil = mobil1;
        if (mobil2.getMuatan() < mobilTerkecil.getMuatan()) {
            mobilTerkecil = mobil2;
        }
        if (mobil3.getMuatan() < mobilTerkecil.getMuatan()) {
            mobilTerkecil = mobil3;
        }

        // Cetak hasil
        System.out.println("Nama mobil pertama dan kedua tidak sama");
        System.out.println("Muatan paling sedikit = " + mobilTerkecil.getNama());

        scanner.close();
    }

    @Override
    public String toString() {
        return "Main []";
    }
}
