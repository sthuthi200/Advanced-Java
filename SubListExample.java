package mypackage;

import java.util.ArrayList;
import java.util.List;

public class SubListExample {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        System.out.println("Original list: " + colors);

        List<String> subList = colors.subList(0, 2);

        System.out.println("Extracted elements (1st and 2nd): " + subList);
    }
}