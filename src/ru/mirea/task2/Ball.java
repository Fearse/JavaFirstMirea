package ru.mirea.task2;

public class Ball {
    String type,color,size;

    public Ball(String type, String color, String size) {
        this.type = type;
        this.color = color;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }

    public String getSize() {
        return size;
    }
    public String toString()
    {
        return "Тип мяча: "+getType()+", размер: "+getSize()+", цвета: "+getColor();
    }
}
