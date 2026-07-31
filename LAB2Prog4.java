import java.util.Scanner;
class LAB2Prog4
{
	public static void main(String[] args)
	{
		int [] x = new int[5];
		Scanner s = new Scanner(System.in);
		for(int i=0;i<x.length;i++){
			x[i] = s.nextInt();
		}
		for(int v:x){
			IO.println(" the values are "+v);
		}
	}
}