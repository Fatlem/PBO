class Buku {
    // Attribut
    private String judul;
    private String pengarang;
    private String penerbit;
    private int tahun;

    // Konstruktor
    public Buku(String judul, String pengarang, String penerbit, int tahun) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.penerbit = penerbit;
        this.tahun = tahun;
    }

    // Method Sout
    public void cetakBuku() {
        System.out.println();
        System.out.println("Judul       : " + judul);
        System.out.println("Pengarang   : " + pengarang);
        System.out.println("Penerbit    : " + penerbit);
        System.out.println("Tahun       : " + tahun);
        System.out.println("===========================================");
    }
}

class KonversiWaktu {
    private int hari;
    private int jam;
    private int menit;
    private int detik;

    // Konstruktor untuk konversi waktu dari total detik
    KonversiWaktu(int totalDetik) {
        this.detik = totalDetik;

        // Menghitung jumlah hari
        hari = totalDetik / 86400;
        totalDetik %= 86400;

        // Menghitung jumlah jam
        jam = totalDetik / 3600;
        totalDetik %= 3600;

        // Menghitung jumlah menit
        menit = totalDetik / 60;
        detik = totalDetik % 60;
    }

    // Method untuk mencetak hasil konversi waktu
    public void cetakKonversi() {
        System.out.println("Konversi Waktu");
        System.out.println("Detik           : 180061");
        System.out.println("Hari            : " + hari);
        System.out.println("Jam             : " + jam);
        System.out.println("Menit           : " + menit);
        System.out.println("Detik           : " + detik);
    }

}

// Praktek4 = public class BukuDemo = konversi waktu
public class Lat_1_Lat2 {
    public static void main(String[] args) {
        // buku Ke1 di modul Praktek4
        Buku buku1 = new Buku("Pemrograman Berbasis Objek dengan Java", "Indrajani", "Elexmedia Komputindo", 2007);
        System.out.println("Buku Ke1 :");
        buku1.cetakBuku();

        // buku Ke2 di modul Praktek4
        Buku buku2 = new Buku("Dasar Pemrograman Java", "Abdul Kadir", "Andi Offset", 2004);
        System.out.println("Buku Ke2 :");
        buku2.cetakBuku();

        KonversiWaktu waktu = new KonversiWaktu(180061);

        waktu.cetakKonversi();
    }
}
