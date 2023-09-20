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
	public boolean deleteNamesFood(String name){
		boolean isDeleted =false;
		String newMenu[]=new String[menu.length-1];
		int ind=0;
		for(int index=0;index<menu.length;index++){
			if(menu[index]!=name){
				newMenu[ind++]=menu[index];
				isDeleted=true;
			}
		}
		System.out.println("the deleted Food name: "+name);
		System.out.println("Updated  of Hotel menu:");
		for(int index=0;index<newMenu.length;index++){
			System.out.println(newMenu[index]);
			
		}
		return isDeleted;
	}
	
	public String searchFoodName(String name){
		String exists=null;
		
		for(int index=0;index<menu.length;index++){
			if(menu[index]==name){
				exists=menu[index];
				
			}
		}
		System.out.println("The food is available : "+exists);
		return exists;
	}
	
	
	public void getDisplay(){
		System.out.println("list of Hotel menu:");
		for(int index=0;index<menu.length;index++){
			System.out.println(menu[index]);
			
		}
	}
	
	
}