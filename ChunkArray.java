import java.util.Scanner;
import java.util.Arrays;
class ChunkArray{
	public static void main(String...args){
		Scanner sc = new Scanner(System.in);
		int[] arr = {1,2,3,4};
		IO.print("enter sub array size:");
		int n = sc.nextInt();
		arraychunk(arr,n);
	}
	public static void arraychunk(int[] a,int size){
		int flag = 0;
		int [][] chunk = new int[a.length][size];
		for(int i=0;i<a.length;i+=size){
			for(int j=0;j<size;j++){
				chunk[flag][j] = a[i+j];
			}
			flag++;
		}
		IO.println(Arrays.deepToString(chunk));
	}
}