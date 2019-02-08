import java.util.Scanner;
public class Even {
	public static void main(String[] args)
	{
		System.out.println("enter a number: ");
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		if(num%2==0)
		{
			System.out.println("even number");
			if(num==2)
				System.out.println("number is "+num);
			if(num==4)
				System.out.println("number is "+num);
		}
		else
			System.out.println(num+" is a odd number");
	input.close();
	}
}
