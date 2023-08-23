class Television{
	static boolean isConnected;
	static int maxVolume =6;
	static int minVolume;
	static  int currentVolume;
	
	
	public static boolean onOrOff()
	{
		System.out.println("invoking Method");
		if(isConnected==false){
			isConnected=true;
			System.out.println("The Television is Turned Onn..!");
		}else if(isConnected==true){
			isConnected=false;
			System.out.println("The Television is Turned Off..!");
		}
		System.out.println(" Method Ended");
		return isConnected;
	}
	public static void increaseVolume(){
		if(isConnected==true){
			if(currentVolume<maxVolume){
				currentVolume=currentVolume+1;
				System.out.println("The Current volume of Television is "+currentVolume);
			}else{
				System.out.println("Max Volume of Television is Reached ");
			}
		}else{
			System.out.println("TURN ON THE Television");
		}
	}
	
	public static void decreaseVolume(){
		if(isConnected==true){
			if(currentVolume>minVolume){
				currentVolume=currentVolume-1;
				System.out.println("The Current volume of Television is "+currentVolume);
			}else{
				System.out.println("Television Volume is ZERO/Mute");
			}
		}else{
			System.out.println("TURN ON THE Television");
		}
	}
}