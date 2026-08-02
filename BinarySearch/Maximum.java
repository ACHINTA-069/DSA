public class Maximum {

    public static int Solution(int[] a) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {

            // If the current portion is sorted
            if (a[low] <= a[high]) {
                return a[high];
            }

            int mid = low + (high - low) / 2;

            // Left part is sorted
            if (a[low] <= a[mid]) {
                low = mid + 1;
            }

            // Right part is sorted
            else {
                high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        int[] arr = {4, 5, 6, 0, 1, 2, 3};

        int b = Solution(arr);

        System.out.println("The maximum value in the array is: " + b);
    }
}