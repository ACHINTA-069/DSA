import java.util.Scanner;
public class SelectionSort{

    public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            System.out.print("Enter the arr size:");
            int n=sc.nextInt();
            //Takeing array input
            System.out.println("Enter the array element :");
            int[]arr=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println();
            //print the array
            System.out.print("Given array:");
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
            //selection sort
            for(int i=0;i<n-1;i++){
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

            //Print sorted array
            System.out.print("Sorted array:");
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }

    }
}
