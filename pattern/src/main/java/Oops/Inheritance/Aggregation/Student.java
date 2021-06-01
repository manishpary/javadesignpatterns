package Oops.Inheritance.Aggregation;

/*
Student HAS-A ContactInfo.
 ContactInfo can be used in other places
 – for example, a company's Employee class can also use this ContactInfo class.
 So Student can exist without ContactInfo and ContactInfo can exist without Student .
  This type of relationship is known as aggregation.
*/
class ContactInfo {
    private String homeAddress;
    private String emailAddress;
    private int telephoneNumber; //12025550156
}

public class Student {
    private String name;
    private int age;
    private int grade;
    private ContactInfo contactInfo;//Student HAS-A ContactInfo

    public void study() {
        System.out.println("Study");
    }
}

