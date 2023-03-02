package modelbaseddevelopment.facade;

public class TravelFacade {
    private Flight flightAPI;
    private Hotel hotelAPI;

    public TravelFacade() {
        flightAPI = new Flight();
        hotelAPI = new Hotel();
    }

    public void search(String departureDate, String returnDate, String origin, String destination) {
        flightAPI.searchFlights(departureDate, returnDate, origin, destination);
        hotelAPI.searchHotels(departureDate, returnDate, origin, destination);
    }
}

