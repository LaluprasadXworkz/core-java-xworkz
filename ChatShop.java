class ChatShop{
	String chatName[]=new String[10];
	int index;
	
	public boolean addChatName(String name){
		boolean isAdded =false;
		if( chatName != null){
		chatName[index]=name;
		index ++;
		isAdded=true;
		}
		return isAdded;
	}
	
	public void getDisplay(){
		System.out.println("list of Chat Menu:");
		for(int index=0;index< chatName.length;index++){
			System.out.println(chatName[index]);
			
		}
	}
	
	
}