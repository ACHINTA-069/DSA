
import java.util.Scanner;

public class LeftRotate {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter array size:");
        int n=sc.nextInt();
        int [] arr = new int[n];
        //array input
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //left rotate
        int temp=arr[0];
        for(int i=0;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        arr[n-1]=temp;
        //print the array
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
            
        }
    }

