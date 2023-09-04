class AmusementPark {
    int parkId;
    String parkName;
    String location;
    String attractions[];
    String openingTime;
    String closingTime;

    public AmusementPark(int parkId, String parkName, String location, String attractions[], String openingTime, String closingTime) {
        this.parkId = parkId;
        this.parkName = parkName;
        this.location = location;
        this.attractions = attractions;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
    }

    public void displayDetails() {
        System.out.println("Park ID: " + parkId);
        System.out.println("Park Name: " + parkName);
        System.out.println("Location: " + location);
        System.out.println("Attractions:");

        for (int index = 0; index < attractions.length; index++) {
            System.out.println(attractions[index]);
        }

        System.out.println("Opening Time: " + openingTime);
        System.out.println("Closing Time: " + closingTime);
        System.out.println("--------------------------------");
    }


}
