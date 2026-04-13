import javax.swing.*;

public class MainFrame {

    JFrame frame;
    JTabbedPane tabbedPane;

    public MainFrame() {
        frame = new JFrame("Student Management System");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        tabbedPane = new JTabbedPane();

        // Create tab objects
        FormTab formTab = new FormTab();
        CalculatorTab calculatorTab = new CalculatorTab();
        EditorTab editorTab = new EditorTab();
        DisplayTab displayTab = new DisplayTab();
        ActionsTab actionsTab = new ActionsTab();

        // Add panels (NOT objects)
        tabbedPane.addTab("Form", formTab.getPanel());
        tabbedPane.addTab("Calculator", calculatorTab.getPanel());
        tabbedPane.addTab("Editor", editorTab.getPanel());
        tabbedPane.addTab("Display", displayTab.getPanel());
        tabbedPane.addTab("Actions", actionsTab.getPanel());

        frame.add(tabbedPane);
        frame.setVisible(true);
    }
}