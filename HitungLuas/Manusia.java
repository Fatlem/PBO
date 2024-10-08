public class Manusia{
    // Atribut
    private String jenis;
    private String nama;
    private String gender;
    private int tinggi;
    private int umur;

    // Constructor
    public Manusia(String jenis, String nama, String gender, int tinggi, int umur) {
        this.jenis = jenis;
        this.nama = nama;
        this.gender = gender;
        this.tinggi = tinggi;
        this.umur = umur;
    }

    // Method Setter dan Getter
    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getJenis() {
        return jenis;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public int getUmur() {
        return umur;
    }

    public static void main(String[] args) {
        // Membuat objek manusia
        Manusia manusia1 = new Manusia("Skizo", "Hkem", "Laki-laki", 170, 19);
        
        // Menampilkan atribut manusia
        System.out.println("Jenis   : " + manusia1.getJenis());
        System.out.println("Nama    : " + manusia1.getNama());
        System.out.println("Gender  : " + manusia1.getGender());
        System.out.println("Tinggi  : " + manusia1.getTinggi() + " Cm");
        System.out.println("Umur    : " + manusia1.getUmur() + " Tahun");
        System.out.println("===========================================================");
 
        // Membuat objek manusia
        Manusia manusia2 = new Manusia("Wibu", "Wildan", "Laki-laki", 172, 20);
        
        // Menampilkan atribut manusia
        System.out.println("Jenis   : " + manusia2.getJenis());
        System.out.println("Nama    : " + manusia2.getNama());
        System.out.println("Gender  : " + manusia2.getGender());
        System.out.println("Tinggi  : " + manusia2.getTinggi() + " Cm");
        System.out.println("Umur    : " + manusia2.getUmur() + " Tahun");
        System.out.println("===========================================================");

        // Membuat objek manusia
        Manusia manusia3 = new Manusia("Otaku", "Fatlem", "Laki-laki", 172, 19);
        
        // Menampilkan atribut manusia
        System.out.println("Jenis   : " + manusia3.getJenis());
        System.out.println("Nama    : " + manusia3.getNama());
        System.out.println("Gender  : " + manusia3.getGender());
        System.out.println("Tinggi  : " + manusia3.getTinggi() + " Cm");
        System.out.println("Umur    : " + manusia3.getUmur() + " Tahun");
        System.out.println("===========================================================");
    }
}
