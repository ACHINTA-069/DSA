
import java.util.Scanner;

class  Striver_02 {
    public static void main(String[] args) {
    
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter the n:");
        int n=sc.nextInt();
        // System.out.println("Enter row:");
        // int i=sc.nextInt();
        // System.out.println("Enter collam:");
        // int j=sc.nextInt();

        for (int i = 0; i <n; i++) {
             for(int j=0;j<n;j++){
                System.err.print("*");
             }
             System.out.print("\n");
         }

    }
}
