class AirportExecutor{
												
	public static void main(String[] args){
		
	Airport airport1 = new Airport(123, "Kempegowda International Airport",2008,"Bengaluru", 2, 1);
	airport1.displayDetails();
	
    Airport airport2 = new Airport(456, "Chhatrapati Shivaji Maharaj International Airport",1942, "Mumbai", 2, 2);
	airport2.displayDetails();
	
    Airport airport3 = new Airport(789, "Chennai International Airport",1953, "Chennai", 2, 2);
	airport3.displayDetails();
	
    Airport airport4 = new Airport(231, "Indira Gandhi International Airport",1962, "New Delhi", 3, 3);
	airport4.displayDetails();
	
    Airport airport5 = new Airport(891, "Rajiv Gandhi International Airport",2008, "Hyderabad", 1, 1);
	airport5.displayDetails();
	
    Airport airport6 = new Airport(785, "Netaji Subhas Chandra Bose International Airport",1924, "Kolkata", 2, 2);
	airport6.displayDetails();
	
	}
}