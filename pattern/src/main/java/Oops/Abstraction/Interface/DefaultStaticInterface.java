package Oops.Abstraction.Interface;

/*They help us use multiple inheritance in Java.
  They provide abstraction.
  They provide loose coupling: objects are independent from one another.*/
public interface DefaultStaticInterface {
    void sleep();

    static void run() {
        System.out.println("I'm running!");
    }
}

class A implements DefaultStaticInterface {
    public void sleep() {
        System.out.println("Sleeping...");
    }

    static void run() {
        System.out.println("I'm sleeping!");
    }

    public static void main(String[] args) {
        InterfaceCheckers checker = new InterfaceCheckers();
        DefaultStaticInterface.run();
        A.run();
        checker.sleep();
    }
}

