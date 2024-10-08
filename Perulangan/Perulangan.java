public class Perulangan {
    void whileNgentot() {
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
    }

    void doWhileNgentot() {
        int i = 1;
        do {
            System.out.print(i + " ");
            i++;
        } while (i <= 10);
    }

    void forNgentot() {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
    }
}