package weather;

public class WeatherConditionals {

    public static String getWeatherAdvice(int temperature, String description){
        boolean windy = false;

        if(description.indexOf("windy") >= 0){
            windy = true;
        }
        if((description.indexOf("snow") >= 0) && temperature >= 100){
            return "How is this possible!";
        }
    }
}
