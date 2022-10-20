package org.example;

public class Book {
    private String title;
    private int price;
    private String category;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String toString() {
        return "BOOK: " + title + " , price:" + price + " , " + category;
    }
}
