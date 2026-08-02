
import java.util.Scanner;

public class Amstrong_01 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter n:");
        int n=sc.nextInt();
        int realNum=n;
        int original=n;

        //length of the num checking.....
        int length=0;
        while(n>0){
            int degit =n%10;
            length=length+1;
            n=n/10;
        }
        
        //Amstrong number checking.....
        int sum=0;
        while(original>0){
            int degit=original%10;
            sum+=(int)Math.pow(degit,length);
            original=original/10;
        }
        if(realNum==sum){
            System.out.println("Palindrome number");
        }
        else{
            System.out.println(" Not Palindrome number");
        }
    }
}
