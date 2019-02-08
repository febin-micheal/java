import java.util.Scanner;
public class Array {
	public static void main(String args[]) {
		System.out.print("enter size of array: ");
		Scanner n=new Scanner(System.in);
		int size=n.nextInt();
		int a[]=new int[size];
		int i;
		System.out.println("enter the elements");
		for(i=0;i<size;i++) {
			a[i]=n.nextInt();
		}
		for(i=0;i<size;i++) {
			if(a[i]%2==0)
				System.out.println(+a[i]+" - even");
		}
		n.close();
	}
}
