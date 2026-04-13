import javax.swing.*;
import java.awt.*;

public class ActionsTab {

    private JPanel panel;

    public ActionsTab() {
        panel = new JPanel(new FlowLayout());

        JButton colorBtn = new JButton("Change Color");
        JButton exitBtn = new JButton("Exit");

        panel.add(colorBtn);
        panel.add(exitBtn);

        colorBtn.addActionListener(e -> {
            panel.setBackground(Color.LIGHT_GRAY);
        });

        exitBtn.addActionListener(e -> System.exit(0));
    }

    public JPanel getPanel() {
        return panel;
    }
}