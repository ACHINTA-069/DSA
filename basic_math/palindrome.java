
import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter n:");
        int n= sc.nextInt();
        int original =n;
        int reverse=0;
        while(n>0){
            int degit =n%10;
            reverse=(reverse*10)+degit;
            n=n/10;
        }
        if(original==reverse){
            System.out.println("The numbre is palindrome......");
        }
        else{
            System.out.println("The number is not palindrome.....");
        }

    }
}
