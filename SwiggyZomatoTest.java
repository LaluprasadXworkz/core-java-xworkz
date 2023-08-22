class SwiggyZomatoTest{
	public static void main(String[] args){
		System.out.println("Main Started");
		double price=SwiggyZomato.find("Ceylon Parotta Combo");
		System.out.println("The price of the Ceylon Parotta Combo is "+price);
		double price1=SwiggyZomato.find("Choco Filled Muffin");
		System.out.println("The price of the Choco Filled Muffin  is "+price1);
		double price2=SwiggyZomato.find("Veggie Fingers");
		System.out.println("The price of the Veggie Fingers  is "+price2);
		double price3=SwiggyZomato.find("Aloo Wrap");
		System.out.println("The price of the Aloo Wrap  is "+price3);
		
		
		System.out.println(" ");
		double priceWithQuality=SwiggyZomato.find("Ceylon Parotta Combo",4);
		System.out.println("The price of the Ceylon Parotta Combo is "+priceWithQuality);
		double priceWithQuality1=SwiggyZomato.find("Choco Filled Muffin",2);
		System.out.println("The price of the Choco Filled Muffin is "+priceWithQuality1);
		double priceWithQuality2=SwiggyZomato.find("Veggie Fingers",8);
		System.out.println("The price of the Veggie Fingers  is "+priceWithQuality2);
		double priceWithQuality3=SwiggyZomato.find("Aloo Wrap",3);
		System.out.println("The price of the Aloo Wrap is "+priceWithQuality3);
		
		System.out.println("Main ended");
	}
}