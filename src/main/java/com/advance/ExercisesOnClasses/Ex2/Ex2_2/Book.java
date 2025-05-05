package com.advance.ExercisesOnClasses.Ex2.Ex2_2;

import com.advance.ExercisesOnClasses.Ex2.Ex2_1.Author;

public class Book {
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    public Book(String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        StringBuilder authorDetails = new StringBuilder("{");
        for (int i = 0; i < authors.length; i++) {
            authorDetails.append(authors[i].toString());
            if (i < authors.length - 1) {
                authorDetails.append(",");
            }
        }
        authorDetails.append("}");
        return String.format("Book[name=%s, authors=%s, price=%.2f, qty=%d]", name, authorDetails.toString(), price, qty);
    }

    public String AuthorNames() {
        StringBuilder authorNames = new StringBuilder();
        for (int i = 0; i < authors.length; i++) {
            authorNames.append(authors[i].getName());
            if (i < authors.length - 1){
                authorNames.append(", ");
            }
        }
        return authorNames.toString();
    }
}
