class Washingmachine{
	static boolean isConnected;
	static int maxWaterLevel =3;
	static int minWaterLevel;
	static int currentWaterLevel=0;
	static int timeForWash=30;
	
	
	public static boolean onOrOff()
	{
		System.out.println("invoking Method");
		if(isConnected==false){
			isConnected=true;
			System.out.println("The Washingmachine is Turned Onn..!");
		}else if(isConnected==true){
			isConnected=false;
			System.out.println("The Washingmachine is Turned Off..!");
		}
		System.out.println(" Method Ended");
		return isConnected;
	}
	public static void increaseWaterLevel(){
		if(isConnected==true){
			if(currentWaterLevel<maxWaterLevel){
				currentWaterLevel=currentWaterLevel+1;
				timeForWash=timeForWash+30;
				System.out.println("The time to complete washing "+timeForWash+"min");
			}else{
				System.out.println("Washing machine is full");
			}
		}else{
			System.out.println("TURN ON Washingmachin");
		}
	}
	
	public static void decreaseWaterLevel(){
		
		if(isConnected==true){
			if(currentWaterLevel>minWaterLevel){
				currentWaterLevel=currentWaterLevel-1;
				timeForWash=timeForWash-30;
				System.out.println("The time to complete washing is "+timeForWash+"min");
			}else{
				System.out.println("Washing machine is Empty");
			}
		}else{
			System.out.println("TURN ON Washingmachin");
		}
	}
}