import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ApotekManagement extends JFrame {
    private DefaultTableModel tableModel;
    private JTable table;
    private JTextField textFieldNamaObat;
    private JTextField textFieldJumlah;
    private JTextField textFieldHarga;

    public ApotekManagement() {
        setTitle("Manajemen Stok Obat di Apotek");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        String[] columnNames = {"Nama Obat", "Jumlah", "Harga"};
        tableModel = new DefaultTableModel(columnNames, 0);
        table = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(table);
        add(scrollPane, BorderLayout.CENTER);

        JPanel panelInput = new JPanel(new GridLayout(4, 2));

        panelInput.add(new JLabel("Nama Obat :"));
        textFieldNamaObat = new JTextField();
        panelInput.add(textFieldNamaObat);

        panelInput.add(new JLabel("Jumlah    :"));
        textFieldJumlah = new JTextField();
        panelInput.add(textFieldJumlah);

        panelInput.add(new JLabel("Harga     :"));
        textFieldHarga = new JTextField();
        panelInput.add(textFieldHarga);

        JButton btnAdd = new JButton("Tambah");
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String namaObat = textFieldNamaObat.getText();
                String jumlah = textFieldJumlah.getText();
                String harga = textFieldHarga.getText();

                if (!namaObat.isEmpty() && !jumlah.isEmpty() && !harga.isEmpty()) {
                    tableModel.addRow(new Object[]{namaObat, jumlah, harga});
                    clearInputFields();
                } else {
                    JOptionPane.showMessageDialog(null, "Harap isi semua field!", "Peringatan", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        panelInput.add(btnAdd);

        JButton btnDelete = new JButton("Hapus");
        btnDelete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int selectedRow = table.getSelectedRow();
                if (selectedRow != -1) {
                    tableModel.removeRow(selectedRow);
                } else {
                    JOptionPane.showMessageDialog(null, "Pilih baris yang akan dihapus!", "Peringatan", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
        panelInput.add(btnDelete);

        add(panelInput, BorderLayout.SOUTH);
    }

    private void clearInputFields() {
        textFieldNamaObat.setText("");
        textFieldJumlah.setText("");
        textFieldHarga.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ApotekManagement().setVisible(true);
            }
        });
    }
}