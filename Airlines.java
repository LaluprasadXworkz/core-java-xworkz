class Airlines{
	
	
	
	int airlinesId;
	String airlinesName;
	String ownerName;
	int establisYear;
	int noOfFlight;
	int noOfPilots;
	
	public Airlines(int airlinesId,String airlinesName,String ownerName,int establisDate,int noOfFlight,int noOfPilots){
		this.airlinesId=airlinesId;
		this.airlinesName=airlinesName;
		this.ownerName=ownerName;
		this.establisYear=establisYear;
		this.noOfFlight=noOfFlight;
		this.noOfPilots=noOfPilots;
	}
	public  void displayDetails(){
		System.out.println("Airlines Id: "+airlinesId);
		System.out.println("Airlines Name: "+airlinesName);
		System.out.println("Airlines Owner Name: "+ownerName);
		System.out.println("Airlines Establis Year"+establisYear);
		System.out.println("No Of Flight in airlines: "+noOfFlight);
		System.out.println("No Of Pilots in airlines: "+noOfPilots);
		
		System.out.println("----------------------------------------");
	}

}