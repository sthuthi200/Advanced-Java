package com.example.arraylistdemo;

import java.util.*;

public class ColorsArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>(Arrays.asList("Red", "Green", "Blue", "Yellow"));
        System.out.println("Original Colors: " + colors);

        // Remove 2nd element (index 1)
        colors.remove(1);

        // Remove "Blue"
        colors.remove("Blue");

        System.out.println("After removals: " + colors);
    }
}
