import javax.swing.*;
import java.awt.*;

public class CalculatorTab {

    private JPanel panel;

    public CalculatorTab() {
        panel = new JPanel(new FlowLayout());

        JTextField num1 = new JTextField(5);
        JTextField num2 = new JTextField(5);
        JLabel result = new JLabel("Result: ");

        JButton addBtn = new JButton("Add");

        panel.add(num1);
        panel.add(num2);
        panel.add(addBtn);
        panel.add(result);

        addBtn.addActionListener(e -> {
            int n1 = Integer.parseInt(num1.getText());
            int n2 = Integer.parseInt(num2.getText());
            result.setText("Result: " + (n1 + n2));
        });
    }

    public JPanel getPanel() {
        return panel;
    }
}