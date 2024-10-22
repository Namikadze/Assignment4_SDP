import observer.*;
public class Main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        station.addDisplay(new CurrentConditionsDisplay());
        station.addDisplay(new StatisticsDisplay());
        station.addDisplay(new ForecastDisplay());
        station.setMeasurements(25, 65, 1013);
        station.setMeasurements(30, 70, 1010);
    }
}
