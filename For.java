import java.util.Scanner;
public class For {
	public static void main(String args[]) {
		System.out.print("enter the limit: ");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int i;
		for(i=1;i<n;i++) {
			if(i%2==0)
				System.out.println(i+" -even");
			else
				System.out.println(i+" -odd");				
		}
		in.close();
	}
}
