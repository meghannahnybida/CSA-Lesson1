package weather;

public class StringTester {

    public static void main(String [] args){
        String weatherCondition = "rain";

        System.out.println(weatherCondition.length());

        System.out.println(WeatherConditionals.getWeatherAdvice(32, "heavy snow"));
        System.out.println(WeatherConditionals.getWeatherAdvice(34, "sunny"));
        System.out.println(WeatherConditionals.getWeatherAdvice(32, "windy"));
        System.out.println(WeatherConditionals.getWeatherAdvice(33, "snow"));
        System.out.println(WeatherConditionals.getWeatherAdvice(30, "snow"));
        System.out.println(WeatherConditionals.getWeatherAdvice(30, "windy"));

        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println(WeatherConditionals.getHikingAdvice(75, 75, 45, "fair"));
        System.out.println(WeatherConditionals.getHikingAdvice(25, 10, 2, "chilly"));
        System.out.println(WeatherConditionals.getHikingAdvice(75, 80, 80, "windy"));
        System.out.println(WeatherConditionals.getHikingAdvice(50, 49, 55, "tornado"));
        System.out.println(WeatherConditionals.getHikingAdvice(31, 35, 10, "cold"));
    }
}
