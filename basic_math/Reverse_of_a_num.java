//for the number which is not start with 0;
import java.util.Scanner;

public class Reverse_of_a_num {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter n:");
        int n= sc.nextInt();
        while(n>0){
            int reverse = n%10;
            
            System.out.print(reverse);
            
            n=n/10;
        }
    }
}
