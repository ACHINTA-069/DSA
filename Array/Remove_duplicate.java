import java.util.Scanner;

public class Remove_duplicate {
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
            if(min!=i){
                int temp=arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
        }
        //print the sorted array
        System.out.print("The sorted array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        int i=0;
        for(int j=1;j<n;j++){
            if(arr[i]!=arr[j]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        //Print the array after removing the duplicate
        System.out.println();
        System.out.print("The array after removing the duplicate:");
        for(int k=0;k<=i;k++){
            System.out.print(arr[k]+" ");
        }
        System.out.println();
        System.out.print("Num of array element:"+(i+1));
    }
}
