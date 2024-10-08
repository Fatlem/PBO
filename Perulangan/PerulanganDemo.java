public class PerulanganDemo {
    public static void main(String[] args) {
        Perulangan perulangan = new Perulangan();

        System.out.println("Menggunakan while:");
        perulangan.whileNgentot(); 

        // Perubahan disini
        System.out.println("\n\nMenggunakan do-while:");
        perulangan.doWhileNgentot(); 

        System.out.println("\n\nMenggunakan for:");
        perulangan.forNgentot(); // Perubahan disini
    }
}
