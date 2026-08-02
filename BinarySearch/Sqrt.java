
import java.util.Scanner;

public class Sqrt {
    public static int Solution(int n){
        int low=1,high=n,ans=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(mid*mid<=n){
                ans=mid;
                low=mid+1;
            }
            else{ 
                high=mid-1;
            }

        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.print("Give n:");
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int b=Solution(n);
        System.out.print(b);
    }
}
