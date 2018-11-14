import java.util.Scanner;

public class fibonaci {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
			System.out.println("enter number");
	int n=sc.nextInt();
	fib(n);
	sc.close();
}
	
	public static void fib(int n) {
	int t1=0,t2=1,sum;
	for (int i=1;i<=n;i++) {
		System.out.print(t1+" ");
		sum=t1+t2;
		t1=t2;
		t2=sum;	
	}
	
}
	
}
