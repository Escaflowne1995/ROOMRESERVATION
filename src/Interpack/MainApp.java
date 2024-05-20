/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interpack;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

/**
 *
 * @author JoanMichelle
 */
public class MainApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            // Create the main frame
            JFrame mainFrame = new JFrame("Manager Application");
            mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mainFrame.setSize(800, 600);  // Set appropriate size

            // Create a desktop pane to hold internal frames
            JDesktopPane desktopPane = new JDesktopPane();

            // Create an instance of ManagerPage and add it to the desktop pane
            ManagerPage managerPage = new ManagerPage();
            desktopPane.add(managerPage);
            managerPage.setVisible(true);  // Make the internal frame visible

            // Add the desktop pane to the main frame
            mainFrame.add(desktopPane);

            // Make the main frame visible
            mainFrame.setVisible(true);
        });
    }
}
