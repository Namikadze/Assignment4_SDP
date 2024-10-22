package observer;
public class ForecastDisplay implements WeatherDisplay {
    @Override
    public void update(float temperature, float humidity, float pressure) {
        System.out.println("Forecast: " + pressure + " Pa pressure.");
    }
}
