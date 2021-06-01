package Oops.Encapsulation.WithoutEncapsulation;

public class Main {
    public static void main(String[] args) {
        StockKeeper sonuNigam = new StockKeeper("Sonu Nigam");
       /*
       Stock keeper creates album and assigns negative values for price and number of copies available
        */
        sonuNigam.manageAlbum(new Album(), "Suraj Huva Madham", "Sharukh khan", -1000.00, -50);
    }
}
