import javax.swing.*;
import java.awt.*;

public class EditorTab {

    private JPanel panel;

    public EditorTab() {
        panel = new JPanel(new BorderLayout());

        JTextArea textArea = new JTextArea();
        JButton clearBtn = new JButton("Clear");

        clearBtn.addActionListener(e -> textArea.setText(""));

        panel.add(new JScrollPane(textArea), BorderLayout.CENTER);
        panel.add(clearBtn, BorderLayout.SOUTH);
    }

    public JPanel getPanel() {
        return panel;
    }
}