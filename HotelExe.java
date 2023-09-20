class HotelExe{
	
	public static void main(String[] ottp){
		
	TajHotel	hotel=new TajHotel();
	hotel.foodName("Bisi Bele Bath");
	hotel.foodName("Neer Dosa");
	hotel.foodName("Ragi Mudde");
	hotel.foodName("Koli Saaru");
	hotel.foodName("Udupi Sambar");
	hotel.foodName("Chitranna");
	hotel.foodName("Jolada Roti");
	hotel.foodName("Butter Chicken");
	hotel.foodName("Biryani");
	//hotel.foodName("Chicken Biryani");
	//hotel.foodName("Chicken");
	//hotel.foodName("Bisi Bele Bath");
	hotel.foodName("Chai");	
	hotel.getDisplay();
	
	hotel.searchFoodName("Chai");
	
	hotel.deleteNamesFood("Chai");
	
	}
}