import java.util.Scanner;
class Sum{

	public static void main(String [] args){

		Scanner sc = new Scanner(System.in);
		int a;		
		int b;		
		int sum; 
			                   
		System.out.print("Enter The First value:-");
		a=sc.nextInt();
		System.out.print("Enter The Second value:-");
		b=sc.nextInt();	
		sum=a+b;	
		System.out.print("Sum of Two Numbers= "+sum);  
	}
}
