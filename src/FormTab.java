import javax.swing.*;
import java.awt.*;

public class FormTab {

    private JPanel panel;
    private JTextField nameField, emailField;
    private JTextArea addressArea;

    public FormTab() {
        panel = new JPanel(new GridLayout(6, 2, 10, 10));

        panel.add(new JLabel("Name:"));
        nameField = new JTextField();
        panel.add(nameField);

        panel.add(new JLabel("Email:"));
        emailField = new JTextField();
        panel.add(emailField);

        panel.add(new JLabel("Address:"));
        addressArea = new JTextArea(3, 20);
        panel.add(new JScrollPane(addressArea));

        JButton submitBtn = new JButton("Submit");
        JButton resetBtn = new JButton("Reset");

        panel.add(submitBtn);
        panel.add(resetBtn);

        submitBtn.addActionListener(e -> {
            JOptionPane.showMessageDialog(panel, "Submitted!");
        });

        resetBtn.addActionListener(e -> {
            nameField.setText("");
            emailField.setText("");
            addressArea.setText("");
        });
    }

    public JPanel getPanel() {
        return panel;
    }
}