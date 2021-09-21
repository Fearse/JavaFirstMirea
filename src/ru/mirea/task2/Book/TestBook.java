package ru.mirea.task2.Book;

import ru.mirea.task2.Book.Book;

public class TestBook {
    public static void main(String [] args)
    {
        Book bk1=new Book("Война и мир","Толстой",5000,8);
        Book bk2=new Book("Преступление и наказание","Достоевский",3000,10);
        System.out.println(bk1);
        System.out.println(bk2);
    }
}
