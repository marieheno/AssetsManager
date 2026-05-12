package org.example;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<Asset> myAssets = new ArrayList<>();

        myAssets.add(new House("My house","2026-03-20",15000, "234 Main street",
                1, 2000, 5000));

        myAssets.add(new House("Vacation home.", "2025-10-22", 250000,
                "1877 beach road", 2, 1500, 6000));

    }
}