
import java.util.Scanner;

public class Reverse01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter n:");
        int n= sc.nextInt();
        int reverse= 0;
        while(n>0){
            int degit = n%10;
            reverse=(reverse*10)+degit;
            n=n/10;
        }
        System.out.print(reverse);
    }
}
