package com.advance.ExercisesOnClasses.Ex2.Ex2_1;

public class Book {
    private String name;
    private Author author; // Thay đổi từ mảng Author sang một đối tượng Author duy nhất
    private double price;
    private int qty = 0;

    public Book(String name, Author author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public Book(String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
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
        // Tái sử dụng phương thức toString() của lớp Author
        return String.format("Book[name=%s,Author[%s],price=%.2f,qty=%d]", name, author.toString(), price, qty);
    }

}
