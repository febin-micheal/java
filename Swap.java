import java.util.Scanner;
class Swap
{
	public static void main(String[] args) {
		System.out.println("enter first number");
		Scanner input=new Scanner(System.in);
		int a=input.nextInt();
		System.out.println("enter second number");
		int b=input.nextInt();
		System.out.println("before swapping : \na="+a+" \nb="+b); 
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("after swapping : \na="+a+" \nb="+b); 

	}
}