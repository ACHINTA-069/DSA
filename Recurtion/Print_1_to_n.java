
import java.util.Scanner;

public class Print_1_to_n {
    static void PrintNum(int i,int n){
        if(i>n)
            return;
        System.out.println(i);
        PrintNum(i+1, n);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter n:");
        int n =sc.nextInt();
        if(n<=0){
            System.out.println("Invalid Input");
        }
        else{
            PrintNum(1,n);
        }
    }
}
