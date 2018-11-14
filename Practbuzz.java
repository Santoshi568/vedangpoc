import java.util.Scanner;


public class Practbuzz {

	public static void buzz(int n) {
//for(int i=1;i<=n;i++) {
			if(n% 15==0 ) {
				System.out.println("fizz buzz");
			}
			else if(n%5==0){
				System.out.println("fizz");	
			}
			else if(n%3==0) {
				System.out.println("buzz");
			}
			else {
				System.out.println(n+"   ");
			}
		
		}
		

	
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number :");
		int n=sc.nextInt();
		 buzz(n);
			sc.close(); 
	}
	

	
}
