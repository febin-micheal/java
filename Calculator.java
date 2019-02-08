import java.util.Scanner;
public class Calculator {
	public static void main(String args[])
	{
		System.out.print("enter the numbers: ");
		Scanner input1=new Scanner(System.in);
		Scanner input2=new Scanner(System.in);
		int a=input1.nextInt();
		int b=input2.nextInt();
		System.out.print("1.addition\n2.subtraction\n3.multiplication\n4.division");
		System.out.print("\nenter the operation: ");
		Scanner input3=new Scanner(System.in);
		int c=input3.nextInt();
		float res=0;
		switch(c)
		{
			case 1:	res=a+b;	break;
			case 2:	res=a-b;	break;
			case 3:	res=a*b;	break;
			//explicit typecast
			case 4:	res=(float) a/b;	break;
			default:	System.out.println("invalid choice");
		}
		System.out.println("result = "+res);
		input1.close();
		input2.close();
		input3.close();
	}
}
