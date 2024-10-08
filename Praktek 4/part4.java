public class part4 {
    public static void main(String[] args) {
        /*
         * Buat program menghitung luas dan keliling :
         * 1. Segitiga
         * 2. Lingkaran
         * 3. Kubus
         */

        // Segitiga
        double sisi = 6, alas = 7, tinggi = 10, luassegitiga, kelilingsegitiga;
        luassegitiga = 0.5 * alas * tinggi;
        kelilingsegitiga = sisi * sisi * sisi;

        System.out.println("luassegitiga: " + luassegitiga);
        System.out.println("kelilingsegitiga: " + kelilingsegitiga);

        System.out.println("-----------------------------------------------------------------");

        // lingkaran
        double phi = 3.14, r = 7, luaslingkaran, kelilinglingkaran;
        luaslingkaran = 2 * phi * r;
        kelilinglingkaran = phi * r * r;

        System.out.println("luaslingkaran: " + luaslingkaran);
        System.out.println("kelilinglingkaran: " + kelilinglingkaran);

        System.out.println("-----------------------------------------------------------------");

        // kubus
        double rusuk = 6, luaskubus, kelilingkubus;
        luaskubus = 6 * (rusuk * rusuk);
        kelilingkubus = 12 * rusuk;

        System.out.println("luaskubus: " + luaskubus);
        System.out.println("kelilingkubus: " + kelilingkubus);
    }
}