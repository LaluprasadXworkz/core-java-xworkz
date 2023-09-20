class Interior{
	String meterialNames[]=new String[10];
	int index;
	
	public boolean addMeterialNames(String name){
		boolean isAdded =false;
		if(meterialNames.length>index  ){
		if(meterialNames != null){
		boolean exists=checkMeterialName(name);
		if(exists==false){
		meterialNames[index]=name;
		index ++;
		isAdded=true;
		}else{System.out.println(name+" Meterial Already exists");}
		}
		}else{
		System.out.println("Array Index Out Of BoundsException:"+meterialNames.length);
		}
		return isAdded;
	}
	public boolean checkMeterialName(String name){
		boolean exists=false;
		for(int index=0;index<meterialNames.length;index++){
			if(meterialNames[index]==name){
				exists=true;
			}
		}
		return exists;
	}
	
	public void deleteMeterialNames(String name){
		String newMeterialNames[]=new String[meterialNames.length-1];
		int ind=0;
		for(int index=0;index<meterialNames.length;index++){
			if(meterialNames[index]!=name){
				newMeterialNames[ind++]=meterialNames[index];
				
			}
		}
		System.out.println("the deleted Meterials : "+name);
		System.out.println("Updated  of Meterials :");
		for(int index=0;index<newMeterialNames.length;index++){
			System.out.println(newMeterialNames[index]);
			
		}
	}
	
	public String searchMeterialName(String name){
		String exists=null;
		
		for(int index=0;index<meterialNames.length;index++){
			if(meterialNames[index]==name){
				exists=meterialNames[index];
				
			}
		}
		System.out.println("The Meterial  is available : "+exists);
		return exists;
	}
	
	public void getDisplay(){
		System.out.println("list of Meterial Names:");
		for(int index=0;index<meterialNames.length;index++){
			System.out.println(meterialNames[index]);
			
		}
	}
	
	
}