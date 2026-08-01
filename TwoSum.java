import java.util.Scanner;
import java.util.Arrays;
class TwoSum{
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		IO.print("enter size of array:");
		int size = s.nextInt();
		int [] nums = new int[size];
		for(int i=0;i<size;i++){

			nums[i] = s.nextInt();
		}
		IO.print("enter target:");
		int target = s.nextInt();
		sumoftwo(nums,target); 
	}
	public static void sumoftwo(int[] num,int ta){
		int[] rarr = new int[2];
		for( int i=0; i<num.length-1;i++){
            for(int j=i+1;j<num.length;j++){
                if (ta == num[i] + num[j]){
                    rarr[0]=i;
                    rarr[1]=j;
                }
            }
        }
        IO.println(Arrays.toString(rarr));
	}	
}