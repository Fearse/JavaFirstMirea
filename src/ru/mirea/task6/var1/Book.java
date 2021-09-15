package ru.mirea.task6.var1;

public class Book implements Nameable{
    String name,author;

    public Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    @Override
    public String getName() {
        return "Имя книги: "+name;
    }
}
