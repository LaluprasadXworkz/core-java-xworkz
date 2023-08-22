class Multiplication{
	
	public static void main(String[] args){
	getMult(14, 28);
	getMult(19, 17);
	getMult(27, 23);
	getMult(15, 27);
	getMult(22, 20);
	getMult(24, 12);
	getMult(28, 14);
	getMult(25, 15);
	getMult(20, 29);
	getMult(26, 13);
	getMult(18, 21);
	getMult(29, 18);
	getMult(12, 30);
	getMult(16, 19);
	getMult(30, 24);
	getMult(23, 16);
	getMult(13, 25);
	getMult(21, 22);
	getMult(17, 26);
	getMult(30, 50);
	System.out.println("");
	getMult(14, 28,8);
	getMult(19, 17,6);
	getMult(27, 23,5);
	getMult(15, 27,5);
	getMult(22, 20,5);
	getMult(24, 12,8);
	getMult(28, 14,2);
	getMult(25, 15,7);
	getMult(20, 29,8);
	getMult(26, 13,9);
	getMult(18, 21,10);
	getMult(29, 18,8);
	getMult(12, 30,45);
	getMult(16, 19,56);
	getMult(30, 24,78);
	getMult(23, 16,45);
	getMult(13, 25,78);
	getMult(21, 22,8);
	getMult(17, 26,9);
	getMult(30, 30,8);
		
	}
	public static void getMult(int num1,int num2){
		System.out.println("Product  is "+num1*num2);
	}
	
	public static void getMult(int num1,int num2,int num3){
		System.out.println("Product   is "+num1*num2*num3);
	}
}