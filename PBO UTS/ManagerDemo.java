class Rekrutan {
    private String nama;
    private String alamat;

    public Rekrutan() {}

    public Rekrutan(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void cetak() {
        System.out.println("Nama        : " + nama);
        System.out.println("Alamat      : " + alamat);
    }
}

class Pegawai extends Rekrutan {
    private int noInduk;

    public Pegawai() {}

    public Pegawai(String nama, String alamat, int noInduk) {
        super(nama, alamat);
        this.noInduk = noInduk;
    }

    public int getNoInduk() {
        return noInduk;
    }

    public void setNoInduk(int noInduk) {
        this.noInduk = noInduk;
    }

    public void cetak() {
        super.cetak();
        System.out.println("No.Induk    : " + noInduk);
    }
}

class Manager extends Pegawai {
    private double gaji;

    public Manager() {

    }

    public Manager(String nama, String alamat, int nim, double gaji) {
        super(nama, alamat, nim);
        this.gaji = gaji;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        if (gaji >= 0.0 && gaji <= 4000000.0) {
            this.gaji = gaji;
        }
    }

    public void reset(String nama, String alamat, int noinduk, double gaji) {
        super.setNama(nama);
        super.setAlamat(alamat);
        super.setNoInduk(noinduk);
        this.gaji = gaji;
    }

    public String kualifikasi(double gaji) {
        if (gaji >= 2000000 && gaji <= 2750000) {
            return "Memuaskan";
        } else if (gaji >= 2760000 && gaji <= 3500000) {
            return "Sangat memuaskan";
        } else if (gaji >= 3510000 && gaji <= 4000000) {
            return "Sensational";
        } else {
            return "-";
        }
    }

    public void cetak() {
        super.cetak();
        System.out.println("Gaji        : " + gaji);
        System.out.println("Kualifikasi : " + kualifikasi(gaji));
    }
}

public class ManagerDemo {
    public static boolean isAlamatSama(Manager s1, Manager s2) {
        return s1.getAlamat().toLowerCase().equals(s2.getAlamat().toLowerCase());
    }

    public static double min2(double a, double b) {
        return Math.min(a, b);
    }

    public static void main(String[] args) {
        Manager s[] = new Manager[3];
        s[0] = new Manager("Dilan", "Bandung", 1, 3510000);
        s[1] = new Manager("Milea", "Jakarta", 2, 3000000);
        s[2] = new Manager();
        s[2].reset("Cinta", "Bandung", 3, 1750000);

        for (int i = 0; i < s.length; i++) {
            s[i].cetak();
            System.out.println("");
        }

        System.out.print("Alamat Dilan dan Cinta ");
        if (isAlamatSama(s[0], s[2]))
            System.out.println("sama");
        else
            System.out.println("tidak sama");

        double minGaji = min2(s[0].getGaji(), min2(s[1].getGaji(), s[2].getGaji()));
        if (minGaji == s[0].getGaji())
            System.out.println("Gaji terkecil adalah " + s[0].getGaji() + " milik " + s[0].getNama());
        else if (minGaji == s[1].getGaji())
            System.out.println("Gaji terkecil adalah " + s[1].getGaji() + " milik " + s[1].getNama());
        else
            System.out.println("Gaji terkecil adalah " + s[2].getGaji() + " milik " + s[2].getNama());
    }
}
