package swingexamples;

import javax.swing.*;
import java.awt.event.*;

public class ImageButtonExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Image Button Example");
        JLabel label = new JLabel("", JLabel.CENTER);

        // Load images
        ImageIcon digitalIcon = new ImageIcon("digital.png");
        ImageIcon hourglassIcon = new ImageIcon("hourglass.png");

        JButton btnDigital = new JButton("Digital Clock", digitalIcon);
        JButton btnHourglass = new JButton("Hour Glass", hourglassIcon);

        btnDigital.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Digital Clock is pressed");
            }
        });

        btnHourglass.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Hour Glass is pressed");
            }
        });

        frame.setLayout(new java.awt.GridLayout(3, 1));
        frame.add(btnDigital);
        frame.add(btnHourglass);
        frame.add(label);

        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
