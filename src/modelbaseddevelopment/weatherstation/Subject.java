package modelbaseddevelopment.weatherstation;

public interface Subject {
    // The Subject class is the base class for all the classes that want to be observed.
    void registerObserver();
    void removeObserver();
    void notifyObservers();
}
