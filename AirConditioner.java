class AirConditioner{
	
	static boolean isConnected;
	static int maxTemperature =6;
	static int minTemperature;
	static  int currentTemperature;
	
	
	public static boolean onOrOff(){
	System.out.println("OnorOff Method Started");
		if(isConnected==false)
		{
			isConnected=true;
			System.out.println("The Air Conditioner is Turned Onn..!");
		}
		else if(isConnected==true)
		{
			isConnected=false;
			System.out.println("The Air Conditioner is Turned Off..!");
		}
		System.out.println(" Method Ended");
		
		return isConnected;
	}
	
	public static void increaseTemperature(){
	//System.out.println("Method Increase Temperature started");
		if(isConnected==true){
			if(currentTemperature<maxTemperature){
				currentTemperature=currentTemperature+1;
				System.out.println("The current Temperature is "+currentTemperature);
			}else{
				System.out.println("---------------------Maximum temperature range is 6--------------------- ");
			}
		}else{
			System.out.println("Plzz turn On the Air Conditioner");
		}
	//System.out.println("Method Increase Temperature ended");	
	}
	public static void decreaseTemperature(){
	//System.out.println("Method Decrease Temperature");
		if(isConnected==true){
			if(currentTemperature>minTemperature){
				currentTemperature=currentTemperature-1;
				System.out.println("The current Temperature is "+currentTemperature);
			}else{
				System.out.println("---------------------Minimum temperature range is 0--------------------- ");
			}
		}else{
			System.out.println("Plzz turn On the Air Conditioner");
		}
	//System.out.println("Method Decrease Temperature Ended");
	}
}