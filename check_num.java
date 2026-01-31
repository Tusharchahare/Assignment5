5) Write a program to check if a number is positive, negative, or zero . 



import java.util.Scanner;
public class check_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter a num");
			int num = sc.nextInt();
			
			if (num>0) {
				System.out.println("posotive");
			} else if (num<0){
				System.out.println("negative");
			} else {
				System.out.println("zero");
			}
	}

}
