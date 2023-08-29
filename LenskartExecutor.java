class LenskartExecutor{
	
	public static void main(String[] args){
		Lenskart lenskart = new Lenskart();
		lenskart.brandId=1234;
		lenskart.brandName="Lenskart";
		lenskart.buyerName="AbC";
		lenskart.type="Convex";
		lenskart.price=5000;
		lenskart.date="12/05/2023";
		
		System.out.println("------------------------------------------------");
		System.out.println("Lenskart Product id "+lenskart.brandId);
		System.out.println("Lenskart brand Name "+lenskart.brandName);
		System.out.println("Lenskart Buyer Name "+lenskart.buyerName);
		System.out.println("Glass Type "+lenskart.type);
		System.out.println("Price "+lenskart.price);
		System.out.println("Date of purchase "+lenskart.date);		
		
		lenskart.lenskarSales();
		
		Lenskart lenskart1 = new Lenskart();
		lenskart1.brandId=5624;
		lenskart1.brandName="lenskart  stores";
		lenskart1.buyerName="DEFH";
		lenskart1.type="Concave";
		lenskart1.price=7000;
		lenskart1.date="25/09/2023";
		
		System.out.println("------------------------------------------------");
		System.out.println("lenskart Product id "+lenskart1.brandId);
		System.out.println("lenskart brand Name "+lenskart1.brandName);
		System.out.println("lenskart Buyer Name "+lenskart1.buyerName);
		System.out.println("Glass Type "+lenskart1.type);
		System.out.println("Price "+lenskart1.price);
		System.out.println("Date of purchase "+lenskart1.date);
		
		lenskart1.lenskarSales();
	}
	
}