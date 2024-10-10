package com.pluralsight;

import java.util.List;
import java.util.Scanner;

public class NeighborhoodLibrary {

    static Book[] inventory = new Book[20];
    static Scanner input = new Scanner(System.in);
    static String name = "";

    public static void main(String[] args) {
        nameInput();
        createInventory();

        //Not sure why I started here, but I'll come back to it
        while (true) {
            switch (homeScreen()) {
                case "1" -> showBooks(true);
                case "2" -> showBooks(false);
                case "3" -> {
                    input.close();
                    return;
                }
                default -> {

                }
            }
        }
    }

    public static void nameInput() {
        System.out.println("Please enter your name: ");
        name = input.nextLine().trim();
        if (name.isEmpty()) {
            System.out.println("Error: Name cannot be blank.");
            nameInput();
        }
    }
        //WOAH that's a lot of text
    public static void createInventory() {
        inventory[0] = new Book(101023, "placeholder1", "Naruto Shippuden vol. 1", false, "");
        inventory[1] = new Book(104056, "placeholder2", "Naruto Shippuden vol. 1", false, "");
        inventory[2] = new Book(106012, "placeholder3", "Naruto Shippuden vol. 1", false, "");
        inventory[3] = new Book(106037, "placeholder4", "Naruto Shippuden vol. 1", false, "");
        inventory[4] = new Book(104450, "placeholder5", "Naruto Shippuden vol. 1", false, "");
        inventory[5] = new Book(109761, "placeholder6", "Naruto Shippuden vol. 1", false, "");
        inventory[6] = new Book(109006, "placeholder7", "Naruto Shippuden vol. 1", false, "");
        inventory[7] = new Book(104670, "placeholder8", "Naruto Shippuden vol. 1", false, "");
        inventory[8] = new Book(101334, "placeholder9", "Naruto Shippuden vol. 1", false, "");
        inventory[9] = new Book(101077, "placeholder10", "Naruto Shippuden vol. 1", false, "");
        inventory[10] = new Book(106399, "placeholder11", "Naruto Shippuden vol. 1", false, "");
        inventory[11] = new Book(107177, "placeholder12", "Naruto Shippuden vol. 1", false, "");
        inventory[12] = new Book(101144, "placeholder13", "Naruto Shippuden vol. 1", false, "");
        inventory[13] = new Book(109277, "placeholder14", "Naruto Shippuden vol. 1", false, "");
        inventory[14] = new Book(102876, "placeholder15", "Naruto Shippuden vol. 1", false, "");
        inventory[15] = new Book(100303, "placeholder16", "Naruto Shippuden vol. 1", false, "");
        inventory[16] = new Book(100045, "placeholder17", "Naruto Shippuden vol. 1", false, "");
        inventory[17] = new Book(100119, "placeholder18", "Naruto Shippuden vol. 1", false, "");
        inventory[18] = new Book(102580, "placeholder19", "Naruto Shippuden vol. 1", false, "");
        inventory[19] = new Book(109961, "placeholder20", "Naruto Shippuden vol. 1", false, "");
    }
}
