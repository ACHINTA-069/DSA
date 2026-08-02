import java.util.Scanner;

public class Striver_09 {
    static void  pattern01(int n){
        for(int i=0;i<n;i++){
            //space.....
            for( int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            //Star.......
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
    static void pattern02(int n) {
        for(int i=0;i<n;i++){
            //space.....
            for( int j=0;j<i;j++){
                System.out.print(" ");
            }
            //Star.......
            for(int j=0;j<2*n-(2*i+1);j++){
                System.out.print("*");
            }
            
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter n:");
        int n =sc.nextInt();
        pattern01(n);
        pattern02(n);
}
}
