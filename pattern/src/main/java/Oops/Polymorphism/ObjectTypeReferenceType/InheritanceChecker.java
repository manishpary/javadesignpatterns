package Oops.Polymorphism.ObjectTypeReferenceType;

class Person {
    void eat() {
        System.out.println("Person is eating");
    }
}

class Student extends Person {
    void study() {
        System.out.println("Student is studying");
    }
}

public class InheritanceChecker {
    public static void main(String[] args) {
        Person alex = new Person();//New Person "is a" Person
        alex.eat();
        Student jane = new Student();//New Student "is a" Student
        jane.eat();
        jane.study();
        Person mary = new Student();//New Student "is a" Person
        /*mary can’t access study() in compile time because the compiler only knows the reference type.
         Since there is no study() in the reference type class,
         it can’t access it.But in runtime mary is going to be the Student type (Runtime type/ object type).
        */
        mary.eat();
        ((Student)mary).study();
        //Student chris = new Person(); //New Person isn't a Student.
    }
}