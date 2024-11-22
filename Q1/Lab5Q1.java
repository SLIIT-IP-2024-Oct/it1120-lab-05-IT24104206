import java.util.Scanner;
	public class Lab5Q1{
		public static void main(String[]args){

			//import the Scanner
			Scanner input=new Scanner(System.in);

			//define variables
			int number1,number2,number3;

			//input the numbers

			System.out.println("Enter the number 1");
			number1=input.nextInt();
			
			System.out.println("Enter the number 2");
			number2=input.nextInt();

			System.out.println("Enter the number 3");
			number3=input.nextInt();

			//calculate the largest number
			if(number1>=number2&&number1>=number3){
				System.out.println("The largest number is:"+number1);
				}
			else if(number2>=number3&&number2>=number1){
				System.out.println("The largest number is:"+number2);
				}
			else{
				System.out.println("The largest number is:"+number3);
				}
			//calculate the smallest number
			if(number1<=number2&&number1<=number3){
				System.out.println("The smallest number is:"+number1);
				}
			else if(number2<=number3&&number2<=number1){
				System.out.println("The smallest number is:"+number2);
				}
			else{
				System.out.println("The smallest number is:"+number3);
			    }
			}
}

			
