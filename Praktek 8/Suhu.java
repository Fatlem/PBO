import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Suhu extends JFrame {
    private JTextField n1, n2;
    private JButton prosesButton;
    private JTable tblSuhu;
    private JScrollPane scrollPane;
    private int baris, kol;
    private Object[][] dataTable = null;
    private String[] header = { "No", "Celcius", "Fahrenheit", "Kelvin", "Reamur" };

    public Suhu() {
        setTitle("Konversi Suhu");
        setSize(500, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 3));

        panel.add(new JLabel("Masukkan nilai awal:"));
        n1 = new JTextField();
        panel.add(n1);

        panel.add(new JLabel("Masukkan nilai akhir:"));
        n2 = new JTextField();
        panel.add(n2);

        prosesButton = new JButton("Proses");
        panel.add(prosesButton);

        getContentPane().add(panel, BorderLayout.NORTH);

        tblSuhu = new JTable();
        scrollPane = new JScrollPane(tblSuhu);
        getContentPane().add(scrollPane, BorderLayout.CENTER);

        prosesButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                prosesKonversi();
            }
        });
    }

    private void prosesKonversi() {
        try {
            int a = Integer.parseInt(n1.getText());
            int b = Integer.parseInt(n2.getText());
            kol = 5;
            baris = (b - a) + 1;
            dataTable = new Object[baris][kol];
            int x = 0;
            for (int c = a; c <= b; c++) {
                double fah = 1.8 * c + 32;
                double kel = c + 273.15;
                double rea = 0.8 * c;
                dataTable[x][0] = x + 1;
                dataTable[x][1] = c;
                dataTable[x][2] = fah;
                dataTable[x][3] = kel;
                dataTable[x][4] = rea;
                x++;
            }
            tblSuhu.setModel(new DefaultTableModel(dataTable, header));
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Masukkan angka yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Suhu().setVisible(true);
            }
        });
    }
}
