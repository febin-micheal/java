import java.util.Scanner;
public class Pattern {
	public static void main(String args[]) {
		System.out.print("enter limit: ");
		Scanner obj=new Scanner(System.in);
		int n=obj.nextInt(),i,j;
		for(i=0;i<n;i++) {
			for(j=0;j<i;j++)
				System.out.print("*");
			System.out.print("\n");
		}
	}
}
