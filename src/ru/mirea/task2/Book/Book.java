package ru.mirea.task2.Book;
public class Book {
    String name,author;
    int page,rate;

    public Book(String name, String author, int page, int rate) {
        this.name = name;
        this.author = author;
        this.page = page;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getRate() {
        return rate;
    }
    public String toString()
    {
        return "Книга: "+getName()+" автора "+getAuthor()+", с рейтингом "+getRate();
    }
}

