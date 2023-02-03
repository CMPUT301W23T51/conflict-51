package com.example.conflict_51;

public abstract class Shape {
    protected int x;
    protected int y;
    public Shape() {

    }

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Triangle extends Shape {
    public Triangle(){
        super();
    }
}
