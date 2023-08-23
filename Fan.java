class Fan{
	static boolean isConnected;
	static int maxSpeed =5;
	static int minSpeed;
	static  int currentSpeed;
	
	
	public static boolean onOrOff()
	{
		System.out.println("invoking Method");
		if(isConnected==false){
			isConnected=true;
			System.out.println("The Fan is Turned Onn..!");
		}else if(isConnected==true){
			isConnected=false;
			System.out.println("The Fan is Turned Off..!");
		}
		System.out.println(" Method Ended");
		return isConnected;
	}
	public static void increaseSpeed(){
		if(isConnected==true){
			if(currentSpeed<maxSpeed){
				currentSpeed=currentSpeed+1;
				System.out.println("The Current Speed of Fan is "+currentSpeed);
			}else{
				System.out.println("Max Speed of Fan is Five ");
			}
		}else{
			System.out.println("TURN ON THE Fan");
		}
	}
	
	public static void decreaseSpeed(){
		if(isConnected==true){
			if(currentSpeed>minSpeed ){
				currentSpeed=currentSpeed-1;
				System.out.println("The Current Speed of Fan is "+currentSpeed);
			}else{
				System.out.println("Fan Speed is ZERO");
			}
		}else{
			System.out.println("TURN ON THE Fan");
		}
	}
}
