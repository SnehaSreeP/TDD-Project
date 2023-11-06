package org.example;

public class Rectangle {

    private final int length;
    private final int breadth;


    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int area(){
        if(length < 0 || breadth < 0) {
            throw new IllegalArgumentException();
        }
        return this.length* this.breadth;
    }

    public int perimeter() {
        if(length < 0 || breadth < 0) {
            throw new IllegalArgumentException();
        }
        if(length == breadth)
            return 4*length;
        return 2*(length+breadth);
    }
}
