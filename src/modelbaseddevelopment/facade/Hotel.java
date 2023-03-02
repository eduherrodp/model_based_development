package modelbaseddevelopment.facade;

public class Hotel {
    public void searchHotels(String checkinDate, String checkoutDate, String origin, String destination) {
        System.out.println("Hotel found in " + destination + " from " + origin + " on " + checkinDate + " to " + checkoutDate);
    }
}