import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KalkulatorSederhana extends JFrame implements ActionListener {
    private JTextField textField1, textField2, resultField;
    private JButton addButton, subtractButton, multiplyButton, divideButton;

    public KalkulatorSederhana() {
        setTitle("Kalkulator Sederhana");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Panel untuk input nilai
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new GridLayout(3, 2, 10, 10));
        
        JLabel label1 = new JLabel("Nilai 1:");
        textField1 = new JTextField();
        JLabel label2 = new JLabel("Nilai 2:");
        textField2 = new JTextField();
        JLabel labelResult = new JLabel("Hasil:");
        resultField = new JTextField();
        resultField.setEditable(false);

        inputPanel.add(label1);
        inputPanel.add(textField1);
        inputPanel.add(label2);
        inputPanel.add(textField2);
        inputPanel.add(labelResult);
        inputPanel.add(resultField);

        // Panel untuk tombol operasi
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(1, 4, 10, 10));

        addButton = new JButton("Tambah");
        subtractButton = new JButton("Kurang");
        multiplyButton = new JButton("Kali");
        divideButton = new JButton("Bagi");

        addButton.addActionListener(this);
        subtractButton.addActionListener(this);
        multiplyButton.addActionListener(this);
        divideButton.addActionListener(this);

        buttonPanel.add(addButton);
        buttonPanel.add(subtractButton);
        buttonPanel.add(multiplyButton);
        buttonPanel.add(divideButton);

        // Menambahkan panel ke frame
        add(inputPanel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }

    public void actionPerformed(ActionEvent e) {
        double num1, num2, result = 0;
        boolean validInput = true;

        try {
            num1 = Double.parseDouble(textField1.getText());
            num2 = Double.parseDouble(textField2.getText());
        } catch (NumberFormatException ex) {
            resultField.setText("Input tidak valid");
            return;
        }

        if (e.getSource() == addButton) {
            result = num1 + num2;
        } else if (e.getSource() == subtractButton) {
            result = num1 - num2;
        } else if (e.getSource() == multiplyButton) {
            result = num1 * num2;
        } else if (e.getSource() == divideButton) {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                resultField.setText("Tidak dapat dibagi nol");
                validInput = false;
            }
        }

        if (validInput) {
            resultField.setText(String.valueOf(result));
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            KalkulatorSederhana frame = new KalkulatorSederhana();
            frame.setVisible(true);
        });
    }
}