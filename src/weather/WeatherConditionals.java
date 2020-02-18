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
}
