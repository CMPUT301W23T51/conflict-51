package com.example.conflict_51;

public abstract class Shape {
    protected int x;
    protected int y;

    protected String color = "red";
    public Shape() {

    }

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Rectangle extends Shape{
    private int width;
    private int height;

    public Rectangle() {
    }

    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }
}
