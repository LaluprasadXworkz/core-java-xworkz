class Mixer{
	static boolean isConnected;
	static int maxPower =4;
	static int minPower;
	static  int currentPower;
	
	
	public static boolean onOrOff()
	{
		System.out.println("invoking Method");
		if(isConnected==false){
			isConnected=true;
			System.out.println("The Mixer is Turned Onn..!");
		}else if(isConnected==true){
			isConnected=false;
			System.out.println("The Mixer is Turned Off..!");
		}
		System.out.println(" Method Ended");
		return isConnected;
	}
	public static void increasePower(){
		if(isConnected==true){
			if(currentPower<maxPower){
				currentPower=currentPower+1;
				System.out.println("The Current Power of Mixer is increase by "+currentPower);
			}else{
				System.out.println("Maximum Power of Mixer is High ");
			}
		}else{
			System.out.println("TURN ON THE Mixer");
		}
	}
	
	public static void decreasePower(){
		if(isConnected==true){
			if(currentPower>minPower){
				currentPower=currentPower-1;
				System.out.println("The Current Power of Mixer is decrease by "+currentPower);
			}else{
				System.out.println("Mixer Power is ZERO/Off");
			}
		}else{
			System.out.println("TURN ON THE Mixer");
		}
	}
}