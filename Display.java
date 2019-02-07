import java.util.Scanner;

class Display
{
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner input=new Scanner(System.in);
		int d=input.nextInt();
		System.out.println("You have entered : "+d);
	}
}