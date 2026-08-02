public class Minimum {

    public static int Solution(int[] a) {
        int n = a.length;
        int low = 0, high = n - 1;
        int min = Integer.MAX_VALUE;

        while (low <= high) {

            // If the current range is already sorted
            if (a[low] <= a[high]) {
                min = Math.min(min, a[low]);
                break;
            }

            int mid = low + (high - low) / 2;

            // Left half is sorted
            if (a[low] <= a[mid]) {
                min = Math.min(min, a[low]);
                low = mid + 1;
            } 
            // Right half is sorted
            else {
                min = Math.min(min, a[mid]);
                high = mid - 1;
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2, 3};

        int b = Solution(arr);

        System.out.println("The minimum value in the array is: " + b);
    }
}