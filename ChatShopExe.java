class ChatShopExe{
	
	public static void main(String[] ottp){
		
		PaniPuri chat=new PaniPuri();
		chat.addChatName("Pani puri");
		chat.addChatName("Masala puri");
		chat.addChatName("Masala Cheese Pori");
		chat.addChatName("Bheal pori");
		chat.addChatName("Veg Sandwich");
		chat.addChatName("Samosa Chat");
		chat.addChatName("Cheese Puff");
		chat.addChatName("Puff");
		chat.addChatName("Masala Pav Bhaji");
		chat.addChatName("Pani puri");
		chat.addChatName("Vada Pav");
		//chat.addChatName("katore chat");
		chat.getDisplay();
		
		String a=chat.search("Bheal pori");
		//System.out.println("Chat name is in chat Shop "+a);
		chat.deleteNames("Puff");
		
		
	}
}