public class Movies {

    private String title;
    private int rating;
    private int duration;

    public Movies(){
        title = "";
        rating = 0;
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
    public int getDuration(){
        return duration;
    }
    public void setDuration(int d){
        duration = d;
    }
    public void movieDuration() {
        int hours;
        int minutes;

        hours = duration / 60;
        minutes = duration % 60;

        System.out.println("The movie lasts " +  hours + " and " + minutes + " minutes.");

    }
}
