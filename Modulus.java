class Modulus{
	
	public static void main(String[] args){
	getMod(14, 28);
	getMod(19, 17);
	getMod(27, 23);
	getMod(15, 27);
	getMod(22, 20);
	getMod(24, 12);
	getMod(28, 14);
	getMod(25, 15);
	getMod(20, 29);
	getMod(26, 13);
	getMod(18, 21);
	getMod(29, 18);
	getMod(12, 30);
	getMod(16, 19);
	getMod(30, 24);
	getMod(23, 16);
	getMod(13, 25);
	getMod(21, 22);
	getMod(17, 26);
	getMod(30, 10);
	System.out.println("");
	getMod(14, 28,8);
	getMod(19, 17,6);
	getMod(27, 23,5);
	getMod(15, 27,5);
	getMod(22, 20,5);
	getMod(24, 12,8);
	getMod(28, 14,2);
	getMod(25, 15,7);
	getMod(20, 29,8);
	getMod(26, 13,9);
	getMod(18, 21,10);
	getMod(29, 18,8);
	getMod(12, 30,45);
	getMod(16, 19,56);
	getMod(30, 24,78);
	getMod(23, 16,45);
	getMod(13, 25,78);
	getMod(21, 22,8);
	getMod(17, 26,9);
	getMod(30, 30,8);
		
	}
	public static void getMod(int num1,int num2){
		System.out.println("remainder of the given "+num1+","+num2+" is "+num1%num2);
	}
	public static void getMod(int num1,int num2,int num3){
		System.out.println("remainder is "+num1%num2%num3);
	}
}