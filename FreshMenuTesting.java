class FreshMenuTesting{
	public static void main(String[] args){
		System.out.println("Main Started");
		double price=FreshMenu.find("Butter Bun Maska With Fruits");
		System.out.println("The price of Butter Bun Maska With Creamy Eggs is "+price);
		double price1=FreshMenu.find("Classic French Toast Combo");
		System.out.println("The price of Classic French Toast Combo  is "+price1);
		double price3=FreshMenu.find("Paneer Popeye Sandwich");
		System.out.println("The price of Paneer Popeye Sandwich is "+price3);
		double price2=FreshMenu.find("Veggie Ratatouille Focaccia");
		System.out.println("The price of Veggie Ratatouille Focaccia is "+price2);
		System.out.println(" ");
		System.out.println("Main Started");
		double priceWithQuantity=FreshMenu.find("Butter Bun Maska With Fruits",4);
		System.out.println("The price of Butter Bun Maska With Creamy Eggs is "+priceWithQuantity);
		double priceWithQuantity1=FreshMenu.find("Classic French Toast Combo",2);
		System.out.println("The price of Classic French Toast Combo  is "+priceWithQuantity1);
		double priceWithQuantity2=FreshMenu.find("Paneer Popeye Sandwich",3);
		System.out.println("The price of Paneer Popeye Sandwich is "+priceWithQuantity2);
		double priceWithQuantity3=FreshMenu.find("Veggie Ratatouille Focaccia",5);
		System.out.println("The price of Veggie Ratatouille Focaccia is "+priceWithQuantity3);
		System.out.println("Main ended");
	}

}