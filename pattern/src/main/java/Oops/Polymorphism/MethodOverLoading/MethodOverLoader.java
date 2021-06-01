package Oops.Polymorphism.MethodOverLoading;


public class MethodOverLoader {
    public static void main(String[] args) {
        JavaProgrammer gosling = new JavaProgrammer();
        gosling.code();
        gosling.code("Java");
    }
}

class JavaProgrammer {
    public void code() {
        System.out.println("Coding in C++");
    }

    public void code(String language) {
        System.out.println("Coding in " + language);
    }
}


