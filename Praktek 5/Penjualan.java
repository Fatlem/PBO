public class Penjualan {
    private String kode;
    private String nama;
    private float harga;
    private int jumlah;

    // Method uUtuk Mengatur Data Penjualan
    public void setData(String kode, String nama, float harga, int jumlah) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.jumlah = jumlah;
    }

    // Method Untuk Menghitung Total Pembelian
    public float getTotalPembelian() {
        return harga * jumlah;
    }

    // Method Untuk Mendapatkan Bonus
    public String getBonus() {
        float totalPembelian = getTotalPembelian();
        if (totalPembelian >= 500000 && jumlah > 5) {
            return "Setrika";
        } else if (totalPembelian >= 100000 && jumlah > 3) {
            return "Payung";
        } else if (totalPembelian >= 50000 || jumlah > 2) {
            return "Ballpoint";
        } else {
            return "Tidak ada bonus";
        }
    }

    // Method Untuk Mencetak Nota
    public void cetakNota() {
        System.out.println("Kode Barang     : " + kode);
        System.out.println("Nama Barang     : " + nama);
        System.out.println("Harga Barang    : " + harga);
        System.out.println("Jumlah Barang   : " + jumlah);
        System.out.println("Total Pembelian : " + getTotalPembelian());
        System.out.println("Bonus           : " + getBonus());
        System.out.println();
    }
    public static void main(String[] args) {
        // Membuat Objek Penjualan
        Penjualan penjualan1 = new Penjualan();
        Penjualan penjualan2 = new Penjualan();
        Penjualan penjualan3 = new Penjualan();

        // Mengatur Data Penjualan
        penjualan1.setData("001", "Costum Cosplay", 1550000, 8);
        penjualan2.setData("002", "Figure",350000,5);
        penjualan3.setData("003", "Komik",75000,3);

        // Mencetak Nota Penjualan
        penjualan1.cetakNota();
        penjualan2.cetakNota();
        penjualan3.cetakNota();
    }
}
