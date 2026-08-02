import java.util.Scanner;

public class isAlradySorted {
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
        int didSwap=0;

        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                    
                }
            }
            if(min!=i){
                    didSwap++;
                int temp= arr[i];
                arr[i]=arr[min];
                arr[min]=temp;
            }
        }
        //sorted array
        System.out.println("Sorted array:");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("The array is alrady sorted:");
        if(didSwap==0){
            System.out.print("True");
        }
        else{
            System.out.print("False");
        }

    }
}
