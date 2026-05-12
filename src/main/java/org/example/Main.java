package org.example;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ArrayList<Asset> myAssets = new ArrayList<>();

        myAssets.add(new House("My house","2026-03-20",15000, "234 Main street",
                1, 2000, 5000));

        myAssets.add(new House("Vacation home", "2025-10-22", 250000,
                "1877 beach road", 2, 1500, 6000));

        myAssets.add(new Vehicle("My car", "2021-06-17",
                6000, "Honda CR-V", 2008, 40000));

        myAssets.add(new Vehicle("Tom's truck", "2024-08-04",
                15000, "Chevrolet Malibu", 2023, 60000));

        for (Asset asset : myAssets){
            String message = " ";

            if (asset instanceof House){
                House house = (House) asset;
                message = "The address is: " + house.getAddress();
            }
            else if (asset instanceof Vehicle){
                Vehicle vehicle = (Vehicle) asset;
                message = "Vehicle: " + vehicle.getYear() + " " + vehicle.getMakeModel();
            }

            System.out.println(asset.getDescription());
            System.out.println("Date Acquired: " + asset.getDateAcquired());
            System.out.println("Original cost: $" + asset.getOriginalCost());
            System.out.println("Current Value: $" + asset.getValue());
            System.out.println(message);
            System.out.println();
        }
    }
}