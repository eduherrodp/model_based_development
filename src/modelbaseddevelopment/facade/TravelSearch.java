package modelbaseddevelopment.facade;
public class TravelSearch implements TravelSearchAPI {
    private TravelFacade travelFacade;

    public TravelSearch() {
        travelFacade = new TravelFacade();
    }

    @Override
    public void search(String departureDate, String returnDate, String origin, String destination) {
        System.out.println("Searching for travel options for " + destination + " from " + origin + " on " + departureDate + " to " + returnDate);
        travelFacade.search(departureDate, returnDate, origin, destination);
    }
}

