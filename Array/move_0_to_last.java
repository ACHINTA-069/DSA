
import java.util.Scanner;

public class  move_0_to_last{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter array size:");
        int n=sc.nextInt();
        int [] arr = new int[n];
        //array input
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //find the first 0
        int j=-11;

        for(int i=0;i<n;i++){
            if(arr[i]==0){
                j=i;
                break;
            }
        }

        //swap with non 0
        for(int i=j+1;i<n;i++){
            if(arr[i]!=0){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                j++;
            }
        }
        //final array
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}