class Swiggy2{
	public static double search(String foodName){
		double price=0.0;
	System.out.println("Invoked search:foodName(String)");
	if(foodName=="Biryani Rice"){
	price=120;
		
	}
	if(foodName=="Chicken Boneless Biryani"){
		price=325;
	}
	if(foodName=="Hyderabadi Chicken Biryani"){
		price=240;
	}
	if(foodName=="Paneer Biryani"){
		price=330;
		
	}
	System.out.println("End of search:foodName(String)");
	return price;
	}
	
	
	public static double search(String foodName,int quantity){
		double price=0.0;
	System.out.println("Invoked search:foodName(String ,int)");
	if(foodName=="Biryani Rice"){
	price=120*quantity;
		
	}
	if(foodName=="Chicken Boneless Biryani"){
		price=325*quantity;
	}
	if(foodName=="Hyderabadi Chicken Biryani"){
		price=240*quantity;
	}
	if(foodName=="Paneer Biryani"){
		price=330*quantity;
		
	}
	System.out.println("End of search:foodName(String ,int)");
	return price;
	}
	
}