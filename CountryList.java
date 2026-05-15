package swingexamples;

import javax.swing.*;
import javax.swing.event.*;

public class CountryList {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Country List Example");

        String[] countries = {"USA", "India", "Vietnam", "Canada", "Denmark", 
                              "France", "Great Britain", "Japan", "Africa", 
                              "Greenland", "Singapore"};

        JList<String> list = new JList<>(countries);
        list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    for (String country : list.getSelectedValuesList()) {
                        System.out.println(country);
                    }
                }
            }
        });

        frame.add(new JScrollPane(list));
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
