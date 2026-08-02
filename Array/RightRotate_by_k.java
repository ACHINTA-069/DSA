
import java.util.Scanner;

public class RightRotate_by_k {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter array size:");
        int n=sc.nextInt();
        //array input
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter k:");
        int k=sc.nextInt();

        //takeing the temp array
        int []temp=new int[k];
        for(int i=0;i<k;i++){
            temp[i]=arr[i];
        }

        //left shift the remaining array element
        for(int i=k;i<n;i++){
            arr[i-k]=arr[i];
        }
        //put back temp
        int j=0;
        for(int i=n-k;i<n;i++){
            arr[i]=temp[j];
            j++;
        }
        //print the final array
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

