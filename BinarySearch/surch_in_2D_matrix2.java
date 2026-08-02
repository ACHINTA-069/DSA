//UITHOUT BINARY SEARCH......................................................................
public class surch_in_2D_matrix2 {

    public static int Solution(int [][]arr,int target){
        int noOfRow=arr.length;
        int noOfColam=arr[0].length;
        int ans=-1;
        for(int i=0;i<noOfRow;i++){
            //for(int j=0;j<a.length;j++){
                if(arr[i][0]<=target && arr[i][noOfColam-1]>=target){
                    int low=0;
                    int high=noOfColam-1;
                    while(low<=high){
                        int mid=low+(high-low)/2;
                        if(arr[i][mid]>=target){
                            ans=arr[i][mid];
                            high=mid-1;
                        }
                        else 
                            low=mid+1;
                    }
                }
            }
            return ans;
    }

    public static void main(String[] args) {
        int [][]a={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };
        int target=10;
        int c=Solution(a, target);
        if(c==-1){
            System.out.println("Targrt is  ont tpresent");
        }
        else
            System.out.println("Targrt is present");

    }

}

