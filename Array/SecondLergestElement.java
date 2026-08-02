import java.util.Scanner;

public class SecondLergestElement {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Array size:");
        int n=sc.nextInt();
        int []arr=new int[n];
        //Enter array element....
        System.out.println("Enter the array elenents:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        //sorting the array....
        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
                int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
        }
        //print
        System.out.println("Sorted array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        //second largest element
        System.out.println();
        for(int i=n-2;i>=0;i--){
            if(arr[i]!=arr[n-1]){
                System.out.print("The 2nd largest element is:"+arr[i]);
                break;
            }
    }
}
}