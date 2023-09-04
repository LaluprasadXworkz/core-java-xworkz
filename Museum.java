public class Museum {
    int museumId;
    String museumName;
    String location;
    String exhibits[];
    String openingTime;
    String closingTime;

    public Museum(int museumId, String museumName, String location, String openingTime, String closingTime, String[] exhibits) {
        this.museumId = museumId;
        this.museumName = museumName;
        this.location = location;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
        this.exhibits = exhibits;
    }

    public void displayDetails() {
        System.out.println("Museum ID: " + museumId);
        System.out.println("Museum Name: " + museumName);
        System.out.println("Location: " + location);
        System.out.println("Exhibits:");

        for (int index = 0; index < exhibits.length; index++) {
            System.out.println(exhibits[index]);
        }

        System.out.println("Opening Time: " + openingTime);
        System.out.println("Closing Time: " + closingTime);
        System.out.println("--------------------------------");
    }

    
}
