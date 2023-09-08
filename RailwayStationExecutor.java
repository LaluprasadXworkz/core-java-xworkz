class RailwayStationExecutor{
	public static void main(String rails[]){
		RailwayStation railway=new RailwayStation();
		railway.setRailwayId(123);
		railway.setRailwayName("KSR- bangluru");
		railway.setStationMaster("Master");
		railway.setNoOfPlatform(15);
		railway.setTicketCounter(4);
		railway.setNoOfWorkers(2000);
		
		System.out.println("Railway Id : "+railway.getRailwayId());
		System.out.println("Railway Name : "+railway.getRailwayName());
		System.out.println("Station Master Name : "+railway.getStationMaster());
		System.out.println("Number of Platform : "+railway.getNoOfPlatform());
		System.out.println("Railway ticket Counter : "+railway.getTicketCounter());
		System.out.println("Number of Workers : "+railway.getNoOfWorkers());
		
	}
}