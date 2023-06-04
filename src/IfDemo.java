import java.util.Scanner;

/* if else, if else if*/
public class IfDemo {

	public static void main(String[] args) {
		
		int marks;
		System.out.println("enter the marks (0-100)");
		Scanner sc = new Scanner(System.in);
		marks = sc.nextInt();
		
		if(marks >= 90) {
			System.out.println("grade A");
		}
		else if(marks >=80) {
			System.out.println("grade B");
		}
		else if(marks >=70) {
			System.out.println("grade c");
		}
		else if(marks >=60) {
			System.out.println("grade D");
			}
		else if(marks >= 50) {
			System.out.println("grade C");
		}
		else {
			System.out.println("grade E");
		}
		
		//2.
		
	}

}
