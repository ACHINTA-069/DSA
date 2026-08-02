


public class BinarySearch{
    public static int Solution(int[]arr ,int target){
        int n=arr.length;
        int low=0,high=n-1;
       while(low<=high){
         int mid=(high+low)/2;
        if(target==arr[mid])
            return mid;
        else if(target>arr[mid])
            low=mid+1;
        else 
            high=mid-1;
       }
       return -1;
    }
    public static void main(String[]args){
        int []a={3,4,6,7,9,12,16,17};
        int target=18;
        int ans=Solution(a, target);
        if(ans==-1)
            System.out.print("the target is not preasent");
        else
            System.out.print("the target is preasent at index no:"+ans);

    }
}