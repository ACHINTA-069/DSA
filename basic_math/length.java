
import java.util.Scanner;

public class length {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter n:");
        int n= sc.nextInt();
        int length=0;

        while(n>0){
          //  int count = n%10;
            length=length+1;
            n=n/10;
        }
        System.out.println("The length of this number is:"+length);
    }
}
