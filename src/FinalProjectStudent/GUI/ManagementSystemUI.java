
package FinalProjectStudent.GUI;

import FinalProject.GUI.UserInterface;

import javax.swing.*;
import java.awt.*;

/**
 * The {@code ManagementSystemUI} class represents the graphical user interface for a management system.
 * It provides a simple interface for managing different aspects of the system.
 */
public class ManagementSystemUI {

    private JFrame frame;
    private JPanel currentPanel;

    private static ManagementSystemUI single = null;

    /**
     * Constructs a new {@code ManagementSystemUI} instance.
     * Initializes the main frame, sets up the initial panel, and displays the user interface.
     */
    private ManagementSystemUI() {
        frame = new JFrame("Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);

        currentPanel = createWelcomePanel();

        frame.setLocationRelativeTo(null);

        frame.add(currentPanel);
        frame.setVisible(true);
    }

    /**
     * Gets the singleton instance of the {@code ManagementSystemUI} class.
     *
     * @return The singleton instance of the user interface.
     */
    static public ManagementSystemUI getUI() {
        if (single == null)
            single = new ManagementSystemUI();
        return single;
    }

    /**
     * Gets the main JFrame of the user interface.
     *
     * @return The main JFrame of the user interface.
     */
    public JFrame getFrame() {
        return frame;
    }

    /**
     * Creates and returns the welcome panel displayed when the application starts.
     *
     * @return The welcome panel.
     */
    private JPanel createWelcomePanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        JLabel welcomeLabel = new JLabel("Welcome to Management System!");
        welcomeLabel.setHorizontalAlignment(JLabel.CENTER);
        panel.add(welcomeLabel, BorderLayout.CENTER);

        JLabel label = new JLabel("Press the button to continue!");
        label.setHorizontalAlignment(JLabel.CENTER);
        panel.add(label, BorderLayout.CENTER);

        JButton continueButton = new JButton("Continue");
        continueButton.addActionListener(e -> {
            replacePanel(new FinalProject.GUI.UserInterface().createMenuPanel());
        });

        panel.add(continueButton, BorderLayout.SOUTH);

        return panel;
    }

    /**
     * Replaces the current panel with a new panel in the user interface.
     *
     * @param panel The new panel to be displayed.
     * @return {@code true} if the panel was successfully replaced, {@code false} otherwise.
     */
    public boolean replacePanel(JPanel panel) {
        frame.remove(currentPanel);
        currentPanel = panel;
        frame.add(panel);
        frame.revalidate();
        frame.repaint();
        return true;
    }

    /**
     * The entry point for the management system user interface.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ManagementSystemUI.getUI();

        });
    }
}
