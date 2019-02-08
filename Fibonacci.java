import java.util.Scanner;
public class Fibonacci {
	public static void main(String args[]) {
		System.out.print("enter the limit: ");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int a=0;
		int b=1;
		int i=0,temp;
		while(i<n) {
			System.out.print(a+"\t");
			temp=a+b;
			a=b;
			b=temp;
			i++;
		}
	}
}
