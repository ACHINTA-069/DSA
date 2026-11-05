



public class StackUsingArray {
    int []arr;
    int top;
    int maxSize;

    public StackUsingArray(int size) {
        maxSize=size;
        arr=new int[maxSize];
        top=-1;
    }
    //push operation...............
    public void  Push(int data){
        if(top==maxSize-1){
            System.out.println("Stack Overflow.");
        }
        top++;
        arr[top]=data;
    }
    //pop operation..................
    public int  Pop(){
        if(top==-1){
            System.out.println("Stack Underflow.");
            return -1;
        }
    
        top=top-1;
        return top;

    }
    //top oeration...........
    public int Top(){
        if(top==-1){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[top];
    }
    //size...........
    public int size(){
        return top+1;
    }
    public void display(){
        if(top==-1){
            System.out.println("Empty Stack.");
        }
        for(int i=top;i>=0;i--){
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
        StackUsingArray s1=new StackUsingArray(10);
        s1.Push(1);
        s1.Push(2);
        s1.Push(3);
        s1.Push(4);
        s1.Push(5);
       System.out.println(s1.size());
        System.out.println(s1.Top());
        s1.display();

        System.out.println();
        s1.Pop();
        s1.Pop();
        System.out.println(s1.size());
        System.out.println(s1.Top());
        s1.display();

        System.out.println();
         s1.Pop();
        s1.Pop();
        s1.Pop();
        System.out.println(s1.size());
        System.out.println(s1.Top());
        s1.display();


    }
}
