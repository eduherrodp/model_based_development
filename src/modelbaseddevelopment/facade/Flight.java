package modelbaseddevelopment.facade;

public class Flight {
    public void searchFlights(String departureDate, String returnDate, String origin, String destination) {
        System.out.println("Flight found to " + destination + " from " + origin + " on " + departureDate + " to " + returnDate);
    }
}