import java.util.Scanner;

/*Given an integer value, return a new integer according to the rules below:

-Split the number into groups of two digit numbers. If the number has an odd number of digits, return -1.
-For each group of two digit numbers, concatenate the last digit to a new string the same number of times
 as the value of the first digit.
-Return the result as an integer.
 */

public class Main {


	
	public static void main(String[]args) {
		//Read input
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter integer: ");
		String x = sc.next();
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(x);
		
		if(x.length()%2 != 0)
			System.out.println(-1);
		
		else {
			int limit = x.length()/2;
			int count = limit;
			
			for(int i=1; i<=limit; i++) {
					sb.insert(i*2, " ");
					
			
				
				System.out.println(sb);
			}
			
			//Parse input
		}
		

		
	}
	
}
