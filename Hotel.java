class Hotel{
	String menu[]=new String[10];
	int index;
	
	public boolean foodName(String name){
		boolean isAdded =false;
		if(menu.length>index  ){
		if(menu!= null){
		boolean exists=checkFoodName(name);
		if(exists==false){
		menu[index]=name;
		index ++;
		isAdded=true;
		}
		else{System.out.println(name+"Food name Already Exested");}
		}
		}else{
		System.out.println("Array Index Out Of BoundsException:"+menu.length);
		}
		return isAdded;
	}
	public boolean checkFoodName(String name){
		boolean exists=false;
		for(int index=0;index<menu.length;index++){
			if(menu[index]==name){
				exists=true;
			}
		}
		return exists;
	}
	
	public void getDisplay(){
		System.out.println("list of Hotel menu:");
		for(int index=0;index<menu.length;index++){
			System.out.println(menu[index]);
			
		}
	}
	
	
}