package Oops.Abstraction.Interface;

public interface Drawable {
    void draw();
}

class Circle implements Drawable {
    public void draw() {
        System.out.println("Circle!");
    }
}

class InterfaceChecker {
    public static void main(String[] args) {
        Drawable circle = new Circle();
        circle.draw();
    }
}

