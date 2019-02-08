import java.util.Scanner;
public class TypeConvert {
	public static void main(String args[]) {
		//automatic typecast
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		float b=a;
		System.out.println("converted number: "+b);
		//expicit typecast
		double d=100.4;
		int k=(int) d;
		System.out.println("converted number: "+k);
	}
}
