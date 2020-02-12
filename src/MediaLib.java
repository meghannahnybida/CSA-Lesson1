public class MediaLib {

    public static void main(String [] args){

        double totalCost;
        int totalRatings;
        double averageCost;

        System.out.println("Welcome to my Media Library\n");

        Song song1 = new Song("Test Drive", .99, 8);
        System.out.println(song1.getTitle() + " " + song1.getPrice() + " " + song1.getRating());
        Song song2 = new Song("Falling", 1.29, 10);
        System.out.println(song2.getTitle() + " " + song2.getPrice() + " " + song2.getRating());
        Song song3 = new Song("Adore You", .99, 9);
        System.out.println(song3.getTitle() + " " + song3.getPrice() + " " + song3.getRating());
        Song song4 = new Song("Sunflower", 1.29, 6);
        System.out.println(song4.getTitle() + " " + song4.getPrice() + " " + song4.getRating());
        Song song5 = new Song("Canyon Moon", .99, 8);
        System.out.println(song5.getTitle() + " " + song5.getPrice() + " " + song5.getRating());
        Song song6 = new Song("Run", 1.29, 10);
        System.out.println(song6.getTitle() + " " + song6.getPrice() + " " + song6.getRating());
        Song song7 = new Song("Iris", .99, 7);
        System.out.println(song7.getTitle() + " " + song7.getPrice() + " " + song7.getRating());

        Song numSongs = new Song();
        
        totalCost = song1.getPrice() + song2.getPrice() + song3.getPrice() + song4.getPrice() + song5.getPrice() + song6.getPrice()
                + song7.getPrice();
        totalRatings = song1.getRating() + song2.getRating() + song3.getRating() + song4.getRating() + song5.getRating()
                + song6.getRating() + song7.getRating();
        averageCost = totalCost / numSongs;
        Movies movie1 = new Movies();
        movie1.setTitle("The Social Network");
        System.out.println(movie1.getTitle());
        movie1.setRating(9);
        System.out.println(movie1.getRating());

        Books book1 = new Books();
        book1.setTitle("The Jungle");
        System.out.println(book1.getTitle());
        book1.setRating(7);
        System.out.println(book1.getRating());

    }
}
