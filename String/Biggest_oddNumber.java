public class Biggest_oddNumber {
    public static void main(String[] args) {

        String str = "35427";

        // Start from the last digit
        for (int i = str.length() - 1; i >= 0; i--) {

            char ch = str.charAt(i);

            // Check if the digit is odd
            if ((ch - '0') % 2 != 0) {
                System.out.println(str.substring(0, i + 1));
                break;
            }
        }
    }
}