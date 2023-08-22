class SwiggyExecutor{
	public static void main(String[] args){
		System.out.println("Main started ");
		
		double price1= Swiggy.search("Chocolate Dream Cake");
		System.out.println("The price of is "+price1);
		double price2= Swiggy.search("Mutton Biryani");
		System.out.println("The price of Mutton Biryani is "+price2);
		double price3= Swiggy.search("Italian Margherita Pizza");
		System.out.println("The price of Italian Margherita Pizza is "+price3);
		double price4= Swiggy.search("Tres Leche Dessert Jar");
		System.out.println("The price of Tres Leche Dessert Jar is "+price4);
		
		System.out.println("");
		
		double pricewithQuantity1= Swiggy.search("Chocolate Dream Cake",4);
		System.out.println("The price of Chocolate Dream Cake is "+pricewithQuantity1);
		double pricewithQuantity2= Swiggy.search("Mutton Biryani",3);
		System.out.println("The price of Mutton Biryani is "+pricewithQuantity2);
		double pricewithQuantity3= Swiggy.search("Italian Margherita Pizza",5);
		System.out.println("The price of Italian Margherita Pizza is "+pricewithQuantity3);
		double pricewithQuantity4= Swiggy.search("Tres Leche Dessert Jar",2);
		System.out.println("The price of Tres Leche Dessert Jar is "+pricewithQuantity4);
		
		System.out.println("Main Ended");
	}
}