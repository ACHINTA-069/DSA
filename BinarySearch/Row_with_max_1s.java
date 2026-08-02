public class Row_with_max_1s {
    //Impilement lower bound for serching first 1....................
    public static int findFirstOne(int[]arr,int target){
        int low=0;
        int n=arr.length;
        int high=n-1;
        int ans=0;
        while(low<=high){
            int mid=low+(high- low)/2;

            if(arr[mid]>=target){
                high=mid-1;
                ans=mid;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    //count number of Ones...............................
    public static int numOfOne(int[][]matrix){
        int maxOne=0;
        int maxRow=-1;
        for(int i=0;i<matrix.length;i++){
            //first one
            int firstOne=findFirstOne(matrix[i], 1);
            //no of 1
            int noOfOne=matrix[i].length-firstOne;
            if(noOfOne>maxOne){
                maxOne=noOfOne;
                maxRow=i;
            }
        }
        return maxRow;
    }
    public static void main(String[] args) {
        int [][]a={
            {0,0,0,1},
            {0,0,1,1},
            {0,1,1,1},
            {1,1,1,1}
        };
        int b=numOfOne(a);
        System.out.print("The row with max number of one is:"+b);
    }
}
