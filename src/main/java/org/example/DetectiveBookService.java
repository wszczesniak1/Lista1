package org.example;

public class DetectiveBookService extends Book {
    public Book createDetectiveBook(String title, int price) {
        Book detectiveBook = new Book();
        String category = "Detective";
        detectiveBook.setCategory(category);
        detectiveBook.setPrice(price);
        detectiveBook.setTitle(title);
        return detectiveBook;
        }
}
