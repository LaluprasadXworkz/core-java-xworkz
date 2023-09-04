class TouristPlacesExecutor{
	public static void main(String[] args) {
        TouristPlaces place1 = new TouristPlaces(1, "Mysore Palace", "Historical Palace", "10:00 AM", "5:30 PM");
		  place1.displayDetails();
		
		
        TouristPlaces place2 = new TouristPlaces(2, "Coorg", "Coffee Plantations", "8:00 AM", "6:00 PM");
		place2.displayDetails();
		
        TouristPlaces place3 = new TouristPlaces(3, "Hampi", "Historical Ruins", "9:00 AM", "6:00 PM");
		place3.displayDetails();
		
        TouristPlaces place4 = new TouristPlaces(4, "Gokarna", "Beaches", "7:00 AM", "7:00 PM");
		place4.displayDetails();
		
        TouristPlaces place5 = new TouristPlaces(5, "Chikmagalur", "Hill Stations", "6:30 AM", "6:30 PM");
		 place5.displayDetails();
		 
        TouristPlaces place6 = new TouristPlaces(6, "Badami", "Cave Temples", "9:30 AM", "5:30 PM");
		place6.displayDetails();
        
    }
}