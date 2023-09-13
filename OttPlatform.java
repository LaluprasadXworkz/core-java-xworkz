class OttPlatform{
	String movieName[]=new String[4];
	int index;
	
	public boolean addMovieName(String name){
		//System.out.println();
		boolean isAdded =false;
		if(movieName != null){
		//System.out.println("");	
		movieName[index]=name;
		index ++;
		isAdded=true;
		}
		return isAdded;
	}
	
	public void getDisplay(){
		System.out.println("list of movies:");
		for(int index=0;index< movieName.length;index++){
			System.out.println(movieName[index]);
			
		}
	}
	
	
}