import java.util.Scanner;
public class Calculator {
	public static double add(double a,double b) {
		return a+b;
	}
	public static double sub(double a,double b) {
		return a-b;
	}
	public static double mul(double a,double b) {
		return a*b;
	}
	public static double div(double a,double b) {
		if(b==0) {
			System.out.println("Error: cannot divide the value with zero");
			return 0;
		}
		return a/b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method 
		Scanner s=new Scanner(System.in);
		boolean running= true;
		while(running){
			System.out.println("-----Calculator Menu-----");
			System.out.println("1.Addition");
			System.out.println("2.Subtraction");
			System.out.println("3.Multiplay");
			System.out.println("4.Division");
			System.out.println("5.Exit");
			System.out.println("Choose any operation from(1-5): ");
			int choice=s.nextInt();
			if(choice==5) {
				running=false;
				System.out.println("Exiting Calculator!!");
				continue;
			}
			System.out.print("Enter 1st number: ");
			double num1=s.nextDouble();
			System.out.print("Enter 2nd number: ");
			double num2=s.nextDouble();
			double result;
			switch(choice) {
			case 1:
				result=add(num1,num2);
			    System.out.println("Result: "+result);
			    break;
			case 2:
				result=sub(num1,num2);
				System.out.println("Result: "+result);
				break;
			case 3:
				result=mul(num1,num2);
				System.out.println("Result: "+result);
				break;
			case 4:
				result=div(num1,num2);
				System.out.println("Result: "+result);
				break;
			default:
				System.out.println("Invalid Choice!!,Try Again..");				
			}	
		}
s.close();
	}

}
