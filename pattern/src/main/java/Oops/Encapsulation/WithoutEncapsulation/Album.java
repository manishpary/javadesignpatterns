package Oops.Encapsulation.WithoutEncapsulation;

public class Album {
    public String name;
    public String artist;
    public double price;
    public int numberOfCopies;

    public void sellCopies() {
        if (numberOfCopies > 0) {
            numberOfCopies--;
            System.out.println("one album has sold!");
        } else {
            System.out.println("No More Album available");
        }
    }

    public void orderCopies(int num) {
        numberOfCopies += num;
    }
}
