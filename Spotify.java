class Spotify{
	String playerNames[]=new String[11];
	int index;
	
	public boolean addSong(String name){
		
		boolean isAdded =false;
		if(playerNames.length>index  ){
		if(playerNames != null){
		boolean exists=checkSongName(name);
		if(exists==false){
		playerNames[index]=name;
		index ++;
		isAdded=true;
		}else{System.out.println(name+" Song already added");}
		}
		}else{
		System.out.println("Array Index Out Of BoundsException:"+playerNames.length);
		}
		return isAdded;
	}
	public boolean checkSongName(String name){
		boolean exists=false;
		for(int index=0;index<playerNames.length;index++){
			if(playerNames[index]==name){
				exists=true;
			}
		}
		return exists;
	}
	
	public void getDisplay(){
		System.out.println("list of Songs:");
		for(int index=0;index<playerNames.length;index++){
			System.out.println(playerNames[index]);
			
		}
	}
	
	
}