class MicroWave{
	static boolean isConnected;
	static int maxHead =5;
	static int minHead;
	static  int currentHead;
	
	
	public static boolean onOrOff()
	{
		System.out.println("invoking Method");
		if(isConnected==false){
			isConnected=true;
			System.out.println("The Micro Wave is Turned Onn..!");
		}else if(isConnected==true){
			isConnected=false;
			System.out.println("The Micro Wave is Turned Off..!");
		}
		System.out.println(" Method Ended");
		return isConnected;
	}
	public static void heatIncrease(){
		if(isConnected==true){
			if(currentHead<maxHead){
				currentHead=currentHead+1;
				System.out.println("The Micro Wave Temperature increase by "+currentHead);
			}else{
				System.out.println("Maximum heat of Micro Wave is High ");
			}
		}else{
			System.out.println("TURN ON THE Micro Wave");
		}
	}
	
	public static void heatDecrease(){
		if(isConnected==true){
			if(currentHead>minHead){
				currentHead=currentHead-1;
				System.out.println("The Micro Wave Temperature  decrease by "+currentHead);
			}else{
				System.out.println("Micro Wave is Off");
			}
		}else{
			System.out.println("TURN ON THE Micro Wave");
		}
	}
}