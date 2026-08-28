package SubArray;
import java.util.Scanner;
public class AllPossible {
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		int n = sc.nextInt();
		int[]arr = new int[n];
		System.out.println("Enter the Eleements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Sub-array Elements :");
		for(int i=0;i<n;i++) {
			for(int j=i;j<n;j++) {
				for(int k=i;k<=j;k++) {
					System.out.println(arr[k]+" ");
				}
				System.out.println();
			}
		}
		 
		sc.close();
	}

}
