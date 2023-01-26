package Weather;

public interface Observer {
    void update(float temperature, float humidity, float pressure);

    public void update();
}
