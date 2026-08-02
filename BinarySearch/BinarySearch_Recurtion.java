

public class BinarySearch_Recurtion {
    public static int Solution(int []arr,int low,int high,int target){
        if(low>high)
            return -1;
        int mid=(high+low)/2;
        if(target==arr[mid])
            return mid;
        else if(target>arr[mid])
            return Solution(arr, mid+1, high, target);
        else 
            return Solution(arr, low, mid-1, target);

    }
    public static void main(String[] args) {
        int[] a ={3,4,6,7,9,12,16,17};
        int target=16;
        int low=0;
        int n=a.length;
        int high=n-1;
        int ans=Solution(a, low, high, target);
       if(ans==-1)
            System.out.print("the target is not preasent");
        else
            System.out.print("the target is preasent at index no:"+ans);

        }

    }

