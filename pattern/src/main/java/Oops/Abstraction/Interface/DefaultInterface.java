package Oops.Abstraction.Interface;

public interface DefaultInterface {
    void sleep();

    default void run() {
        System.out.println("I'm running!");
    }
}

class InterfaceCheckers implements DefaultInterface {
    public void sleep() {
        System.out.println("Sleeping...");
    }


    public static void main(String[] args) {
        InterfaceCheckers checker = new InterfaceCheckers();
        checker.run();
        checker.sleep();
    }
}
/*
Output:
I'm running!
Sleeping...
 */
