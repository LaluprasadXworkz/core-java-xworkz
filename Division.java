class Division{
	
	public static void main(String[] args){
	getDiv(14, 28);
	getDiv(19, 17);
	getDiv(27, 23);
	getDiv(15, 27);
	getDiv(22, 20);
	getDiv(24, 12);
	getDiv(28, 14);
	getDiv(25, 15);
	getDiv(20, 29);
	getDiv(26, 13);
	getDiv(18, 21);
	getDiv(29, 18);
	getDiv(12, 30);
	getDiv(16, 19);
	getDiv(30, 24);
	getDiv(23, 16);
	getDiv(13, 25);
	getDiv(21, 22);
	getDiv(17, 26);
	getDiv(30, 30);
	System.out.println("");
	getDiv(14, 28,8);
	getDiv(19, 17,6);
	getDiv(27, 23,5);
	getDiv(15, 27,5);
	getDiv(22, 20,5);
	getDiv(24, 12,8);
	getDiv(28, 14,2);
	getDiv(25, 15,7);
	getDiv(20, 29,8);
	getDiv(26, 13,9);
	getDiv(18, 21,10);
	getDiv(29, 18,8);
	getDiv(12, 30,45);
	getDiv(16, 19,56);
	getDiv(30, 24,78);
	getDiv(23, 16,45);
	getDiv(13, 25,78);
	getDiv(21, 22,8);
	getDiv(17, 26,9);
	getDiv(30, 30,8);
		
	}
	public static void getDiv(int num1,int num2){
		System.out.println("Division  is "+num1/num2);
	}
	public static void getDiv(int num1,int num2,int num3){
		System.out.println("Division is "+num1/num2/num3);
	}
}