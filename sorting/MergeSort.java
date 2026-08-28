package sorting;
import java.util.Scanner;

public class MergeSort {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter size of Array 1: ");
	        int n1 = sc.nextInt();

	        int arr1[] = new int[n1];

	        System.out.println("Enter elements of Array 1:");
	        for (int i = 0; i < n1; i++) {
	            arr1[i] = sc.nextInt();
	        }

	        System.out.print("Enter size of Array 2: ");
	        int n2 = sc.nextInt();

	        int arr2[] = new int[n2];

	        System.out.println("Enter elements of Array 2:");
	        for (int i = 0; i < n2; i++) {
	            arr2[i] = sc.nextInt();
	        }

	        int merged[] = new int[n1 + n2];

	        for (int i = 0; i < n1; i++) {
	            merged[i] = arr1[i];
	        }

	        for (int i = 0; i < n2; i++) {
	            merged[n1 + i] = arr2[i];
	        }

	        System.out.println("Merged Array:");
	        for (int i = 0; i < merged.length; i++) {
	            System.out.print(merged[i] + " ");
	        }

	        sc.close();
	    }
	}