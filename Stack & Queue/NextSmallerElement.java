
import java.util.Stack;

public class NextSmallerElement {
    public int [] Solution(int []arr){
        Stack<Integer> st= new Stack<>();
        int n=arr.length;
        int []nse=new int[n];
        for(int i=n-1;i>=0;i++){
            while(!st.isEmpty()&&st.peek()>=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nse[i]=-1;
            }
            else{
                nse[i]=st.peek();
            }
            st.push(arr[i]);
        }
        return nse;
    }
    public static void main(String[] args) {
        int []num={5,4,2,1,6};
        NextSmallerElement s1=new NextSmallerElement();
        int []ans=s1.Solution(num);
        for(int x:ans){
            System.out.print(x+" ");
        }
    }
}
