package roulette;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static roulette.CellsRoullette.randomCellNumber;

public class WindowRoulette extends JPanel{

    private static int WIDTH = 800;
    private static int HEIGHT = 600;
    JLabel cellNumber;

    public WindowRoulette() {
        JFrame frame = new JFrame("ROULETTE");
        frame.setSize(WIDTH, HEIGHT);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        JPanel panel = new JPanel(new GridLayout(0, 1));
        panel.setBorder(
                BorderFactory.createEmptyBorder(30, 30, 10, 30)
        );
        panel.add(cellNumber);
        frame.add(panel, BorderLayout.CENTER);
        cellNumber.setText("randomCellNumber");

    }

}
