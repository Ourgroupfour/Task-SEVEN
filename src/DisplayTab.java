import javax.swing.*;
import java.awt.*;

public class DisplayTab {

    private JPanel panel;
    private JLabel nameLabel;

    public DisplayTab() {
        panel = new JPanel(new FlowLayout());

        nameLabel = new JLabel("No data yet");

        panel.add(nameLabel);
    }

    public JPanel getPanel() {
        return panel;
    }

    public void updateData(String name) {
        nameLabel.setText("Name: " + name);
    }
}