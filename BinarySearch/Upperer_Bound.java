public class Upperer_Bound{
    public static int Solution(int []arr,int n,int target){
        int low=0,high=n-1;
        int ans=n;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>target){
                ans=mid;
                high=mid-1;
            }
            else
                low=mid+1;
        }
        return ans;
    }

    public static void main(String[]args){
        int []a={1,2,3,3,5,8,8,10,10,11};
        int n=a.length;
        int target=1;
        int b=Solution(a, n, target);
        System.out.print("The upper bound is:"+b);
    }
}