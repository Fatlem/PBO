class Mobil2 {
    String warna;
    int tahunproduksi;

    void hidupkanMobil(String status) {
        System.out.println("Hidupkan Mobil : " + status);
    }

    void matikanMobil(String status) {
        System.out.println("Matikan Mobil  : " + status);
    }

    void ubahGigi(String status) {
        System.out.println("Ubah Gigi      : " + status);
    }
}

public class MobilDemo2 {
    public static void main(String[] args) {
        Mobil2 mobilku = new Mobil2();
        Mobil2 mobilmu = new Mobil2();

        mobilku.warna = "Hitam";
        mobilku.tahunproduksi = 2006;
        mobilmu.warna = "Hijau";
        mobilmu.tahunproduksi = 2010;

        System.out.println("Warna : " + mobilku.warna);
        System.out.println("Tahun : " + mobilku.tahunproduksi);

        System.out.println("Warna : " + mobilmu.warna);
        System.out.println("Tahun : " + mobilmu.tahunproduksi);

        mobilku.hidupkanMobil("Hitam");
        mobilku.ubahGigi("Hitam");
        mobilku.matikanMobil("Hitam");
    }
}
