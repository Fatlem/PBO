import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class MainFrame extends JFrame {
    private SistemManajemenDarurat sistemManajemenDarurat;
    private DefaultListModel<String> penggunaListModel;
    private DefaultListModel<String> bencanaListModel;
    private DefaultListModel<String> laporanBencanaListModel;

    public MainFrame() {
        sistemManajemenDarurat = new SistemManajemenDarurat();
        penggunaListModel = new DefaultListModel<>();
        bencanaListModel = new DefaultListModel<>();
        laporanBencanaListModel = new DefaultListModel<>();

        setTitle("Sistem Manajemen Tanggap Darurat Bencana");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Panel utama
        JPanel mainPanel = new JPanel(new BorderLayout());

        // Panel pengguna
        JPanel penggunaPanel = new JPanel(new BorderLayout());
        penggunaPanel.setBorder(BorderFactory.createTitledBorder("Pengguna"));
        JList<String> penggunaList = new JList<>(penggunaListModel);
        JScrollPane penggunaScrollPane = new JScrollPane(penggunaList);
        penggunaPanel.add(penggunaScrollPane, BorderLayout.CENTER);
        JButton addPenggunaButton = new JButton("Tambah Pengguna");
        addPenggunaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tambahPengguna();
            }
        });
        penggunaPanel.add(addPenggunaButton, BorderLayout.SOUTH);

        // Panel bencana
        JPanel bencanaPanel = new JPanel(new BorderLayout());
        bencanaPanel.setBorder(BorderFactory.createTitledBorder("Bencana"));
        JList<String> bencanaList = new JList<>(bencanaListModel);
        JScrollPane bencanaScrollPane = new JScrollPane(bencanaList);
        bencanaPanel.add(bencanaScrollPane, BorderLayout.CENTER);
        JButton addBencanaButton = new JButton("Tambah Bencana");
        addBencanaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tambahBencana();
            }
        });
        bencanaPanel.add(addBencanaButton, BorderLayout.SOUTH);

        // Panel laporan bencana
        JPanel laporanBencanaPanel = new JPanel(new BorderLayout());
        laporanBencanaPanel.setBorder(BorderFactory.createTitledBorder("Laporan Bencana"));
        JList<String> laporanBencanaList = new JList<>(laporanBencanaListModel);
        JScrollPane laporanBencanaScrollPane = new JScrollPane(laporanBencanaList);
        laporanBencanaPanel.add(laporanBencanaScrollPane, BorderLayout.CENTER);
        JButton addLaporanBencanaButton = new JButton("Tambah Laporan Bencana");
        addLaporanBencanaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tambahLaporanBencana();
            }
        });
        laporanBencanaPanel.add(addLaporanBencanaButton, BorderLayout.SOUTH);

        // Tambahkan panel-panel ke mainPanel
        mainPanel.add(penggunaPanel, BorderLayout.WEST);
        mainPanel.add(bencanaPanel, BorderLayout.CENTER);
        mainPanel.add(laporanBencanaPanel, BorderLayout.EAST);

        add(mainPanel, BorderLayout.CENTER);
    }

    private void tambahPengguna() {
        String namaPengguna = JOptionPane.showInputDialog(this, "Masukkan nama pengguna:");
        if (namaPengguna != null && !namaPengguna.trim().isEmpty()) {
            Pengguna penggunaBaru = new Pengguna(sistemManajemenDarurat.getPengguna().size() + 1, namaPengguna);
            sistemManajemenDarurat.tambahPengguna(penggunaBaru);
            penggunaListModel.addElement(penggunaBaru.getNama());
        } else {
            JOptionPane.showMessageDialog(this, "Nama pengguna tidak boleh kosong!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void tambahBencana() {
        JTextField jenisField = new JTextField();
        JTextField lokasiField = new JTextField();
        JTextField tingkatField = new JTextField();
        JTextField tanggalField = new JTextField();
        JTextField statusField = new JTextField();

        Object[] message = {
                "Jenis Bencana:", jenisField,
                "Lokasi:", lokasiField,
                "Tingkat Keparahan:", tingkatField,
                "Tanggal Kejadian:", tanggalField,
                "Status:", statusField
        };

        int option = JOptionPane.showConfirmDialog(this, message, "Tambah Bencana", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            Bencana bencanaBaru = new Bencana(
                    sistemManajemenDarurat.getBencana().size() + 1,
                    jenisField.getText(),
                    lokasiField.getText(),
                    tingkatField.getText(),
                    tanggalField.getText(),
                    statusField.getText()
            );
            sistemManajemenDarurat.tambahBencana(bencanaBaru);
            bencanaListModel.addElement(bencanaBaru.getJenisBencana() + " - " + bencanaBaru.getLokasi());
        }
    }

    private void tambahLaporanBencana() {
        JTextField penggunaField = new JTextField();
        JTextField jenisField = new JTextField();
        JTextField deskripsiField = new JTextField();
        JTextField tanggalField = new JTextField();
        JTextField statusField = new JTextField();

        Object[] message = {
                "Pengguna Pelapor:", penggunaField,
                "Jenis Bencana:", jenisField,
                "Deskripsi:", deskripsiField,
                "Tanggal Laporan:", tanggalField,
                "Status Verifikasi:", statusField
        };

        int option = JOptionPane.showConfirmDialog(this, message, "Tambah Laporan Bencana", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            Pengguna pelapor = sistemManajemenDarurat.cariPengguna(Integer.parseInt(penggunaField.getText()));
            if (pelapor != null) {
                LaporanBencana laporanBaru = new LaporanBencana(
                        sistemManajemenDarurat.cariLaporanBencana().size() + 1,
                        pelapor,
                        jenisField.getText(),
                        deskripsiField.getText(),
                        new Date(), // Sebagai contoh, gunakan tanggal saat ini
                        statusField.getText()
                );
                sistemManajemenDarurat.tambahLaporanBencana(laporanBaru);
                laporanBencanaListModel.addElement(laporanBaru.getJenisBencana() + " - " + laporanBaru.getPenggunaPelapor().getNama());
            } else {
                JOptionPane.showMessageDialog(this, "Pengguna tidak ditemukan!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MainFrame mainFrame = new MainFrame();
                mainFrame.setVisible(true);
            }
        });
    }
}
