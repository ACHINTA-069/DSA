
import java.util.Stack;

public class NextGreaterElement {
    public int[] Solution(int[]arr){
        int n=arr.length;
        int[]nge=new int[n];
        Stack<Integer> st=new Stack<>();

        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i]){
                st.pop();
            }

            if(st.isEmpty())
                nge[i]=-1;

            else
                nge[i]=st.peek();

            st.push(arr[i]);
        }
        return nge;
    }
    public static void main(String[] args) {
        int[]num={2,3,1,4,5};
        NextGreaterElement n1=new NextGreaterElement();
        int []ans =n1.Solution(num);
        for(int x:ans){
            System.out.print(x+" ");
        }
    }
}
