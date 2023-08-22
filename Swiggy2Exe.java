class Swiggy2Exe{
	public static void main(String[] args){
		
		System.out.println("Main started");
		double price=Swiggy2.search("Biryani Rice");
		System.out.println("the  price of Pizza "+price);
		
		double priceWithQuantity=Swiggy2.search("Biryani Rice",3);
		System.out.println("the  price of Pizza and quantity is "+priceWithQuantity);
		System.out.println("Main Ended");
	}
}