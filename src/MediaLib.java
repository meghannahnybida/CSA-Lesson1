import java.text.DecimalFormat;

public class MediaLib {

    private static DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String [] args){

        //getNumSongs.getNumSongs();
        double totalCost = 0.0;
        double totalRatings = 0.0;
        double averageCost;
        int numSongs = 0;
        double averageRating;

        System.out.println("Welcome to my Media Library\n");

        Song song1 = new Song("Test Drive", .99, 8);
        numSongs++;
        totalCost = totalCost + song1.getPrice();
        totalRatings = totalRatings + song1.getRating();
        Song song2 = new Song("Falling", 1.29, 10);
        totalCost = totalCost + song2.getPrice();
        totalRatings = totalRatings + song2.getRating();
        numSongs++;
        Song song3 = new Song("Adore You", .99, 9);
        numSongs++;
        totalCost = totalCost + song3.getPrice();
        totalRatings = totalRatings + song3.getRating();
        Song song4 = new Song("Sunflower", 1.29, 6);
        numSongs++;
        totalCost = totalCost + song4.getPrice();
        totalRatings = totalRatings + song4.getRating();
        Song song5 = new Song("Canyon Moon", .99, 8);
        numSongs++;
        totalCost = totalCost + song5.getPrice();
        totalRatings = totalRatings + song5.getRating();
        Song song6 = new Song("Run", 1.29, 10);
        numSongs++;
        totalCost = totalCost + song6.getPrice();
        totalRatings = totalRatings + song6.getRating();
        Song song7 = new Song("Iris", .99, 7);
        numSongs++;
        totalCost = totalCost + song7.getPrice();
        totalRatings = totalRatings + song7.getRating();

        System.out.println("The total cost is " + df.format(totalCost));
        System.out.println("The total ratings are " + totalRatings);

        averageCost = (totalCost / numSongs);
        System.out.println("The average cost of a song is " + df.format(averageCost));

        averageRating = (totalRatings / numSongs);
        System.out.println("The average rating of a song is " + df.format(averageRating));

        Movies movie1 = new Movies();
        movie1.setTitle("The Social Network");
        System.out.println(movie1.getTitle());
        movie1.setRating(9);
        System.out.println(movie1.getRating());
        movie1.setDuration(134);
        movie1.movieDuration();

        Books book1 = new Books();
        book1.setTitle("The Jungle");
        System.out.println(book1.getTitle());
        book1.setRating(7);
        System.out.println(book1.getRating());

    }
}
