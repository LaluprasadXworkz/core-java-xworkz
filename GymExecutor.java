class GymExecutor{
	
    public static void main(String[] args) {
        String[] gym1Equipments = {"Treadmill", "Dumbbells", "Exercise Bike"};
        Gym gym1 = new Gym(1, "FitLife Gym", "James", "Jp nagar", gym1Equipments, "6:00 AM", "9:00 PM");
        gym1.displayDetails();

        String[] gym2Equipments = {"Barbells", "Rowing Machine", "Elliptical Trainer"};
        Gym gym2 = new Gym(2, "PowerPulse Fitness", "Shivanna", "Rajaji nagar", gym2Equipments, "5:30 AM", "10:00 PM");
        gym2.displayDetails();

        String[] gym3Equipments = {"Smith Machine", "Resistance Bands", "Stair Climber"};
        Gym gym3 = new Gym(3, "HealthyU Fitness Center", "Dav", "Basam circle", gym3Equipments, "5:00 AM", "8:30 PM");
        gym3.displayDetails();

        String[] gym4Equipments = {"Cable Machine", "Kettlebells", "Spin Bike"};
        Gym gym4 = new Gym(4, "BodyZone Gym", "Erappa", "Yelenka", gym4Equipments, "6:30 AM", "9:30 PM");
        gym4.displayDetails();

        String[] gym5Equipments = {"Leg Press Machine", "Jump Ropes", "Stepper"};
        Gym gym5 = new Gym(5, "FlexFit Gym", "Manjanna", "Mejestic", gym5Equipments, "5:45 AM", "10:15 PM");
        gym5.displayDetails();

        String[] gym6Equipments = {"Bench Press", "Resistance Bands", "Yoga Mats"};
        Gym gym6 = new Gym(6, "FitZone Fitness", "Ramappa", "BTM", gym6Equipments, "6:15 AM", "8:45 PM");
        gym6.displayDetails();
    }
}