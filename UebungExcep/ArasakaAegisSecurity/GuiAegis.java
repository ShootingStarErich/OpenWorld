package UebungExcep.ArasakaAegisSecurity;

import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Toolkit;

public class GuiAegis extends JFrame {
    // (View) ist für die Darstellung verantwortlich

    public GuiAegis(String titel, String operator) {

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
