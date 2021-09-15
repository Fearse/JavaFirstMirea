package ru.mirea.task2;

public class Dog {
    String name,color;
    int age;

    public Dog(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }
    public String getColor()
    {
        return  color;
    }
    public String toString()
    {
        return "Кличка: "+getName()+", возраст: "+getAge()+", цвета: "+getColor();
    }

}
