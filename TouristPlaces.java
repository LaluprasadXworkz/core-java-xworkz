public class TouristPlaces {
    int touristPlacesId;
    String touristPlacesName;
    String famousFor;
    String openingTime;
    String closingTime;

    public TouristPlaces(int touristPlacesId, String touristPlacesName, String famousFor, String openingTime, String closingTime) {
        this.touristPlacesId = touristPlacesId;
        this.touristPlacesName = touristPlacesName;
        this.famousFor = famousFor;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
    }

    public void displayDetails() {
        System.out.println("Tourist Place ID: " + touristPlacesId);
        System.out.println("Tourist Place Name: " + touristPlacesName);
        System.out.println("Famous For: " + famousFor);
        System.out.println("Opening Time: " + openingTime);
        System.out.println("Closing Time: " + closingTime);
        System.out.println("--------------------------------");
    }
}
