import java.util.Scanner;

/* jump statement - break,continue;
 * 
 *15 10
 *36 30
 *78 70
 *98 90
 *90 90 
 * 
 * */
public class LoopControlStatements {

	public static void main(String[] args) {
		
		//example 1 - For a given n, find the nearest number divisible by 10 that is less than or equal to n.
		Scanner getn = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = getn.nextInt();		
		//while(n>=0) { 
			while(true) { 	
			if(n%10==0) {
				System.out.println(n);
				break;
			}
			n--;
	}
			
		//example-2 Find the sum of all input numbers entered
		
//			double m,sum = 0.0;
//			Scanner mscan = new Scanner(System.in);
//			System.out.println("Enter the numbers to sum and enter the negative number to stop");		
//			while(true) {
//				m  = mscan.nextDouble();
//				if(m<0.0){
//					break;
//					}
//				sum = sum + m;
//			}
//			System.out.println(sum);
			
		//example-3 Labels
//			int n =5;
//			OuterLoop:
//			for (int i =1; i<=n;i++) {
//				InnerLoop:
//				for(int j =1; j<=n; j++) {
//					System.out.println("*");
//					if(i ==3 && j==3) {
//						break InnerLoop; //Labeled break
//					}
//				} 
//				System.out.println("\n");
//			}
		//example-3 continue
			
		int h =1;
		for(;h<=10;h++) {
			
			if(h==7)
				continue; // it will not show 7th iteration output mean it'll neglect 7
			System.out.println(h);
		}
	}

}
