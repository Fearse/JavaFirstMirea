package ru.mirea.task3.opt3;

public class TestBook {
    public static void main(String []args) {
        Book book = new Book("Война и мир", "Л.Н. Толстой", 1000000, 1869);
        System.out.print(book.toString());
    }
}
