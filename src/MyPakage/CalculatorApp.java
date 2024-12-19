package MyPakage;

import javax.swing.SwingUtilities;

public class CalculatorApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CalculatorUI().setVisible(true));
    }
}
