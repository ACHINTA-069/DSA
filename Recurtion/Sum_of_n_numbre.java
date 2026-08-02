
import java.util.Scanner;

public class Sum_of_n_numbre {
    static int sum(int n) {
        if(n==0)
            return 0;
        return n+sum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        System.out.println("The sum is:"+sum(n));
    }
}
