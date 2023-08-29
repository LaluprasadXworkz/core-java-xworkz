class LenskartExecutor{
	
	public static void main(String[] args){
		Lenskart lenskart = new Lenskart();
		lenskart.brandId=1234;
		lenskart.specsType="Full-Rimmed Frames";
		lenskart.buyerName="AbC";
		lenskart.type="Convex";
		lenskart.eyeSite=1.2;
		lenskart.price=5000;
		lenskart.date="12/05/2023";
		
		
		System.out.println("Lenskart Product id "+lenskart.brandId);
		System.out.println("Lenskart brand Name "+lenskart.specsType);
		System.out.println("Lenskart Buyer Name "+lenskart.buyerName);
		System.out.println("Glass Type "+lenskart.type);
		System.out.println("Eye Site "+lenskart.eyeSite);
		System.out.println("Price "+lenskart.price);
		System.out.println("Date of purchase "+lenskart.date);		
		
		lenskart.lenskarSales();
		
		Lenskart lenskart1 = new Lenskart();
		lenskart1.brandId=5647;
		lenskart1.specsType="Rimless Frames";
		lenskart1.buyerName="Def";
		lenskart1.type="Convex";
		lenskart1.eyeSite=1.5;
		lenskart1.price=2000;
		lenskart1.date="13/06/2023";
		
		System.out.println("------------------------------------------------");
		System.out.println("Lenskart Product id "+lenskart1.brandId);
		System.out.println("Lenskart brand Name "+lenskart1.specsType);
		System.out.println("Lenskart Buyer Name "+lenskart1.buyerName);
		System.out.println("Glass Type "+lenskart1.type);
		System.out.println("Eye Site "+lenskart1.eyeSite);
		System.out.println("Price "+lenskart1.price);
		System.out.println("Date of purchase "+lenskart1.date);		
		
		lenskart1.lenskarSales();
		
		Lenskart lenskart2 = new Lenskart();
		
		lenskart2.brandId=54147;
		lenskart2.specsType="Semi-Rimless Frames";
		lenskart2.buyerName="GHij";
		lenskart2.type="Concave";
		lenskart2.eyeSite=0.3;
		lenskart2.price=4000;
		lenskart2.date="04/07/2023";
		
		System.out.println("------------------------------------------------");
		System.out.println("Lenskart Product id "+lenskart2.brandId);
		System.out.println("Lenskart brand Name "+lenskart2.specsType);
		System.out.println("Lenskart Buyer Name "+lenskart2.buyerName);
		System.out.println("Glass Type "+lenskart2.type);
		System.out.println("Eye Site "+lenskart2.eyeSite);
		System.out.println("Price "+lenskart2.price);
		System.out.println("Date of purchase "+lenskart2.date);		
		
		lenskart2.lenskarSales();
		
		Lenskart lenskart3 = new Lenskart();
		
		lenskart3.brandId=4561;
		lenskart3.specsType="Low Bridge Frames";
		lenskart3.buyerName="lkjh";
		lenskart3.type="Convex";
		lenskart3.eyeSite=1.0;
		lenskart3.price=5500;
		lenskart3.date="04/07/2023";
		
		System.out.println("------------------------------------------------");
		System.out.println("Lenskart Product id "+lenskart3.brandId);
		System.out.println("Lenskart brand Name "+lenskart3.specsType);
		System.out.println("Lenskart Buyer Name "+lenskart3.buyerName);
		System.out.println("Glass Type "+lenskart3.type);
		System.out.println("Eye Site "+lenskart3.eyeSite);
		System.out.println("Price "+lenskart3.price);
		System.out.println("Date of purchase "+lenskart3.date);		
		
		lenskart3.lenskarSales();
		
		Lenskart lenskart4 = new Lenskart();
		
		lenskart4.brandId=7894;
		lenskart4.specsType="Wire Frames";
		lenskart4.buyerName="Asvghdg";
		lenskart4.type="Convex";
		lenskart4.eyeSite=1.9;
		lenskart4.price=6500;
		lenskart4.date="24/09/2022";
		
		System.out.println("------------------------------------------------");
		System.out.println("Lenskart Product id "+lenskart4.brandId);
		System.out.println("Lenskart brand Name "+lenskart4.specsType);
		System.out.println("Lenskart Buyer Name "+lenskart4.buyerName);
		System.out.println("Glass Type "+lenskart4.type);
		System.out.println("Eye Site "+lenskart4.eyeSite);
		System.out.println("Price "+lenskart4.price);
		System.out.println("Date of purchase "+lenskart4.date);		
		
		lenskart4.lenskarSales();
		

	}
	
}