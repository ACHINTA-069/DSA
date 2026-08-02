
import java.util.Scanner;

public class pattern11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n:");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            int start=i%2;
            if(start==0){
                start=0;
            }
            else{
                start=1;
            }
            for(int j=1;j<=i;j++){
                System.out.print(start);
                start=1-start;
            }
            System.out.println();
        }
    }
}
