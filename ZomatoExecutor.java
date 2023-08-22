class ZomatoExecutor{
	public static void main(String[] args){
		System.out.println("Main started");
		
		double price=Zomato.search("Grilled Chicken");
		System.out.println("The price of Grilled "+price);
		double price1=Zomato.search("Karuveppilai Thokku");
		System.out.println("The price of Karuveppilai Thokku is  "+price1);
		double price2=Zomato.search("Garlic Pickle");
		System.out.println("The price of Garlic Pickle is "+price2);
		double price3=Zomato.search("Navarathana Pulao");
		System.out.println("The price of Navarathana Pulao is "+price3);
		System.out.println(" ");
		double priceWithQuantity=Zomato.search("Grilled Chicken",5);
		System.out.println("The price of Grilled "+priceWithQuantity);
		double priceWithQuantity1=Zomato.search("Karuveppilai Thokku",2);
		System.out.println("The price of Karuveppilai Thokku is "+priceWithQuantity1);
		double priceWithQuantity2=Zomato.search("Garlic Pickle",4);
		System.out.println("The price of Garlic Pickle is "+priceWithQuantity2);
		double priceWithQuantity3=Zomato.search("Navarathana Pulao",6);
		System.out.println("The price of Navarathana Pulao is "+priceWithQuantity3);
		
		System.out.println("Main  ended");
	}
}