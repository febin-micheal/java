import java.util.Scanner;
public class Sum {
	public static void main(String args[]) {
		System.out.print("enter limit: ");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int i,sum=0;
		for(i=0;i<n;i++) {
			sum=sum+i;
		}
		System.out.println("Sum of "+n+" numbers = "+sum);
		in.close();
	}
}
