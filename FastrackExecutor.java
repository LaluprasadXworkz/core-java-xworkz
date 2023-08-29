class FastrackExecutor{
	
	public static void main(String[] args){
		Fastrack fastrack=new Fastrack();
		fastrack.fastrackId=456123789;
		fastrack.productName="Fastrack Trendies";
		fastrack.caseMaterial="ALUMINIUM";
		fastrack.color="Black";
		fastrack.price=5000;
		
		System.out.println("Product Id "+fastrack.fastrackId);
		System.out.println("product Name"+fastrack.productName);
		System.out.println("Product Case Material"+fastrack.caseMaterial);
		System.out.println("Color "+fastrack.color);
		System.out.println("Price :"+fastrack.price);
		
		fastrack.fastrackshop();
		
		Fastrack fastrack1=new Fastrack();


		fastrack1.fastrackId=54723789;
		fastrack1.productName="Sport watch";
		fastrack1.caseMaterial="sport ";
		fastrack1.color="Black";
		fastrack1.price=15000;
		
		System.out.println("------------------------------------------------");
		System.out.println("Product Id "+fastrack1.fastrackId);
		System.out.println("product Name"+fastrack1.productName);
		System.out.println("Product Case Material"+fastrack1.caseMaterial);
		System.out.println("Color "+fastrack1.color);
		System.out.println("Price :"+fastrack1.price);
		
		fastrack1.fastrackshop();
		
		Fastrack fastrack2=new Fastrack();


		fastrack2.fastrackId=456223789;
		fastrack2.productName="REFLEX POWER";
		fastrack2.caseMaterial="SILICONE";
		fastrack2.color="WINE RED";
		fastrack2.price=4995;
		
		System.out.println("------------------------------------------------");
		System.out.println("Product Id "+fastrack2.fastrackId);
		System.out.println("product Name"+fastrack2.productName);
		System.out.println("Product Case Material"+fastrack2.caseMaterial);
		System.out.println("Color "+fastrack2.color);
		System.out.println("Price :"+fastrack2.price);
		
		fastrack2.fastrackshop();
		
		
		Fastrack fastrack3=new Fastrack();


		fastrack3.fastrackId=578333789;
		fastrack3.productName="FASTRACK REFLEX NITRO";
		fastrack3.caseMaterial="POLYCARBONATE";
		fastrack3.color="BLUE";
		fastrack3.price=2995;
		
		System.out.println("------------------------------------------------");
		System.out.println("Product Id "+fastrack3.fastrackId);
		System.out.println("product Name"+fastrack3.productName);
		System.out.println("Product Case Material"+fastrack3.caseMaterial);
		System.out.println("Color "+fastrack3.color);
		System.out.println("Price :"+fastrack3.price);
		
		fastrack3.fastrackshop();
		
		
		Fastrack fastrack4=new Fastrack();


		fastrack4.fastrackId=578444789;
		fastrack4.productName="TRENDIES";
		fastrack4.caseMaterial="SILICONE";
		fastrack4.color="PINK";
		fastrack4.price=1335;
		
		System.out.println("------------------------------------------------");
		System.out.println("Product Id "+fastrack4.fastrackId);
		System.out.println("product Name"+fastrack4.productName);
		System.out.println("Product Case Material"+fastrack4.caseMaterial);
		System.out.println("Color "+fastrack4.color);
		System.out.println("Price :"+fastrack4.price);
		
		fastrack4.fastrackshop();
		
	}
	
}
