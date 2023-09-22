class ApplicationExe{
	
	public static void main(String[] appl){
		Application app=new Application();
		app.setName("Instagram");
		app.setSizeInMb(35.4);
		app.setVersion("v.05.02");
		app.setRatings("****");
		app.setNoOfDownloads("12cr");
		app.setCompanyName("Meta");
		
		PlayStore store=new PlayStore();
		store.application=app;
		
		store.managedBy="Google";
		System.out.println("Play stored is managed By"+store.managedBy);
		
		System.out.println("Application name : "+store.application.getName());
		System.out.println("Application Size : "+store.application.getSizeInMb());
		System.out.println("Application Version : "+store.application.getVersion());
		System.out.println("Application Rating : "+store.application.getRatings());
		System.out.println("Application No of Downloads : "+store.application.getNoOfDownloads());
		System.out.println("Application Company name : "+store.application.getCompanyName());
		
		
		
	}
}

