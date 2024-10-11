package com.pluralsight;

import java.util.Scanner;

public class NeighborhoodLibrary {

    public static void main(String[] args) {
        Book[] inventory = new Book[20];
        Scanner input = new Scanner(System.in);

        inventory[0] = new Book(101023, "1569319006", "Naruto vol. 1", false, "");
        inventory[1] = new Book(104056, "0440243688", "Gone Tomorrow", false, "");
        inventory[2] = new Book(106012, "1625672071", "Deathstalker", false, "");
        inventory[3] = new Book(106037, "9798662731349", "Between Two Fires", false, "");
        inventory[4] = new Book(104450, "1639730958", "Throne Of Glass", false, "");
        inventory[5] = new Book(109761, "1591164419", "Bleach vol. 1", false, "");
        inventory[6] = new Book(109006, "1506711987", "Berserk", false, "");
        inventory[7] = new Book(104670, "9780061448782", "Gone", false, "");
        inventory[8] = new Book(101334, "0375403477", "Rainbow Six", false, "");
        inventory[9] = new Book(101077, "1421540088", "Tenjo Tenge", false, "");
        inventory[10] = new Book(106399, "1888963271", "Bone", false, "");
        inventory[11] = new Book(107177, "0345418913", "Hitchhiker's Guide To The Galaxy", false, "");
        inventory[12] = new Book(101144, "1974736032", "Junji Ito Collection", false, "");
        inventory[13] = new Book(109277, "1787745384", "Dead Space", false, "");
        inventory[14] = new Book(102876, "1481845705", "Metro 2033", false, "");
        inventory[15] = new Book(100303, "0836218051", "Calvin and Hobbes", false, "");
        inventory[16] = new Book(100045, "0060839872", "Zen and the Art of Motorcycle Maintenance", false, "");
        inventory[17] = new Book(100119, "9780060853983", "Good Omens", false, "");
        inventory[18] = new Book(102580, "9798327939950", "I, Robot", false, "");
        inventory[19] = new Book(109961, "0441013597", "Dune", false, "");

        while (true) {
            System.out.println("\nWelcome to your friendly neighborhood library! What would you like to do?");
            System.out.println(" 1 : Show me what books are available");
            System.out.println(" 2 : Show me what books are already checked out");
            System.out.println(" 3 : Exit");
            System.out.print("\nEnter your command, O Reader Mine: ");

            int choice = input.nextInt();
            input.nextLine();

            switch (choice) {
                case 1:
                    allBooksInventory(inventory, input);
                    break;
                case 2:
                    findRentedBooks(inventory, input);
                    break;
                case 3:
                    System.out.println("\nGoodbye!");
                    return;
                default:
                    System.out.println("\nERROR: Invalid Command.");
                    break;
            }

        }

    }

    public static void allBooksInventory(Book[] inventory, Scanner input) {
        System.out.println("\nHere's everything we have:\n");
        boolean isFound = false;
        for (Book book : inventory) {
            if (!book.isCheckedOut()) {
                System.out.println("ID: " + book.getId() + " - " + book.getTitle() + " - " + "ISBN: " + book.getIsbn());
                isFound = true;
            }
        }
        if (!isFound) {
            System.out.println("\nSorry, no books at this time. Try again later.");
            return;
        }
        System.out.print("\nTo check out a book, enter the ID number, OR type 0 to go back: ");

        int bookId = input.nextInt();
        input.nextLine();

        if (bookId == 0) {
            return;
        }

        for (Book book : inventory) {
            if (book.getId() == bookId && !book.isCheckedOut()) {
                System.out.print("\nMerely enter your name, and a world of literary wonder awaits: ");
                String nameOfRenter = input.nextLine();
                book.checkOut(nameOfRenter);
                return;
            }
        }
        System.out.println("\nThis book is already in the hands of another, O Covetous One.");
    }

    public static void findRentedBooks(Book[] inventory, Scanner input) {
        System.out.println("\nHere's all the books that have been checked out already:");
        boolean isFound = false;
        for (Book book : inventory) {
            if (book.isCheckedOut()) {
                System.out.println("\nID: " + book.getId() + " - " + book.getTitle()
                        + " ISBN: " + book.getIsbn() + " - Checked out by: " + book.getCheckedOutTo());
                isFound = true;
            }
        }
        if (!isFound) {
            System.out.println("\nLucky you! No books currently checked out.");
        }

        System.out.print("\nType 'C' to check a book in, or type 'X' to go to the main menu: ");
        String choice = input.nextLine().toUpperCase();

        if (choice.equalsIgnoreCase("X")) {
            return;
        } else if (choice.equalsIgnoreCase("C")) {
            System.out.print("\nEnter the Book ID to check it in, please: ");
            int bookId = input.nextInt();
            input.nextLine();

            for (Book book : inventory) {
                if (book.getId() == bookId && book.isCheckedOut()) {
                    book.checkIn();
                    return;
                }
            }
        } else {
            System.out.println("\nERROR: Invalid Choice.");
        }
    }
}
