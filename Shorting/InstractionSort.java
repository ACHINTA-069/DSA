import java.util.Scanner;
public class InstractionSort{

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


            //Instraction sort
            for(int i=0;i<=n-1;i++){
                int j=i;
                while(j>0 && arr[j-1]>arr[j]){
                    //swap........
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    j--;
                }
                    
                }

            //Print sorted array
            System.out.print("Sorted array:");
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }

    }
}
