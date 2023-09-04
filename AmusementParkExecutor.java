class AmusementParkExecutor{
	
	public static void main(String[] args) {
	
	
		String attractions1[]={"Roller Coasters", "Water Rides", "Thrill Rides"};
        AmusementPark park1 = new AmusementPark(1, "Wonderla Bangalore", "Bangalore",attractions1, "11:00 AM", "7:00 PM");
		park1.displayDetails();
		
		
		String attractions2[]={"Movie Sets", "Water Park", "Wax Museum"};
        AmusementPark park2 = new AmusementPark(2, "Innovative Film City", "Bangalore",attractions2, "10:00 AM", "6:00 PM");
		park2.displayDetails();
		
		
		String attractions3[]={"Water Slides", "Dry Rides", "Wave Pool"};
        AmusementPark park3 = new AmusementPark(3, "GRS Fantasy Park", "Mysore",attractions3, "10:30 AM", "6:30 PM");
        park3.displayDetails();
		
		String attractions4[]={"Thrill Rides", "Family Rides", "Kiddie Rides"};
		AmusementPark park4 = new AmusementPark(4, "Neeladri Amusement Park", "Bangalore",attractions4, "11:30 AM", "7:30 PM");
        park4.displayDetails();
		
		String attractions5[]={"Water Rides", "Amusement Rides", "Entertainment"};
		AmusementPark park5 = new AmusementPark(5, "Fun World", "Bangalore",attractions5, "10:00 AM", "6:00 PM");
        park5.displayDetails();
		
		String attractions6[]={"Thrill Rides", "Family Rides", "Water Slides"};
		AmusementPark park6 = new AmusementPark(6, "MGM Dizzee World", "Mysore",attractions6, "10:30 AM", "6:30 PM");
        park6.displayDetails();
    }
}