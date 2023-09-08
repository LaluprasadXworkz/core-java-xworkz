class RailwayStation{
	private int railwayId;
	private String railwayName;
	private String stationMaster;
	private int noOfPlatform;
	private int ticketCounter;
	private int noOfWorkers;
	
	
	public void setRailwayId(int railwayId){
		this.railwayId=railwayId;
	}
	public int getRailwayId(){
		return railwayId;
	}
	
	public void setRailwayName(String railwayName){
		this.railwayName=railwayName;
	}
	public String getRailwayName(){
		return railwayName;
	}
	
	public void setStationMaster(String stationMaster){
		this.stationMaster=stationMaster;
	}
	public String getStationMaster(){
		return stationMaster;
	}
	
	public void setNoOfPlatform(int noOfPlatform){
		this.noOfPlatform=noOfPlatform;
	}
	public int getNoOfPlatform(){
		return noOfPlatform;
	}
	
	public void setTicketCounter(int ticketCounter){
		this.ticketCounter=ticketCounter;
	}
	public int getTicketCounter(){
		return ticketCounter;
	}
	
	public void setNoOfWorkers(int noOfWorkers){
		this.noOfWorkers=noOfWorkers;
	}
	public int getNoOfWorkers(){
		return noOfWorkers;
	}
}