class Zoo {
    int zooId;
    String zooName;
    String location;
    String animals[];
    String openingTime;
    String closingTime;

    public Zoo(int zooId, String zooName, String location, String openingTime, String closingTime, String[] animals) {
        this.zooId = zooId;
        this.zooName = zooName;
        this.location = location;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.animals = animals;
    }

    public void displayDetails() {
        System.out.println("Zoo ID: " + zooId);
        System.out.println("Zoo Name: " + zooName);
        System.out.println("Location: " + location);
        System.out.println("Animals:");

        for (int index = 0; index < animals.length; index++) {
            System.out.println(animals[index]);
        }

        System.out.println("Opening Time: " + openingTime);
        System.out.println("Closing Time: " + closingTime);
        System.out.println("--------------------------------");
    }

}
