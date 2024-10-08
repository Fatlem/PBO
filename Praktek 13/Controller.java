import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class MedicineController {
    private MedicineModel model;
    private MedicineView view;

    public MedicineController(MedicineModel model, MedicineView view) {
        this.model = model;
        this.view = view;

        this.view.getAddButton().addActionListener(new ActionListener() {
   
            public void actionPerformed(ActionEvent e) {
                String name = view.getMedicineName();
                int stock = view.getMedicineStock();
                Medicine medicine = new Medicine(name, stock);
                model.addMedicine(medicine);
                view.displayMedicines(model.getMedicines());
                view.clearFields();
            }
        });
    }
}
