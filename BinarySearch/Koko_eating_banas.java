public class Koko_eating_banas {
    public static int Solution(int[]arr,int h){
        int low=1;
        int high=0;
        //calculate high
        for(int i=0;i<arr.length;i++){
            high=Math.max(arr[i],high);
        }
        //calculate time
        int ans=high;
        while(low<=high){
            int mid=low+(high-low)/2;
            //calculate hours
            int hours=0;
            for(int i=1;i<arr.length;i++){
                hours +=(arr[i]+mid-1)/mid;
            }
            if(hours<=h){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int []a={3,6,7,11};
        int h=8;
        int b=Solution(a, h);
        System.out.print(b);  
    }
}
