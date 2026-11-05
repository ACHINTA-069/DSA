
import java.util.Stack;

public class NextGreaterElement02 {
    public int[] Solution(int []arr){
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        int []nge=new int[n];
        for(int i=2*n-1;i>=0;i--){
            while(!st.isEmpty()&& st.peek()<=arr[i%n]){
                st.pop();
            }
            if(i<n){
                if(st.isEmpty())
                    nge[i]=-1;
                else
                    nge[i]=st.peek();
            }

            st.push(arr[i%n]);
        }
        return nge;
    }
    public static void main(String[] args) {
        int []num={5,4,2,1,6};
        NextGreaterElement02 n1=new NextGreaterElement02();
        int []ans=n1.Solution(num);
        for(int x:ans){
            System.out.print(x+" ");
        }
        
    }
}
