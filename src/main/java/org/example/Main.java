package org.example;

public class Main {

    public static void main(String[] args) {
        System.out.println("App started");
        FantasyBookService fantasyBookService = new FantasyBookService();
        Book chrobot = fantasyBookService.createFantasyBook("Hobbit", 40);
        System.out.println(chrobot.toString());
        DetectiveBookService detectiveBookService = new DetectiveBookService();
        Book sherlock = detectiveBookService.createDetectiveBook("Sherlock", 54);
        System.out.println(sherlock.toString());
    }
}