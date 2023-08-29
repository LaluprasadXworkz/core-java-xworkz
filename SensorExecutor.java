class SensorExecutor{
	
	public static void main(String[] args){
		Sensor sensor=new Sensor();
		
		sensor.sensorId=123;
		sensor.typeOfSensor="Humidity Sensor";
		sensor.sensetivity=100;
		sensor.environmental="Indoor";
		sensor.outputType="Analog";
		System.out.println("Sensor Id "+sensor.sensorId);
		System.out.println("Sensor type Of Sensor "+sensor.typeOfSensor);
		System.out.println("Sensetivity "+sensor.sensetivity);
		System.out.println("Sensor Environment "+sensor.environmental);
		System.out.println("Sensor Output type "+sensor.outputType);
		
		sensor.sensorShop();
		
		Sensor sensor1=new Sensor();
		
		sensor1.sensorId=254;
		sensor1.typeOfSensor="Temperature Sensor";
		sensor1.sensetivity=100;
		sensor1.environmental="Indoor";
		sensor1.outputType="Analog";
		System.out.println("Sensor Name "+sensor1.sensorId);
		System.out.println("Sensor type of Sensor "+sensor1.typeOfSensor);
		System.out.println("Sensetivity "+sensor1.sensetivity);
		System.out.println("Sensor Environment "+sensor1.environmental);
		System.out.println("Sensor Output type "+sensor1.outputType);
		
		sensor1.sensorShop();
		
		Sensor sensor2=new Sensor();
		
		sensor2.sensorId=423;
		sensor2.typeOfSensor="Pressure Sensor";
		sensor2.sensetivity=180;
		sensor2.environmental="Industrial";
		sensor2.outputType="Analog";
		System.out.println("Sensor Name "+sensor2.sensorId);
		System.out.println("Sensor type of Sensor "+sensor2.typeOfSensor);
		System.out.println("Sensetivity "+sensor2.sensetivity);
		System.out.println("Sensor Environment "+sensor2.environmental);
		System.out.println("Sensor Output type "+sensor2.outputType);
		
		sensor2.sensorShop();
		
		Sensor sensor3=new Sensor();
		
		sensor3.sensorId=433;
		sensor3.typeOfSensor="Light Intensity Sensor";
		sensor3.sensetivity=80;
		sensor3.environmental="Indoor/Outdoor";
		sensor3.outputType="Analog";
		System.out.println("Sensor Name "+sensor3.sensorId);
		System.out.println("Sensor type of Sensor "+sensor3.typeOfSensor);
		System.out.println("Sensetivity "+sensor3.sensetivity);
		System.out.println("Sensor Environment "+sensor3.environmental);
		System.out.println("Sensor Output type "+sensor3.outputType);
		
		sensor3.sensorShop();
		
		Sensor sensor4=new Sensor();
		
		sensor4.sensorId=453;
		sensor4.typeOfSensor="Motion Sensor";
		sensor4.sensetivity=210;
		sensor4.environmental="Indoor";
		sensor4.outputType="Analog";
		System.out.println("Sensor Name "+sensor4.sensorId);
		System.out.println("Sensor type of Sensor "+sensor4.typeOfSensor);
		System.out.println("Sensetivity "+sensor4.sensetivity);
		System.out.println("Sensor Environment "+sensor4.environmental);
		System.out.println("Sensor Output type "+sensor4.outputType);
		
		sensor4.sensorShop();
		
	}
}