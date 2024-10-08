import java.util.ArrayList;
class Medicine{
    private String name;
    private int stock;

    public Medicine(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}

class MedicineModel {
    private ArrayList<Medicine> medicines;

    public MedicineModel() {
        medicines = new ArrayList<>();
    }

    public ArrayList<Medicine> getMedicines() {
        return medicines;
    }

    public void addMedicine(Medicine medicine) {
        medicines.add(medicine);
    }
}