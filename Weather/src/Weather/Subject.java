package Weather;

public interface Subject {
    public void registerObserver(CurrentConditions currentConditions);
    public void removeObserver();
    public void notifyObserver();
}
