package day4;

//Table of n till x iterations
public class While4 {
	
	public static void main(String[] args) {
		
		int n = 5;
		int x = 6;
		
		int i = 1;
		int table;
		
		while(i <= x) {
			table = n * i;
			
			System.out.println(n + " X " + i+" = "+table);
			
			i++;
		}
		
	}

}
