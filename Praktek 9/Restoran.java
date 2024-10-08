import java.util.Scanner;
import java.util.ArrayList;

class MenuItem {
    private String name;
    private double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return name + " Rp" + price;
    }
}

class Order {
    private ArrayList<MenuItem> items;

    public Order() {
        this.items = new ArrayList<>();
    }

    public void addItem(MenuItem item) {
        items.add(item);
    }

    public double calculateTotal() {
        double total = 0;
        for (MenuItem item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void displayOrder() {
        System.out.println("======================================== ");
        System.out.println("Pesanan Anda : ");
        for (MenuItem item : items) {
            System.out.println(item);
        }
        System.out.println("======================================== ");
        System.out.println("Total : Rp" + calculateTotal());
        System.out.println("======================================== ");
    }
}

public class Restoran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Order order = new Order();

        // Menu restoran
        MenuItem[] menu = {
            new MenuItem("Sweet Potato Fries      | ", 32500),
            new MenuItem("Tokyo Nanban Checken    | ", 40000),
            new MenuItem("Textural Musroom Forest | ", 50000),
            new MenuItem("Lemon Tea               | ", 27500),
            new MenuItem("Nutella Crumbele        | ", 50000),
            new MenuItem("Matcha                  | ", 35000)
        };

        // Tampilkan menu
        System.out.println("======================================== ");
        System.out.println("Menu Restoran : ");
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + ". " + menu[i]);
        }

        // Proses pemesanan
        while (true) {
            System.out.println("======================================== ");
            System.out.print("Masukkan Nomor Pesanan (0 Untuk Selesaikan Pesanan) : ");
            int choice = scanner.nextInt();
            if (choice == 0) {
                break;
            }
            if (choice > 0 && choice <= menu.length) {
                order.addItem(menu[choice - 1]);
                System.out.println(menu[choice - 1].getName() + "Telah Ditambahkan Ke Pesanan Anda.");
            } else {
                System.out.println("Nomor Pesanan Tidak valid. Silakan Coba Lagi.");
            }
        }

        // Tampilkan pesanan dan total harga
        order.displayOrder();

        scanner.close();
    }
}
