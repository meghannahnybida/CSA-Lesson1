public class Song {

    private String title;
    private int rating;
    private double price;
    private boolean favorite;
    private int numSongs;

    public Song(){
        title = "";
        rating = 0;
        price = 0.0;
    }
    public Song(String title, double price) {
        this.title = title;
        this.price = price;
        numSongs = numSongs + 1;
    }
    public Song(String title, double price, int rating) {
        this.title = title;
        this.price = price;
        this.rating = rating;
        numSongs = numSongs + 1;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String t){
        title = t;
    }
    public int getRating(){
        return rating;
    }
    public void setRating(int r){
        rating = r;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double p){
        price = p;
    }
    public void addToFavorites() {
        favorite = true;
    }
    public int getNumsongs(){
        return numSongs;
    }
    public void setNumSongs(int n){
        numSongs = n;
    }

}
