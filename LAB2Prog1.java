import java.util.Scanner;
class LAB2Prog1
{
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		IO.println("enter a number:");
		int x = s.nextInt();
		IO.println("enter a number:");
		int y = s.nextInt();
		double check = x/y;
		IO.println(check);
	}
}