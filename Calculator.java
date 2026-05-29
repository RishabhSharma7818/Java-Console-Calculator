import java.util.Scanner;

class InvalidInputException extends Exception{
	
	@Override
	public String toString() {
		return "Exception : " + getMessage();
	}
	
	@Override
	public String getMessage() {
		return "Invalid Input!";
	}
	
}

class CannotDivideByZeroException extends Exception{
	@Override
	public String toString() {
		return "Exception : " + getMessage();
	}
	
	@Override
	public String getMessage() {
		return "You cannot divide by zero!";
	}
}

class MaxInputException extends Exception{
	@Override
	public String toString() {
		return "Exception : " + getMessage();
	}
	
	@Override
	public String getMessage() {
		return "Cannot enter a number greater than 100000!";
	}
}

class MaxMultiplierReachedException extends Exception{
	@Override
	public String toString() {
		return "Exception : " + getMessage();
	}
	
	@Override
	public String getMessage() {
		return "Cannot reached multiplication beyond 1000000!";
	}
}

public class Calculator {
	
	public static double add(double a, double b) throws MaxInputException{
		
		if(a>100000 || b>100000) {
			throw new MaxInputException();
		}
		return a + b;
	}
	
	public static double sub(double a, double b) throws MaxInputException{
		if(a>100000 || b>100000) {
			throw new MaxInputException();
		}
		return a - b;
	}
	
	public static double multi(double a , double b) throws MaxInputException, MaxMultiplierReachedException {
		if(a>100000 || b>100000) {
			throw new MaxInputException();
		}
		if((a*b) > 1000000) {
			throw new MaxMultiplierReachedException();
		}
		
		return a * b;
	}
	
	public static double div(double a, double b) throws MaxInputException, CannotDivideByZeroException{
		
		if(a>100000 || b>100000) {
			throw new MaxInputException();
		}
		if(b==0) {
			throw new CannotDivideByZeroException();
		}
		return a / b;
	}

	
	public static void main(String[] args) throws InvalidInputException {

		Scanner sc  = new Scanner(System.in);
		System.out.println("==================Welcome to My Custom Calculator==================");
		
		while(true) {
			int choice;
			System.out.println("Choice 1 : Addition"
					+ "\nChoice 2 : Subtraction"
					+ "\nChoice 3 : Multiplication"
					+ "\nChoice 4 : Divide"
					+ "\nChoice 5 : Exit");
			System.out.println("Please enter your choice : ");
			choice = sc.nextInt();
			
			System.out.println("Please enter first number : ");
			if(!sc.hasNextDouble()) {
				throw new InvalidInputException();
			}
			int a = sc.nextInt();
			System.out.println("Please enter second number : ");
			if(!sc.hasNextDouble()) {
				throw new InvalidInputException();
			}
			int b = sc.nextInt();
			
			switch(choice){
			case 1 : 
				try {
					double result = add(a, b);
					System.out.println("Sum is : " + result + "\n");
				}
				catch(MaxInputException e) {
					System.out.println(e.toString());
				}
				break;
				
			case 2 :
				try {
					double result = sub(a, b);
					System.out.println("Difference is : " + result + "\n");
				}
				catch(MaxInputException e) {
					System.out.println(e.toString());
				}
				break;
				
			case 3 : 
				try {
					try {
						double result = multi(a, b);
						System.out.println("Mutiply is : " + result + "\n");
					}
					catch(MaxMultiplierReachedException e) {
						System.out.println(e.toString());
					}
				}
				catch(MaxInputException e) {
					System.out.println(e.toString());
				}
				break;
				
			case 4 : 
				try {
					try {
						double result = div(a, b);
						System.out.println("Division is : " + result + "\n");
					}
					catch(CannotDivideByZeroException e) {
						System.out.println(e.toString());
					}
				}
				catch(MaxInputException e) {
					System.out.println(e.toString());
				}
				break;
				
			case 5 :
				System.out.println("Thanks for using my calculator \nExiting...");
				sc.close();
				return;
			
			default :
				System.out.println("Invalid Choice!");
			}
			
		}
		
	}

}


