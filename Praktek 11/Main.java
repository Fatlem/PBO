class Mebel {
    protected int harga;
    protected String bahan;

    public Mebel(int harga, String bahan) {
        this.harga = harga;
        this.bahan = bahan;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public String getBahan() {
        return bahan;
    }

    public void setBahan(String bahan) {
        this.bahan = bahan;
    }
}

class Almari extends Mebel {
    protected boolean roda;

    public Almari(int harga, String bahan, boolean roda) {
        super(harga, bahan);
        this.roda = roda;
    }

    public boolean hasRoda() {
        return roda;
    }

    public void setRoda(boolean roda) {
        this.roda = roda;
    }
}

class AlmariMakan extends Almari implements Discountable {
    private int jmlRoda;

    public AlmariMakan(int harga, String bahan, boolean roda, int jmlRoda) {
        super(harga, bahan, roda);
        this.jmlRoda = jmlRoda;
    }

    public void discount(int harga) {
        this.harga -= harga;
    }

    public int getJmlRoda() {
        return jmlRoda;
    }

    public void setJmlRoda(int jmlRoda) {
        this.jmlRoda = jmlRoda;
    }
}

class AlmariPakaian extends Almari implements Discountable {
    private int jmlPintu;

    public AlmariPakaian(int harga, String bahan, boolean roda, int jmlPintu) {
        super(harga, bahan, roda);
        this.jmlPintu = jmlPintu;
    }

    public void discount(int harga) {
        this.harga -= harga;
    }

    public int getJmlPintu() {
        return jmlPintu;
    }

    public void setJmlPintu(int jmlPintu) {
        this.jmlPintu = jmlPintu;
    }
}

class Meja extends Mebel {
    protected int jmlKaki;

    public Meja(int harga, String bahan, int jmlKaki) {
        super(harga, bahan);
        this.jmlKaki = jmlKaki;
    }

    public int getJmlKaki() {
        return jmlKaki;
    }

    public void setJmlKaki(int jmlKaki) {
        this.jmlKaki = jmlKaki;
    }
}

class MejaMakan extends Meja implements Discountable {
    private int jmlKursi;

    public MejaMakan(int harga, String bahan, int jmlKaki, int jmlKursi) {
        super(harga, bahan, jmlKaki);
        this.jmlKursi = jmlKursi;
    }

    public void discount(int harga) {
        this.harga -= harga;
    }

    public int getJmlKursi() {
        return jmlKursi;
    }

    public void setJmlKursi(int jmlKursi) {
        this.jmlKursi = jmlKursi;
    }
}

class MejaTamu extends Meja implements Discountable {
    private String bentukKaca;

    public MejaTamu(int harga, String bahan, int jmlKaki, String bentukKaca) {
        super(harga, bahan, jmlKaki);
        this.bentukKaca = bentukKaca;
    }

    public void discount(int harga) {
        this.harga -= harga;
    }

    public String getBentukKaca() {
        return bentukKaca;
    }

    public void setBentukKaca(String bentukKaca) {
        this.bentukKaca = bentukKaca;
    }
}

interface Discountable {
    void discount(int harga);
}

public class Main {
    public static void main(String[] args) {
        AlmariMakan almariMakan = new AlmariMakan(5000000, "Kayu Jati", true, 4);
        almariMakan.discount(500000);
        System.out.println("Harga Almari Makan setelah diskon: " + almariMakan.getHarga());

        AlmariPakaian almariPakaian = new AlmariPakaian(7000000, "Kayu Mahoni", false, 3);
        almariPakaian.discount(700000);
        System.out.println("Harga Almari Pakaian setelah diskon: " + almariPakaian.getHarga());

        MejaMakan mejaMakan = new MejaMakan(3000000, "Kayu Oak", 4, 6);
        mejaMakan.discount(300000);
        System.out.println("Harga Meja Makan setelah diskon: " + mejaMakan.getHarga());

        MejaTamu mejaTamu = new MejaTamu(2500000, "Kayu Pinus", 4, "Bulat");
        mejaTamu.discount(250000);
        System.out.println("Harga Meja Tamu setelah diskon: " + mejaTamu.getHarga());
    }
}
