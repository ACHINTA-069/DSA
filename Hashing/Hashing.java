
import java.util.Scanner;


public class Hashing {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter n:");
        int n =sc.nextInt();
        int [] arr= new int[n];
        //Enter array alements
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();
        }
        //print the array
        //System.out.print("arr[");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
        //System.out.println("]");

        //Hashing
        int[]Hash=new int[12];
        for(int i=0;i<n;i++){
            Hash[arr[i]]++;
        }

        //output  questions enter
        System.out.println("Enter no of quastions:");
        int q=sc.nextInt();

        while(q>0){
            System.out.println("Enter the number you want to check:");
            int num=sc.nextInt();

            System.out.println(Hash[num]);
            q--;
        }
    }
    
}