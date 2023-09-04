class PlayStationExecutor{

	public static void main(String[] args){
		PlayStation playStation1= new PlayStation(1001, "PlayStation5", "Black", 499.99, 825, 2);
		playStation1.displayDetails();
        PlayStation playStation2= new PlayStation(1002, "PlayStation4 Pro", "Jet Black", 399.99, 1000, 1);
		playStation2.displayDetails();
        PlayStation playStation3= new PlayStation(1003, "PlayStation4 Slim","White", 299.99, 500, 2);
		playStation3.displayDetails();
        PlayStation playStation4= new PlayStation(1004, "PlayStation3","Black", 199.99, 250, 1);
		playStation4.displayDetails();
        PlayStation playStation5= new PlayStation(1005, "PlayStation2","Black", 99.99, 40, 2);
		playStation5.displayDetails();
        PlayStation playStation6= new PlayStation(1006, "PlayStation1","Gray", 49.99, 8, 1);
		playStation6.displayDetails();

        
	}
}