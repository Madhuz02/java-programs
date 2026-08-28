package SubArray;
import java.util.Scanner;
public class SumOfEverySubarray {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		int n = sc.nextInt();
		int[]arr = new int[n];
		System.out.println("Enter the Elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Sum of every sub array:");
		for(int i=0;i<n;i++) {
			int sum=0;
			for(int j=i;j<n;j)
		}

}
