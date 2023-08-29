class SensorExecutor{
	
	public static void main(String[] args){
		Sensor sensor=new Sensor();
		
		sensor.sensorName="door Sensor";
		sensor.type="Tp-Link";
		sensor.sensetivity=100;
		sensor.price=1200;
		sensor.range=200;
		System.out.println("Sensor Name "+sensor.sensorName);
		System.out.println("Sensor type "+sensor.type);
		System.out.println("Sensetivity "+sensor.sensetivity);
		System.out.println("Sensor price "+sensor.price);
		System.out.println("Sensor price "+sensor.range);
		
		sensor.sensorShop();
		
		Sensor sensor1=new Sensor();
		
		sensor1.sensorName="temperater Sensor";
		sensor1.type="Tp-Link 200";
		sensor1.sensetivity=100;
		sensor1.price=500;
		sensor1.range=110;
		System.out.println("Sensor Name "+sensor1.sensorName);
		System.out.println("Sensor type "+sensor1.type);
		System.out.println("Sensetivity "+sensor1.sensetivity);
		System.out.println("Sensor price "+sensor1.price);
		System.out.println("Sensor price "+sensor1.range);
		
		sensor1.sensorShop();
	}
}