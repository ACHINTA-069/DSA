
import java.util.Stack;

public class MinStack {
    Stack<Integer> stack=new Stack<>();
    Stack<Integer> minstack=new Stack<>();
    //push..............................
    public void push(int x){
        if(minstack.isEmpty()){
            stack.push(x);
            minstack.push(x);
        }
        else{
            stack.push(x);
            if(x<minstack.peek()){
                minstack.push(x);
            }
        }
    }

    //pop...............................
    public void  pop(){
        if(stack.isEmpty()){
            System.out.println("Stack is empty......");
            return;
        }
        int removed= stack.pop();
        if(removed==minstack.peek()){
            minstack.pop();
        }
    }
    // get min..............................
    public int getMin(){
        if(minstack.isEmpty()){
            System.out.println("Stack is empty.....");
            return -1;
        }
        return minstack.peek();
    } 
    //top element...............................
    public int top(){
        if(stack.isEmpty()){
            System.out.println("Stack is empty...");
            return -1;
        }
        return stack.peek();
    }
    public static void main(String[] args) {
        MinStack s=new MinStack();
        s.push(12);
        s.push(15);
        s.push(10);
        System.out.println(s.getMin());
        s.pop();
        System.out.println(s.top());
        System.out.println(s.getMin());
        // System.out.println("----------------------------");
        // s.pop();
        // System.out.println(s.top());
        // System.out.println(s.getMin());
        // System.out.println("----------------------------");
        // s.pop();
        // System.out.println(s.top());
        // System.out.println(s.getMin());
    }
}
