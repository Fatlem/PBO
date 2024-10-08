public class Lat2_6 {
    public static void main(String[] args) {
        int baris = 4;
        int kolom = 5;
        int num = 1;

        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}