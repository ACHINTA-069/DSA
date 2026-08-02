import java.util.Scanner;
public class BubbleSort{

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
            //print the  given array
            System.out.print("Given array:");
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();


            //Bubble sort
            for(int i=n-1;i>=0;i--){
                
                for(int j=0;j<=i-1;j++){
                    if(arr[j]>arr[j+1]){
                        int temp=arr[j+1];
                        arr[j+1]=arr[j];
                        arr[j]=temp;
                        
                    }
                }
            }

            //Print sorted array
            System.out.print("Sorted array:");
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }

    }
}
