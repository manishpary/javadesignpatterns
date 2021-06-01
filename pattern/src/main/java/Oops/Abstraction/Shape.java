package Oops.Abstraction;

/*
Abstraction is a process of hiding the implementation details and showing only functionality to the user.
*/


public abstract class Shape {
    public abstract void draw();
}

class Circle extends Shape {
    public void draw() {
        System.out.println("Circle!");
    }
}

class Main {
    public static void main(String[] args) {
        Shape circle = new Circle();
        circle.draw();
    }
}
