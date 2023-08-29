class ChainExecutor{
	
	public static void main(String[] args){
		Chain chain = new Chain();
		
		chain.chainID=1234;
		chain.chainName="Hand Chain";
		chain.shopName="kalyan jewellers";
		chain.chainMaterial="gold";
		chain.price=2000000;
		chain.weigthInGrams=100;
		
		
		System.out.println("Chain id "+chain.chainID);
		System.out.println("Chain Name  "+chain.chainName);
		System.out.println("Shope Name "+chain.shopName);
		System.out.println("Chain Material "+chain.chainMaterial);
		System.out.println("Price "+chain.price);
		System.out.println("Weight in grams :"+chain.weigthInGrams);
		
		chain.shopChain();
		
		Chain chain1 = new Chain();
		
		
		chain1.chainID=562389;
		chain1.chainName="Neck chain1";
		chain1.shopName="kalyan jewellers";
		chain1.chainMaterial="gold";
		chain1.price=3000000;
		chain1.weigthInGrams=80;
		
		System.out.println("------------------------------------------------");
		System.out.println("chain id "+chain1.chainID);
		System.out.println("chain Name  "+chain1.chainName);
		System.out.println("Shope Name "+chain1.shopName);
		System.out.println("chain Material "+chain1.chainMaterial);
		System.out.println("Price "+chain1.price);
		System.out.println("Weight in grams :"+chain1.weigthInGrams);
		
		chain1.shopChain();
		
		
		Chain chain2 = new Chain();
		
		
		chain2.chainID=523289;
		chain2.chainName="Leg Chain";
		chain2.shopName="Reliance Jewels";
		chain2.chainMaterial="gold";
		chain2.price=3500000;
		chain2.weigthInGrams=85;
		
		System.out.println("------------------------------------------------");
		System.out.println("chain id "+chain2.chainID);
		System.out.println("chain Name  "+chain2.chainName);
		System.out.println("Shope Name "+chain2.shopName);
		System.out.println("chain Material "+chain2.chainMaterial);
		System.out.println("Price "+chain2.price);
		System.out.println("Weight in grams :"+chain2.weigthInGrams);
		
		chain2.shopChain();
		
		
		Chain chain3 = new Chain();
		
		
		chain3.chainID=563389;
		chain3.chainName="Ear Chain";
		chain3.shopName="CaratLane";
		chain3.chainMaterial="gold";
		chain3.price=200000;
		chain3.weigthInGrams=85;
		
		System.out.println("------------------------------------------------");
		System.out.println("chain id "+chain3.chainID);
		System.out.println("chain Name  "+chain3.chainName);
		System.out.println("Shope Name "+chain3.shopName);
		System.out.println("chain Material "+chain3.chainMaterial);
		System.out.println("Price "+chain3.price);
		System.out.println("Weight in grams :"+chain3.weigthInGrams);
		
		chain3.shopChain();
		
		Chain chain4 = new Chain();
		
		
		chain4.chainID=564489;
		chain4.chainName="Cable Chain";
		chain4.shopName="Bhima Jewellers";
		chain4.chainMaterial="gold";
		chain4.price=400000;
		chain4.weigthInGrams=185;
		
		System.out.println("------------------------------------------------");
		System.out.println("chain id "+chain4.chainID);
		System.out.println("chain Name  "+chain4.chainName);
		System.out.println("Shope Name "+chain4.shopName);
		System.out.println("chain Material "+chain4.chainMaterial);
		System.out.println("Price "+chain4.price);
		System.out.println("Weight in grams :"+chain4.weigthInGrams);
		
		chain4.shopChain();
}
}
