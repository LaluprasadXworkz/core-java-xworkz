public class Gym {
    int gymId;
    String gymName;
    String trainerName; 
    String location;
    String equipments[];
    String openingTime;
    String closingTime;

    public Gym(int gymId, String gymName, String trainerName, String location, String equipments[], String openingTime, String closingTime) {
        this.gymId = gymId;
        this.gymName = gymName;
        this.trainerName = trainerName; 
        this.location = location;
        this.equipments = equipments;
        this.openingTime = openingTime;
        this.closingTime = closingTime;
    }

    public void displayDetails() {
        System.out.println("Gym ID: " + gymId);
        System.out.println("Gym Name: " + gymName);
        System.out.println("Trainer Name: " + trainerName); 
        System.out.println("Location: " + location);
        System.out.println("Equipments:");

        for (int index = 0; index < equipments.length; index++) {
            System.out.println(equipments[index]);
        }

        System.out.println("Opening Time: " + openingTime);
        System.out.println("Closing Time: " + closingTime);
        System.out.println("--------------------------------");
    }
}
