abstract class Bangun2D {
    public abstract void cetakLuas();
    public abstract void cetakKeliling();
}

class BujurSangkar extends Bangun2D {
    private int sisi;

    public BujurSangkar(int sisi) {
        this.sisi = sisi;
        System.out.println("Sisi Bujur Sangkar : " + sisi);
    }

    public void cetakLuas() {
        int luas = sisi * sisi;
        System.out.println("Luas Bujur Sangkar : " + luas);
    }

    public void cetakKeliling() {
        int keliling = 4 * sisi;
        System.out.println("Keliling Bujur Sangkar : " + keliling);
    }
}

public class Bangun2DDemo {
    public static void main(String[] args) {
        BujurSangkar bs = new BujurSangkar(5);
        bs.cetakKeliling();
        bs.cetakLuas();
    }
}
