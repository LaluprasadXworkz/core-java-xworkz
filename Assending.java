class Assending	{
    public static void main(String[] args) {
        int number[] = { 5, 2, 9, 1, 5, 6 };
        /*for (int i = 0; i < number.length - 1; i++) {
            for (int j = 0; j < number.length - 1 - i; j++) {
                if (number[j] > number[j + 1]) {
                    int number1 = number[j];
                    number[j] = number[j + 1];
                    number[j + 1] = number1;
                }
            }
        }
        for (int numbers : number) {
            System.out.println(numbers + " ");
        }*/
		System.out.println(number[9]);
    }
}
public static void main(String[] args){
		int factNumber=5;
		int dummy=1;
		for(int fact=1;fact<=factNumber;fact++){
			dummy=dummy*fact;
		}
		System.out.println("the Factorial of the "+factNumber+" is "+dummy);
	} 