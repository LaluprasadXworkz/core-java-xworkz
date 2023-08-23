class Speaker
{
	
	static boolean isConnected;
	static int maxVolume =6;
	static int minVolume;
	static  int currentVolume;
	
	
	public static boolean onOrOff()
	{
		System.out.println("invoking Method");
		if(isConnected==false)
		{
			isConnected=true;
			System.out.println("The speaker is Turned Onn..!");
		}
		else if(isConnected==true)
		{
			isConnected=false;
			System.out.println("The speaker is Turned Off..!");
		}
		System.out.println(" Method Ended");
		
		return isConnected;
	}
	public static void increaseVolume(){
		if(isConnected==true){
			if(currentVolume<maxVolume){
				currentVolume=currentVolume+1;
				System.out.println("The Current volume is "+currentVolume);
			}
			else
			{
				System.out.println("Max Volume is Reached ");
			}
		}
		else
		{
			System.out.println("TURN ON THE SPEAKER");
		}
		
	}
	
	public static void decreaseVolume(){
		if(isConnected==true)
		{
			if(currentVolume>minVolume)
			{
				currentVolume=currentVolume-1;
				System.out.println("The Current volume is "+currentVolume);
			}else
			{
				System.out.println(" Volume is ZERO");
			}
		}
		else
		{
			System.out.println("TURN ON THE SPEAKER");
		}
	}
}