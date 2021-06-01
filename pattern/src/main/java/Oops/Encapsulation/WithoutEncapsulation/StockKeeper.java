package Oops.Encapsulation.WithoutEncapsulation;

public class StockKeeper {
    public String name;

    public StockKeeper(String name) {
        this.name = name;
    }

    public void manageAlbum(Album album, String name, String artist, double price, int numberOfCopies) {
        /*
       Defining states and behaviors for album
       */
        album.name = name;
        album.artist = artist;
        album.price = price;
        album.numberOfCopies = numberOfCopies;

         /*
       Printing album details
        */
        System.out.println("Album Managed By:" + this.name);
        System.out.println("Album Details:::::::::");
        System.out.println("Album name:" + album.name);
        System.out.println("Album artist:" + album.artist);
        System.out.println("Album price :" + album.price);
        System.out.println("Album number of copies : " + album.numberOfCopies);

    }
}
