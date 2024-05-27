package UebungExcep.ArasakaAegisSecurity;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Dimension;
import java.awt.Toolkit;

public class GuiAegis extends JFrame {

    private JLabel labelOperand1;
    private JLabel labelOperand2;
    private JLabel labelOperator;

    private JTextField fieldOperand1;
    private JTextField fieldOperand2;

    private JButton buttonRechner;

    private String operator;

    public GuiAegis(String titel, String operator) {
        this.operator = operator;

        setTitle(titel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        windowSize();

        setResizable(false);

        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void windowSize() {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) (screenSize.width * 0.5);
        int height = (int) (screenSize.height * 0.5);

        setSize(width, height);

    }

}
