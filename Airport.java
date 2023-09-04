class Airport{
	int airportId;
	String airportName;
	int establisYear;
	String location;
	int runways;
	int terminals;
	
	public Airport(int airportId,String airportName,int establisYear,String location,int runways,int terminals){
		this.airportId=airportId;
		this.airportName=airportName;
		this.establisYear=establisYear;
		this.location=location;
		this.runways=runways;
		this.terminals=terminals;
		
	}
	public  void displayDetails(){
		System.out.println("Airport Id: "+airportId);
		System.out.println("Airport Name: "+airportName);
		System.out.println("Airport Establis Year: "+establisYear);
		System.out.println("Airport location: "+location);
		System.out.println("Airport runways: "+runways);
		System.out.println("Airport terminals: "+terminals);
		System.out.println("--------------------------------");
	}

}