package ru.mirea.task30;

public class Task {
    public static void main(String[] args) {
        new User("Денис", "Маслов", 20,"Воркута");
        new User("Вадим", "Иванов", 10,"Москва");
        new User("Андрей", "Зубцов", 50,"Москва");
        new User("Иван", "Петров", 30,"Москва");
        new User("Илья", "Городсков", 40,"Саранск");
        System.out.println("Все пользователи:");
        User.getAllUsers().forEach(System.out::println);
        System.out.println("Кол-во пользователей: " + User.getHowManyUsers());
        System.out.println("Общий возраст пользователей: " + User.getAllAgeUsers());
        System.out.println("Средний возраст пользователей: " + User.getAverageAgeOfAllUsers());
    }
}
