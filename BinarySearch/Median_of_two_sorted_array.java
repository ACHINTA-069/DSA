import java.util.Scanner;

public class Median_of_two_sorted_array {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Enter first array
        System.out.print("Enter the number of array elements 1: ");
        int n1 = sc.nextInt();

        int[] arr1 = new int[n1];

        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }

        // Enter second array
        System.out.print("Enter the number of array elements 2: ");
        int n2 = sc.nextInt();

        int[] arr2 = new int[n2];

        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }

        // Total size
        int n = n1 + n2;

        // Create merged array
        int[] arr = new int[n];

        // Copy first array
        for (int i = 0; i < n1; i++) {
            arr[i] = arr1[i];
        }

        // Copy second array
        for (int i = n1; i < n; i++) {
            arr[i] = arr2[i - n1];
        }

        // Selection Sort
        for (int i = 0; i < n - 1; i++) {

            int min = i;

            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            // Swap
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        // Print sorted array
        System.out.print("Sorted array: ");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        // Find median
        if (n % 2 == 1) {
            System.out.println("\nMedian = " + arr[n / 2]);
        } else {
            double median = (arr[n / 2 - 1] + arr[n / 2]) / 2.0;
            System.out.println("\nMedian = " + median);
        }

        sc.close();
    }
}