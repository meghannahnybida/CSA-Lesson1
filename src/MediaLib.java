public class MediaLib {

    public static void main(String [] args){

        System.out.println("Welcome to my Media Library");

        Song song1 = new Song();
        song1.setTitle("Johnny B. Goode");
        System.out.println(song1.getTitle());
        song1.setRating(4);
        System.out.println(song1.getRating());

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
