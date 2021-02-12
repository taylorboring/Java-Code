package Evaluator;

import java.util.Scanner;

public class Evaluator {


	public static void main(String[] args)  {
		
		Scanner user_input = new Scanner(System.in);
		
		System.out.print("Enter the expression: ");
		
		double expression = user_input.nextDouble();
		
		expression = user_input.nextInt();
		
		int operator = 0;
		int input;
		int result= 0;
		  
		String sign = "+";
		  
		while(true){
		
		if(operator == 0){
		
		input = Integer(nextLine());
		
		if(sign.equals("+")) {
		result = Addition(result, input);
		}
		else if(sign.equals("-")) {
		result = Subtraction(result, input);
		}
		else if(sign.equals("*")) {
		result = Product(result, input);
		}
		else if(sign.equals("/")) {
		result = Division(result, input);
		}
		else if(sign.equals("%")) {
		result = Mod(result, input);
	
		operator = 1;
		}
		}
		else if(operator == 1){
		sign = nextLine();
		operator = 0;
		}
		if(sign.equals(".")) {
		break;
		}
		}
		
		System.out.println("The result is "+result);
		}
		  
		private static int Integer(String nextLine) {
	
		return 0;
	}

		private static String nextLine() {
			return null;
		}

		static int Addition(int a, int b){
			return a+b;
		}
		  
		static int Subtraction(int a, int b){
			return a-b;
		}
		  
		static int Division(int a, int b){
			return a/b;
		}

		static int Product(int a, int b){
			return a*b;
		}
		  
		static int Mod(int a, int b){
			return a%b;
		
	}

}
