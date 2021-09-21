package ru.mirea.task6.var2;

public class Task {
    public static void main(String []args)
    {
        Priceable priceable=new Chocolate(50,"Milka");
        System.out.println(priceable.getPrice());
        priceable=new Phone(15000,"Ксяоми");
        System.out.println(priceable.getPrice());
        priceable=new Tea(150,"Lipton");
        System.out.println(priceable.getPrice());
    }
}
