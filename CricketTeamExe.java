class CricketTeamExe{
	public static void main(String[] team){
	IndianTeam	cricket=new  IndianTeam();
	
	cricket.playerNames("Rohit Sharma (c)");
	cricket.playerNames("Hardik Pandya (vc)");
	cricket.playerNames("Shubman Gill");
	cricket.playerNames("Virat Kohli");
	//cricket.playerNames("Virat Kohli");
	cricket.playerNames("KL Rahul");
	cricket.playerNames("Ravindra Jadeja");
	cricket.playerNames("Shardul Thakur");
	cricket.playerNames("Jasprit Bumrah");
	cricket.playerNames("Mohammed Siraj");
	cricket.playerNames("Kuldeep Yadav");
	cricket.playerNames("Ishan Kishan");
	//cricket.playerNames("chala");
	
	cricket.getDisplay();
	cricket.SearchingPlayer("Ishan Kishan");
	cricket.deletePlayerName("Ishan Kishan");
	cricket.getNewDisplay();
	
	}
}