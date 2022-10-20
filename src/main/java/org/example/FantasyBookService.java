package org.example;

public class FantasyBookService extends Book{
    public Book createFantasyBook(String title, int price) {

        Book fantasyBook = new Book();
        String category = "Fantasy";
        fantasyBook.setCategory(category);
        fantasyBook.setPrice(price);
        fantasyBook.setTitle(title);
        return fantasyBook;
    }
}
