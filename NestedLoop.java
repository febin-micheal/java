import java.util.Scanner;
public class NestedLoop {
	public static void main(String args[]) {
	System.out.print("enter row no: ");
	Scanner obj=new Scanner(System.in);
	int m=obj.nextInt();
	System.out.print("enter column no: ");
	int n=obj.nextInt();
	int a[][]=new int[m][n];
	int i,j;
	System.out.println("enter the elements");
	for(i=0;i<m;i++) {
		for(j=0;j<n;j++) {
			a[i][j]=obj.nextInt();
		}
	}
	for(i=0;i<m;i++) {
		for(j=0;j<n;j++) {
			System.out.print(a[i][j]+"\t");
		}
		System.out.print("\n");
	}
	}
}
