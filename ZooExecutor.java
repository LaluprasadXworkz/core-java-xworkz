class ZooExecutor{
 public static void main(String[] args) {
 
 
 
        String[] animals1 = {"Lions", "Tigers", "Elephants"};
        Zoo zoo1 = new Zoo(1, "Bannerghatta Biological Park", "Bangalore", "9:00 AM", "5:00 PM", animals1);
		zoo1.displayDetails();
		
		String[] animals2 = {"Giraffes", "Zebras", "Lemurs"};
        Zoo zoo2 = new Zoo(2, "Mysore Zoo", "Mysore", "8:30 AM", "5:30 PM", animals2);
		zoo2.displayDetails();
		
		String[] animals3 = {"Elephants", "Bison", "Peafowls"};
        Zoo zoo3 = new Zoo(3, "Sakrebailu Elephant Camp", "Shimoga", "10:00 AM", "4:30 PM", animals3);
		zoo3.displayDetails();
		
		String[] animals4 = {"Leopards", "Black Panthers", "Sambars"};
        Zoo zoo4 = new Zoo(4, "Dandeli Wildlife Sanctuary", "Dandeli", "7:00 AM", "5:00 PM", animals4);
        zoo4.displayDetails();
		
		String[] animals5 = {"Sloth Bears", "Leopards", "Peafowls"};
		Zoo zoo5 = new Zoo(5, "Daroji Sloth Bear Sanctuary", "Hampi", "6:00 AM", "6:00 PM", animals5);
		zoo5.displayDetails();
		
		
		String[] animals6 = {"Birds", "Migratory Birds", "Waterfowl"};
        Zoo zoo6 = new Zoo(6, "Gorur Dam Bird Sanctuary", "Hassan", "6:30 AM", "5:30 PM", animals6);
        zoo6.displayDetails();
    }
	
}