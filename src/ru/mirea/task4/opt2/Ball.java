package ru.mirea.task4.opt2;

public class Ball {
    double x=0,y=0;

    public Ball() {
    }

    public Ball(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void setXY(double x,double y)
    {
        this.x=x;
        this.y=y;
    }
    public String toString()
    {
        return "Ball  ("+getX()+","+getY()+") ";
    }
    public void move(double xDisp,double yDisp)
    {
       x+=xDisp;
       y+=yDisp;
    }

}
