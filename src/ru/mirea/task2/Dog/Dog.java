package ru.mirea.task2.Dog;

public class Dog {
    String name;
    int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public int getHumanAge(){return age*7;}
    public int getAge()
    {
        return age;
    }
    public String getName()
    {
        return name;
    }
    public String toString()
    {
        return "Кличка: "+getName()+", возраст: "+getAge()+"("+getHumanAge()+ " в переводе на человеческий)";
    }

}
