class EatSureExecutor{
	public static void main(String[] args){
		System.out.println("Main Started");
		double price=EatSure.find("Dragonfire Margherita Pizza");
		System.out.println("The price of Dragonfire Margherita Pizza is "+price);
		double price1=EatSure.find("Pesto Chicken Paradiso Pizza");
		System.out.println("The price of Pesto Chicken Paradiso Pizza  is "+price1);
		double price2=EatSure.find("Funky Funghi Feta Pizza");
		System.out.println("The price of Funky Funghi Feta Pizza  is "+price2);
		double price3=EatSure.find("Fajita Chicken Taco Indiana");
		System.out.println("The price of Fajita Chicken Taco Indiana is "+price3);
		
		System.out.println(" ");
		double priceWithQuantity=EatSure.find("Dragonfire Margherita Pizza",5);
		System.out.println("The price of Dragonfire Margherita Pizza is "+priceWithQuantity);
		double priceWithQuantity1=EatSure.find("Pesto Chicken Paradiso Pizza",4);
		System.out.println("The price of Pesto Chicken Paradiso Pizza  is "+priceWithQuantity1);
		double priceWithQuantity2=EatSure.find("Funky Funghi Feta Pizza",3);
		System.out.println("The price of Funky Funghi Feta Pizza is "+priceWithQuantity2);
		double priceWithQuantity3=EatSure.find("Fajita Chicken Taco Indiana",2);
		System.out.println("The price of Fajita Chicken Taco Indiana is "+priceWithQuantity3);
		System.out.println("Main ended");
	}
}