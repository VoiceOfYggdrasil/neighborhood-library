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

    public int getId() {
        return id;
    }

    public String getISBN() {
        return isbn;
    }

    //Not sure what the String.format actually does, but some Googling helped me come up with this.
    public String toString() {
        return String.format("%s\t[ISBN: %s | ID: %d%s]",
                title, isbn, id, isCheckedOut ? " | Checked Out By: " + checkedOutTo : "");
    }

    public void checkIn() {
        this.isCheckedOut = false;
        this.checkedOutTo = "";
    }

    public void checkOut(String name) {
        this.isCheckedOut = true;
        this.checkedOutTo = name;
    }
}
