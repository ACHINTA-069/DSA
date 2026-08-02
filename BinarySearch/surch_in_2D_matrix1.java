//UITHOUT BINARY SEARCH......................................................................
public class surch_in_2D_matrix1 {

    public static void main(String[] args) {
        int [][]a={
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };
        int target=13;
        boolean ans=false;
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[i][j]==target){
                    ans=true;
                    break;
                }
            }
        }
        if(ans==true)
            System.out.print("The target number is present");
        else 
            System.out.print("The target number is  not present");

    }
}
