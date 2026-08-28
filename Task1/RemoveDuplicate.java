package Task1;
import java.util.Scanner;
public class RemoveDuplicate {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter size of first array: ");
	        int n1 = sc.nextInt();
	        int[] arr1 = new int[n1];

	        System.out.println("Enter first array:");
	        for (int i = 0; i < n1; i++) {
	            arr1[i] = sc.nextInt();
	        }

	        System.out.print("Enter size of second array: ");
	        int n2 = sc.nextInt();
	        int[] arr2 = new int[n2];

	        System.out.println("Enter second array:");
	        for (int i = 0; i < n2; i++) {
	            arr2[i] = sc.nextInt();
	        }

	        int[] result = new int[n1 + n2];
	        int i = 0, j = 0, k = 0;

	        while (i < n1 && j < n2) {
	            int value;

	            if (arr1[i] < arr2[j]) {
	                value = arr1[i++];
	            } else if (arr1[i] > arr2[j]) {
	                value = arr2[j++];
	            } else {
	                value = arr1[i];
	                i++;
	                j++;
	            }

	            if (k == 0 || result[k - 1] != value) {
	                result[k++] = value;
	            }
	        }

	        while (i < n1) {
	            if (k == 0 || result[k - 1] != arr1[i]) {
	                result[k++] = arr1[i];
	            }
	            i++;
	        }

	        while (j < n2) {
	            if (k == 0 || result[k - 1] != arr2[j]) {
	                result[k++] = arr2[j];
	            }
	            j++;
	        }

	        System.out.print("Array after removing duplicates: ");
	        for (int x = 0; x < k; x++) {
	            System.out.print(result[x] + " ");
	        }

	        sc.close();
	    }
	}

