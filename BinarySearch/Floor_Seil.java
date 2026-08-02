public class Floor_Seil {
    public static void Solution(int[]arr,int target){
        int n=arr.length;
        int Floor=-1,Seil=-1;

        //Floor functiojn
        int low=0,high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]<=target){
                Floor=arr[mid];
                low=mid+1;
            }
            else 
                high=mid-1;
        }

        //Seil function
        low=0; //rest low & high value
        high=n-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]>=target){
                Seil=arr[mid];
                high=mid-1;
            }
            else 
                low=mid+1;
        }
        System.out.print("The floor & Seil:["+Floor+","+Seil+"]");

    }
    public static void main(String[] args) {
        int []a={1,2,3,5,6,7,8};
        int target=5;
        Solution(a, target);
    }
}
