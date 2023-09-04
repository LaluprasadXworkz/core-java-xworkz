class  MuseumExecutor{ 
	public static void main(String[] args) {
		
        String[] exhibits1 = {"Artifacts", "Sculptures", "Paintings"};
		Museum museum1 = new Museum(1, "Government Museum, Bangalore", "Bangalore", "10:00 AM", "5:00 PM", exhibits1);
		museum1.displayDetails();
		
        String[] exhibits2 = {"Wildlife Exhibits", "Aviary", "Reptiles"};
		Museum museum2 = new Museum(2, "Sri Chamarajendra Zoological Gardens", "Mysore", "8:30 AM", "5:30 PM", exhibits2);
		museum2.displayDetails();
		
        String[] exhibits3 = {"Aircraft Models", "Engines", "History Displays"};
		Museum museum3 = new Museum(3, "HAL Heritage Centre and Aerospace Museum", "Bangalore", "9:00 AM", "5:00 PM", exhibits3);
		museum3.displayDetails();
		
        String[] exhibits4 = {"Folk Art", "Puppets", "Traditional Costumes"};
		Museum museum4 = new Museum(4, "Folklore Museum, Mysore", "Mysore", "10:30 AM", "5:30 PM", exhibits4);
		museum4.displayDetails();
		
        String[] exhibits5 = {"Vintage Trains", "Memorabilia", "Signal Equipment"};
		Museum museum5 = new Museum(5, "Railway Museum, Mysore", "Mysore", "9:30 AM", "5:30 PM", exhibits5);
		museum5.displayDetails();
		
        String[] exhibits6 = {"Rural Artifacts", "Cultural Displays", "Traditional Crafts"};
		Museum museum6 = new Museum(6, "Janapada Loka, Ramanagara", "Ramanagara", "10:00 AM", "5:30 PM", exhibits6);
		museum6.displayDetails(); 
    }
 }