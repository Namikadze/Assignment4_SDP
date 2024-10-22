package observer;
import java.util.ArrayList;
import java.util.List;
public class WeatherStation {
    private List<WeatherDisplay> displays = new ArrayList<>();
    private float temperature, humidity, pressure;
    public void addDisplay(WeatherDisplay display) {
        displays.add(display);
    }
    public void notifyDisplays() {
        for (WeatherDisplay display : displays) {
            display.update(temperature, humidity, pressure);
        }
    }
    public void setMeasurements(float temp, float hum, float pres) {
        temperature = temp;
        humidity = hum;
        pressure = pres;
        notifyDisplays();
    }
}
