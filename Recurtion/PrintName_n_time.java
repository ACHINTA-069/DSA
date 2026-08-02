
import java.util.Scanner;

public class PrintName_n_time {
    static void PrintName(int n){
        if(n==0)
            return;
        System.out.println("Achinta");
        PrintName(n-1);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter n:");
        int n= sc.nextInt();
        PrintName(n);
    }
}
