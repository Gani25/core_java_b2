package day4;


//WAP to print factorial of n
public class While3 {
	
	public static void main(String[] args) {
		
		int n = 5;
		int fact = 1;
		
		int i = n;
		
		while(i >= 1) {
			fact = fact * i;
			
			i--;
		}
		
		System.out.println("The factorial of "+n+" is "+ fact);
		
	}

}
