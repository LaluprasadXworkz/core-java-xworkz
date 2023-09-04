class AirlinesExecutor{
	
	public static void main(String[] args){
		
		
		
		
		Airlines airlines=new Airlines(123,"IndiGo","Rahul Bhatia &Rakesh Gangwal",2005,109,7080);
		airlines.displayDetails();
		
		
		Airlines airlines1 = new Airlines(456, "Emirates", "Maurice Flanagan",1985,170,60000);
		airlines1.displayDetails();
		
		Airlines airlines2 = new Airlines(789, "Delta Air Lines", "Huff Daland Dusters",1924,200,70000);
		airlines2.displayDetails();
		
		Airlines airlines3 = new Airlines(101, "American Airlines", "C.R. Smith",1930,300,85000);
		airlines3.displayDetails();
		
		Airlines airlines4 = new Airlines(222, "British Airways", "Willie Walsh",1974,150,42000);
		airlines4.displayDetails();
		
		Airlines airlines5 = new Airlines(333, "Lufthansa", "Carl August von Gablenz",1953,200,68000);
		airlines5.displayDetails();


	}
}