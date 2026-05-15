package swingexamples;

import javax.swing.*;
import java.awt.event.*;

public class CountryButton {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Country Button Example");
        JButton btnSri = new JButton("Srilanka");
        JButton btnInd = new JButton("India");
        JLabel label = new JLabel("", JLabel.CENTER);

        btnSri.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Srilanka is pressed");
            }
        });

        btnInd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("India is pressed");
            }
        });

        frame.setLayout(new java.awt.GridLayout(3, 1));
        frame.add(btnSri);
        frame.add(btnInd);
        frame.add(label);

        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
