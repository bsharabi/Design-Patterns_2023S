package FinalProjectStudent.GUI;

import FinalProject.GUI.ManagementSystemUI;

import javax.swing.*;
import java.awt.*;
import java.util.HashMap;
import java.util.Map;

class UserInterface {

    private Map<String, JLabel> jLabelMap;
    private Map<String, JButton> jButtonMap;
    private JPanel panel;

    public UserInterface() {
        this.jButtonMap = new HashMap<>();
        this.jLabelMap = new HashMap<>();
        this.panel = new JPanel();
    }

    /**
     * Creates and returns the welcome panel displayed when the application starts.
     *
     * @return The welcome panel.
     */
    public JPanel createMenuPanel() {
        panel.setLayout(new BorderLayout());
        panel.setLayout(new GridLayout(7, 1));

        jLabelMap.put("welcome", new JLabel("Welcome to Management System Menu!"));
        jLabelMap.get("welcome").setHorizontalAlignment(JLabel.CENTER);
        panel.add(jLabelMap.get("welcome"), BorderLayout.CENTER);


        jButtonMap.put("AnimalMenu", new JButton("Animal Menu"));
        jButtonMap.get("AnimalMenu").addActionListener(e -> {
        });

        jButtonMap.put("EmployeeMenu", new JButton("Employee Menu"));
        jButtonMap.get("EmployeeMenu").addActionListener(e -> {
        });

        jButtonMap.put("EnclosureMenu", new JButton("Enclosure Menu"));
        jButtonMap.get("EnclosureMenu").addActionListener(e -> {
        });

        jButtonMap.put("ManagerMenu", new JButton("Manager Menu"));
        jButtonMap.get("ManagerMenu").addActionListener(e -> {
        });

        jButtonMap.put("VisitorMenu", new JButton("Visitor Menu"));
        jButtonMap.get("VisitorMenu").addActionListener(e -> {
        });

        jButtonMap.put("ExitMenu", new JButton("Exit Menu"));
        jButtonMap.get("ExitMenu").addActionListener(e -> {
            ManagementSystemUI.getUI().getFrame().dispose();
        });


        panel.add(jButtonMap.get("AnimalMenu"));
        panel.add(jButtonMap.get("EmployeeMenu"));
        panel.add(jButtonMap.get("EnclosureMenu"));
        panel.add(jButtonMap.get("ManagerMenu"));
        panel.add(jButtonMap.get("VisitorMenu"));
        panel.add(jButtonMap.get("ExitMenu"));

        return panel;
    }
}
