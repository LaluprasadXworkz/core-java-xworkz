class CricketTeam{
	
	String teamName[]=new String[11];
	int index;
	
	public boolean playerNames(String name){
		
		boolean isAdded =false;
		if(teamName!= null){
		teamName[index]=name;
		index ++;
		isAdded=true;
		}
		return isAdded;
	}
	
	public void getDisplay(){
		System.out.println("list of Team Memebers:");
		for(int index=0;index< teamName.length;index++){
			System.out.println(teamName[index]);
			
		}
	}
	
	
}