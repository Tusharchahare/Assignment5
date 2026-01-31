4) Write a program to find the largest of three numbers. 



import java.util.Scanner;

public class LarThreeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter a 1st number");
		int a = sc.nextInt();
		
		System.out.println("Enter a 2nd number");
		int b = sc.nextInt();
		
		System.out.println("Enter a 3rd number");
		 int c = sc.nextInt();
		 
		 int max = a ;
		 if (max < b)
			 max = b;
		 if (max < c)
			 max = c;
			 
		 System.out.println("maximum num is : " +  max);
		 
		 
		
		
		
	}

}
