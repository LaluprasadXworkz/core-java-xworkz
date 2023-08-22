class Subtraction{
	
	public static void main(String[] args){
	getSub(14, 28);
	getSub(19, 17);
	getSub(27, 23);
	getSub(15, 27);
	getSub(22, 20);
	getSub(24, 12);
	getSub(28, 14);
	getSub(25, 15);
	getSub(20, 29);
	getSub(26, 13);
	getSub(18, 21);
	getSub(29, 18);
	getSub(12, 30);
	getSub(16, 19);
	getSub(30, 24);
	getSub(23, 16);
	getSub(13, 25);
	getSub(21, 22);
	getSub(17, 26);
	getSub(30, 30);
	System.out.println("");
	getSub(14, 28,8);
	getSub(19, 17,6);
	getSub(27, 23,5);
	getSub(15, 27,5);
	getSub(22, 20,5);
	getSub(24, 12,8);
	getSub(28, 14,2);
	getSub(25, 15,7);
	getSub(20, 29,8);
	getSub(26, 13,9);
	getSub(18, 21,10);
	getSub(29, 18,8);
	getSub(12, 30,45);
	getSub(16, 19,56);
	getSub(30, 24,78);
	getSub(23, 16,45);
	getSub(13, 25,78);
	getSub(21, 22,8);
	getSub(17, 26,9);
	getSub(30, 30,8);
		
	}
	public static void getSub(int num1,int num2){
		int sub=num1-num2;
		System.out.println("Subtraction  is "+sub);
	}
	public static void getSub(int num1,int num2,int num3){
		int sub=num1-num2-num3;
		System.out.println("Subtraction  is "+sub);
	}
}