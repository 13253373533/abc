package com.domain;

public class Book {

    private int num;
    private String name;
    private double price;
    private String author;

    public Book() {
    }

    public Book(int num, String name, double price, String author) {
        this.num = num;
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
