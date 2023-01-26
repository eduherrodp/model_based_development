package Weather;

public class WeatherData implements Subject {
    // Attributes of the class
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;


    @Override
    public void registerObserver(CurrentConditions currentConditions) {

    }

    @Override
    public void removeObserver() {

    }

    @Override
    public void notifyObserver() {

    }
    public void getTemperature() {

    }
    public void getPressure() {

    }
    public void measurementsChanged() {

    }
}
