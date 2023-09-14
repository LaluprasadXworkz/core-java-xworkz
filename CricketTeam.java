class CricketTeam{
	
	String teamName[]=new String[11];
	int index;
	
	public boolean playerNames(String name){
		
		boolean isAdded =false;
		if(teamName.length>index  ){
		if(teamName!= null){
		boolean exists=checkPlayerNames(name);
		if(exists==false){
		teamName[index]=name;
		index ++;
		isAdded=true;
		}else{System.out.println(name+" Player name already exists");}
		}
		}else{
		System.out.println("Array Index Out Of BoundsException:"+teamName.length);
		}
		return isAdded;
	}
	public boolean checkPlayerNames(String name){
		boolean exists=false;
		for(int index=0;index<teamName.length;index++){
			if(teamName[index]==name){
				exists=true;
			}
		}
		return exists;
	}
	
	public void getDisplay(){
		System.out.println("list of Team Memebers:");
		for(int index=0;index< teamName.length;index++){
			System.out.println(teamName[index]);
			
		}
		
	}
	
	
}