package modelbaseddevelopment.facade;

public class Main {
    public static void main(String[] args) {
        TravelSearchAPI travelSearch = new TravelSearch();
        travelSearch.search("2019-01-01", "2019-01-02", "Madrid", "Barcelona");
        travelSearch.search("2019-01-01", "2019-01-02", "Madrid", "Paris");
    }
}