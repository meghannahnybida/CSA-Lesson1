package weather;

public class WeatherConditionals {

    public static String getWeatherAdvice(int temperature, String description){

        boolean windy = false;
        boolean cold = false;

        if (temperature < 31)
        {
            cold = true;
        }
        if (description.equals("windy"))
        {
            windy = true;
        }

        if(description.equals("snow") && temperature > 100)
        {
            return "How is this possible!!!!";
        }
        else if (windy == true || cold == true)
        {
            return "Too windy or cold! Enjoy watching the weather through the window.";
        }
        else
        {
            return "It's safe to go outside, " + temperature + " degrees and " + description + ".";
        }
    }
    public static String getHikingAdvice(int temperature, int windchill, int humidity, String description){

        boolean cold = false;
        boolean windy = false;

        if(temperature < 32)
        {
            cold = true;
        }
        if(description.equals("tornado"))
        {
            windy = true;
            return "Don't hike there is a tornado!";
        }
        if(humidity > 50)
        {
            return "It's too humid to hike! Don't go outside you will pass out.";

        }
        else if(windchill < 32)
        {
            return "The windchill is below freezing, DO NOT hike.";
        }
        else if(cold == true || windy == true)
        {
            return "It's too cold or windy to hike.";
        }
        else
        {
            return "It's safe to go outside, " + temperature + " degrees and " + description + "." + " Enjoy your hike!";
        }
    }
}
