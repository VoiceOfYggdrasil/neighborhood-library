package com.pluralsight;

public class Book {
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    public Book(int id, String isbn, String title, boolean isCheckedOut, String checkedOutTo) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutTo = checkedOutTo;
    }

    public boolean isAvailable() {
        return !isCheckedOut;
    }

    //Not sure what the String.format actually does, but some Googling helped me come up with this.
    public String toString() {
        return String.format("%s\t[ISBN: %s | ID: %d%s]",
                title, isbn, id, isCheckedOut ? " | Checked Out By: " + checkedOutTo : "");
    }

    public void checkIn() {
        if (isCheckedOut) {
            this.isCheckedOut = false;
            this.checkedOutTo = null;
            System.out.println(title + " has been successfully checked in. Thank you!");
        } else {
            System.out.println(title + " is not currently checked out. Have at ye.");
        }
    }

    public void checkOut(String name) {
        if (!isCheckedOut) {
            this.isCheckedOut = true;
            this.checkedOutTo = name;
            System.out.println(title + " has been checked out by: " + name);
        } else {
            System.out.println(title + " is already checked out, sorry.");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }
}
