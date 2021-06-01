package Oops.Encapsulation.WithEncapsulation;

/*
Advantages of encapsulation in Java
        We can make a class read-only or write-only: for a read-only class, we should provide only a getter method. For a write-only class, we should provide only a setter method.
        Control over the data: we can control the data by providing logic to setter methods, just like we restricted the stock keeper from assigning negative values in the above example.
        Data hiding: other classes can’t access private members of a class directly.
*/
public class Main {
    public static void main(String[] args) {
        StockKeeper sonuNigam = new StockKeeper("Sonu Nigam");
       /*
       Stock keeper creates album and assigns negative values for price and number of copies available
        */
        sonuNigam.manageAlbum(new Album(), "Suraj Huva Madham", "Sharukh khan", -1000.00, -50);
    }
}
