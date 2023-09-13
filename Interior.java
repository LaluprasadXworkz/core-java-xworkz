class Interior{
	String meterialNames[]=new String[10];
	int index;
	
	public boolean addMeterialNames(String name){
		boolean isAdded =false;
		if(meterialNames != null){
		meterialNames[index]=name;
		index ++;
		isAdded=true;
		}
		return isAdded;
	}
	
	public void getDisplay(){
		System.out.println("list of Meterial Names:");
		for(int index=0;index<meterialNames.length;index++){
			System.out.println(meterialNames[index]);
			
		}
	}
	
	
}