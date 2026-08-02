




//for 3 degit amstrong number...................

import java.util.Scanner;

public class Amstrong {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter n:");
        int n= sc.nextInt();
        int original =n;
        int sum=0;
        while(n>0){
            int degit =n%10;
            sum=sum+(degit*degit*degit);
            n=n/10;
        }
        if(original==sum){
            System.out.println("It is a Amstrong number......");
        }
        else{
            System.out.println("It is not a Amstrong number.....");
        }

    }
}
