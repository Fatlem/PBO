import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

class Mahasiswa {
    private String nim;
    private String nama;
    private int nilaiTugas;
    private int nilaiUts;
    private int nilaiUas;
    private double nilaiAkhir;
    private String nilaiHuruf;

    public Mahasiswa(String nim, String nama, int nilaiTugas, int nilaiUts, int nilaiUas) {
        this.nim = nim;
        this.nama = nama;
        this.nilaiTugas = nilaiTugas;
        this.nilaiUts = nilaiUts;
        this.nilaiUas = nilaiUas;
        hitungNilaiAkhir();
    }

    private void hitungNilaiAkhir() {
        // Hitung nilai akhir dengan bobot 30% tugas, 30% UTS, dan 40% UAS
        nilaiAkhir = (0.3 * nilaiTugas) + (0.3 * nilaiUts) + (0.4 * nilaiUas);

        // Hitung nilai huruf berdasarkan nilai akhir
        if (nilaiAkhir >= 80) {
            nilaiHuruf = "A";
        } else if (nilaiAkhir >= 70) {
            nilaiHuruf = "B";
        } else if (nilaiAkhir >= 60) {
            nilaiHuruf = "C";
        } else if (nilaiAkhir >= 50) {
            nilaiHuruf = "D";
        } else {
            nilaiHuruf = "E";
        }
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public int getNilaiTugas() {
        return nilaiTugas;
    }

    public int getNilaiUts() {
        return nilaiUts;
    }

    public int getNilaiUas() {
        return nilaiUas;
    }

    public double getNilaiAkhir() {
        return nilaiAkhir;
    }

    public String getNilaiHuruf() {
        return nilaiHuruf;
    }
}

public class FormNilai extends JFrame {
    private JTextField nimField;
    private JTextField namaField;
    private JTextField nilaiTugasField;
    private JTextField nilaiUtsField;
    private JTextField nilaiUasField;
    private JTextArea displayArea;
    private JTable table;
    private DefaultTableModel tableModel;

    private Mahasiswa[] mahasiswas;
    private int jumlahMahasiswa;

    public FormNilai() {
        super("Input Nilai Mahasiswa");

        JLabel nimLabel = new JLabel("NIM:");
        JLabel namaLabel = new JLabel("Nama:");
        JLabel nilaiTugasLabel = new JLabel("Nilai Tugas:");
        JLabel nilaiUtsLabel = new JLabel("Nilai UTS:");
        JLabel nilaiUasLabel = new JLabel("Nilai UAS:");

        nimField = new JTextField(10);
        namaField = new JTextField(20);
        nilaiTugasField = new JTextField(5);
        nilaiUtsField = new JTextField(5);
        nilaiUasField = new JTextField(5);

        JButton submitButton = new JButton("Submit");
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                try {
                    String nim = nimField.getText();
                    String nama = namaField.getText();
                    int nilaiTugas = Integer.parseInt(nilaiTugasField.getText());
                    int nilaiUts = Integer.parseInt(nilaiUtsField.getText());
                    int nilaiUas = Integer.parseInt(nilaiUasField.getText());

                    tambahMahasiswa(nim, nama, nilaiTugas, nilaiUts, nilaiUas);
                    clearFields();
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Input harus berupa angka!");
                }
            }
        });

        displayArea = new JTextArea(15, 30);
        displayArea.setEditable(false);

        tableModel = new DefaultTableModel();
        tableModel.addColumn("NIM");
        tableModel.addColumn("Nama");
        tableModel.addColumn("Nilai Tugas");
        tableModel.addColumn("Nilai UTS");
        tableModel.addColumn("Nilai UAS");
        tableModel.addColumn("Nilai Akhir");
        tableModel.addColumn("Nilai Huruf");

        table = new JTable(tableModel);

        JPanel inputPanel = new JPanel(new GridLayout(6, 2));
        inputPanel.add(nimLabel);
        inputPanel.add(nimField);
        inputPanel.add(namaLabel);
        inputPanel.add(namaField);
        inputPanel.add(nilaiTugasLabel);
        inputPanel.add(nilaiTugasField);
        inputPanel.add(nilaiUtsLabel);
        inputPanel.add(nilaiUtsField);
        inputPanel.add(nilaiUasLabel);
        inputPanel.add(nilaiUasField);
        inputPanel.add(submitButton);

        JScrollPane scrollPane = new JScrollPane(displayArea);
        JScrollPane tableScrollPane = new JScrollPane(table);

        Container container = getContentPane();
        container.add(inputPanel, BorderLayout.NORTH);
        container.add(tableScrollPane, BorderLayout.CENTER);
    }

    private void tambahMahasiswa(String nim, String nama, int nilaiTugas, int nilaiUts, int nilaiUas) {
        Mahasiswa mhs = new Mahasiswa(nim, nama, nilaiTugas, nilaiUts, nilaiUas);
        Object[] rowData = { mhs.getNim(), mhs.getNama(), mhs.getNilaiTugas(), mhs.getNilaiUts(),
                mhs.getNilaiUas(), mhs.getNilaiAkhir(), mhs.getNilaiHuruf() };
        tableModel.addRow(rowData);
    }

    private void clearFields() {
        nimField.setText("");
        namaField.setText("");
        nilaiTugasField.setText("");
        nilaiUtsField.setText("");
        nilaiUasField.setText("");
    }

    public static void main(String[] args) {
        FormNilai form = new FormNilai();
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setSize(600, 400);
        form.setVisible(true);
    }
}
