
import java.util.Scanner;

public class Striver_10 {
    static void pattern01(int n) {
        for(int i=0;i<n;i++){
             for(int j=0;j<=i;j++){
                System.out.print("*");
             }
             System.out.println();
        }
    }
    static void pattern02(int n){
        for(int i=n-1;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter n:");
        int n=sc.nextInt();
        pattern01(n);
        pattern02(n);
    }
}
