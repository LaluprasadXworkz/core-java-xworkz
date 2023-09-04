class Udynavana {
    int parkId;
    String parkName;
    String location;
    String flowerCollection[];
    String openingTime;
    String closingTime;

    public Udynavana(int parkId, String parkName, String location, String flowerCollection[], String openingTime, String closingTime) {
        this.parkId = parkId;
        this.parkName = parkName;
        this.location = location;
        this.flowerCollection = flowerCollection; 
        this.openingTime = openingTime;
        this.closingTime = closingTime;
    }

   public void displayDetails() {
    System.out.println("Park ID: " + parkId);
    System.out.println("Park Name: " + parkName);
    System.out.println("Location: " + location);
    System.out.println("Flower Collection:");
    
    for (int index = 0; index < flowerCollection.length; index++) {
        System.out.println(flowerCollection[index]);
    }
    
    System.out.println("Opening Time: " + openingTime);
    System.out.println("Closing Time: " + closingTime);
	System.out.println("--------------------------------");
}

}
