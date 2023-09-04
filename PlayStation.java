class PlayStation{
	
	int playstationId;
    String model;
    String color;
    double price;
    int storageCapacity;
	int noOfJoystick;
	
	
	public PlayStation(int playstationId,String model,String color,double price,int storageCapacity,int noOfJoystick){
		this.playstationId=playstationId;
		this.model=model;
		this.color=color;
		this.storageCapacity=storageCapacity;
		this.noOfJoystick=noOfJoystick;
	}
	public void displayDetails() {
        System.out.println("Playstation ID: " +playstationId);
        System.out.println("Model: " +model);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Storage Capacity: " +storageCapacity+" GB");
        System.out.println("Number of Joysticks: " +noOfJoystick);
		System.out.println("-------------------------------------");
    }
}