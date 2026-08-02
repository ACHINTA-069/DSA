
import java.util.Scanner;

public class Print_N_to_1 {
    static void PrintNUm(int n) {
        if(n<=0)
            return;
        System.out.println(n);
        PrintNUm(n-1);
        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter n:");
        int n= sc.nextInt();
        PrintNUm(n);
    }
}
