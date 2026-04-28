package mypackage;

import java.util.ArrayList;
import java.util.Scanner;

public class RemoveElement {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        colors.add("Red");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");

        System.out.println("Original list: " + colors);

        System.out.print("Enter index to remove: ");
        int n = sc.nextInt();

        if (n >= 0 && n < colors.size()) {
            colors.remove(n);
            System.out.println("Updated list: " + colors);
        } else {
            System.out.println("Invalid index!");
        }

        sc.close();
    }
}