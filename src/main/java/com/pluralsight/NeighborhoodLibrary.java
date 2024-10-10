package com.pluralsight;

import java.util.Scanner;

public class NeighborhoodLibrary {

    public static void main(String[] args) {
        Book[] inventory = new Book[20];
        Scanner input = new Scanner(System.in);
        String name = "";

        inventory[0] = new Book(101023, "placeholder1", "Naruto Shippuden vol. 1", false, "");
        inventory[1] = new Book(104056, "placeholder2", "Gone Tomorrow", false, "");
        inventory[2] = new Book(106012, "placeholder3", "Deathstalkers", false, "");
        inventory[3] = new Book(106037, "placeholder4", "Between Two Fires", false, "");
        inventory[4] = new Book(104450, "placeholder5", "Throne Of Glass", false, "");
        inventory[5] = new Book(109761, "placeholder6", "Bleach vol. 1", false, "");
        inventory[6] = new Book(109006, "placeholder7", "Berserk", false, "");
        inventory[7] = new Book(104670, "placeholder8", "Gone", false, "");
        inventory[8] = new Book(101334, "placeholder9", "Rainbow Six", false, "");
        inventory[9] = new Book(101077, "placeholder10", "Tenjo Tenge", false, "");
        inventory[10] = new Book(106399, "placeholder11", "Bone", false, "");
        inventory[11] = new Book(107177, "placeholder12", "Hitchhiker's Guide To The Galaxy", false, "");
        inventory[12] = new Book(101144, "placeholder13", "Junji Ito Collection", false, "");
        inventory[13] = new Book(109277, "placeholder14", "Dead Space", false, "");
        inventory[14] = new Book(102876, "placeholder15", "Metro 2033", false, "");
        inventory[15] = new Book(100303, "placeholder16", "Calvin and Hobbes", false, "");
        inventory[16] = new Book(100045, "placeholder17", "Zen and the Art of Motorcycle Maintenance", false, "");
        inventory[17] = new Book(100119, "placeholder18", "Good Omens", false, "");
        inventory[18] = new Book(102580, "placeholder19", "I, Robot", false, "");
        inventory[19] = new Book(109961, "placeholder20", "Holes", false, "");
    }

    public static void nameInput() {
        System.out.println("Please enter your name: ");
        name = input.nextLine().trim();
        if (name.isEmpty()) {
            System.out.println("Error: Name cannot be blank.");
            nameInput();
        }
    }
}
