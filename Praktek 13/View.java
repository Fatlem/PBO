import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

class MedicineView extends JFrame {
    private JTextField nameField;
    private JTextField stockField;
    private JButton addButton;
    private JTextArea displayArea;

    public MedicineView() {
        setTitle("Manajemen Stok Obat");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        nameField = new JTextField(15);
        stockField = new JTextField(5);
        addButton = new JButton("Tambah Obat");
        displayArea = new JTextArea();
        displayArea.setEditable(false);

        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("Nama Obat:"));
        inputPanel.add(nameField);
        inputPanel.add(new JLabel("Stok:"));
        inputPanel.add(stockField);
        inputPanel.add(addButton);

        setLayout(new BorderLayout());
        add(inputPanel, BorderLayout.NORTH);
        add(new JScrollPane(displayArea), BorderLayout.CENTER);
    }

    public String getMedicineName() {
        return nameField.getText();
    }

    public int getMedicineStock() {
        return Integer.parseInt(stockField.getText());
    }

    public JButton getAddButton() {
        return addButton;
    }

    public void displayMedicines(ArrayList<Medicine> medicines) {
        displayArea.setText("");
        for (Medicine medicine : medicines) {
            displayArea.append("Nama: " + medicine.getName() + ", Stok: " + medicine.getStock() + "\n");
        }
    }

    public void clearFields() {
        nameField.setText("");
        stockField.setText("");
    }
}
