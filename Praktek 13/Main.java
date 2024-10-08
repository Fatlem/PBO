// Main.java
class Main {
    public static void main(String[] args) {
        MedicineModel model = new MedicineModel();
        MedicineView view = new MedicineView();
        MedicineController controller = new MedicineController(model, view);

        view.setVisible(true);
    }
}
