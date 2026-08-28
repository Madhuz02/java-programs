package Task1;
import java.util.Scanner;
public class FirstDuplicate {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the size: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];

	        System.out.println("Enter the elements:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        boolean found = false;
	        for (int i = 0; i < n; i++) {
	            for (int j = i + 1; j < n; j++) {
	                if (arr[i] == arr[j]) {
	                    System.out.println("First duplicate element: " + arr[i]);
	                    found = true;
	                    break;
	                }
	            }
	            if (found) {
	                break;
	            }
	        }

	        if (!found) {
	            System.out.println("No duplicate element found");
	        }

	        sc.close();
	    }
	}

