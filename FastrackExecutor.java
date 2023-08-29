class FastrackExecutor{
	
	public static void main(String[] args){
		Fastrack fastrack=new Fastrack();
		fastrack.fastrackId=456123789;
		fastrack.productName="Cooling glass";
		fastrack.type="Convex";
		fastrack.color="Black";
		fastrack.price=5000;
		System.out.println("Product Id "+fastrack.fastrackId);
		System.out.println("product Name"+fastrack.productName);
		System.out.println("Product Type"+fastrack.type);
		System.out.println("Color "+fastrack.color);
		System.out.println("Price :"+fastrack.price);
		
		fastrack.fastrackshop();
		
		Fastrack fastrack1=new Fastrack();


		fastrack1.fastrackId=456123789;
		fastrack1.productName="Sport watch";
		fastrack1.type="sport ";
		fastrack1.color="Black";
		fastrack1.price=15000;
		
		System.out.println("------------------------------------------------");
		System.out.println("Product Id "+fastrack1.fastrackId);
		System.out.println("product Name"+fastrack1.productName);
		System.out.println("Product Type"+fastrack1.type);
		System.out.println("Color "+fastrack1.color);
		System.out.println("Price :"+fastrack1.price);
		
		fastrack1.fastrackshop();
		
		
	}
	
}