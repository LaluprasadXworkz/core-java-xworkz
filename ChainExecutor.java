class ChainExecutor{
	
	public static void main(String[] args){
		Chain chain = new Chain();
		chain.chainID=1234;
		chain.chainName="Hand Chain";
		chain.shopName="kalyan jewellers";
		chain.chainMaterial="gold";
		chain.price=2000000;
		//chain.weight=80;
		
		
		System.out.println("Chain id "+chain.chainID);
		System.out.println("Chain Name  "+chain.chainName);
		System.out.println("Shope Name "+chain.shopName);
		System.out.println("Chain Material "+chain.chainMaterial);
		System.out.println("Price "+chain.price);
		//System.out.println("Weight in grams"+chain.weight);
		
		chain.shopChain();
		
		Chain chain1 = new Chain();
		chain1.chainID=562389;
		chain1.chainName="Neck chain1";
		chain1.shopName="kalyan jewellers";
		chain1.chainMaterial="gold";
		chain1.price=3000000;
		//chain1.weight=100;
		
		System.out.println("------------------------------------------------");
		System.out.println("chain id "+chain1.chainID);
		System.out.println("chain Name  "+chain1.chainName);
		System.out.println("Shope Name "+chain1.shopName);
		System.out.println("chain Material "+chain1.chainMaterial);
		System.out.println("Price "+chain1.price);
		//System.out.println("Weight in grams"+chain1.weight);
		
		chain1.shopChain();
}
}
