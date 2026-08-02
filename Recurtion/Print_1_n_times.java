import java.util.Scanner;

public class Print_1_n_times {

    static void PrintName(int n) {
         if (n == 0)
             return;

        System.out.println("1");

        PrintName(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Invalid input");
            System.out.println("Your number should be greater than 0.");
        } else {
            PrintName(n);
        }

        sc.close();
    }
}