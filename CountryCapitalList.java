package swingexamples;

import javax.swing.*;
import javax.swing.event.*;
import java.util.*;

public class CountryCapitalList {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Country Capital List");

        String[] countries = {"USA", "India", "Vietnam", "Canada", "Denmark", 
                              "France", "Great Britain", "Japan", "Africa", 
                              "Greenland", "Singapore"};

        Map<String, String> capitals = new HashMap<>();
        capitals.put("USA", "Washington D.C.");
        capitals.put("India", "New Delhi");
        capitals.put("Vietnam", "Hanoi");
        capitals.put("Canada", "Ottawa");
        capitals.put("Denmark", "Copenhagen");
        capitals.put("France", "Paris");
        capitals.put("Great Britain", "London");
        capitals.put("Japan", "Tokyo");
        capitals.put("Africa", "No single capital");
        capitals.put("Greenland", "Nuuk");
        capitals.put("Singapore", "Singapore");

        JList<String> list = new JList<>(countries);
        list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        list.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    for (String country : list.getSelectedValuesList()) {
                        System.out.println(country + " → " + capitals.get(country));
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