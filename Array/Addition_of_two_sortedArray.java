import java.util.Scanner;
public class Addition_of_two_sortedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter 1st array size:");
        int n1=sc.nextInt();
        int[]arr1=new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }

        System.out.print("Enter 2nd array size:");
        int n2=sc.nextInt();
        int[]arr2=new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }

        int[]Addition=new int[n1+n2];
        for(int i=0;i<n1;i++){
            Addition[i]=arr1[i];
        }
        
        for(int i=0;i<n2;i++){
            Addition[n1+i]=arr2[i];
        }
        //print the addition array
        for(int i=0;i<(n1+n2);i++){
            System.out.print(Addition[i] +" ");
        }
    }
}
