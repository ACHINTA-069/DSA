public class QueueUsingArray {
    int start;
    int end;
    int maxSize;
    int currSize;
    int []arr;

    public QueueUsingArray(int size) {
        maxSize=size;
        arr=new int[maxSize];
        start=-1;
        end=-1;
        currSize=0;
    }
    //push operation.........
    public void push(int data){
        if(currSize==maxSize){
            System.out.println("Queue Overflow");
        }
        if(currSize==0){
            start=0;
            end=0;
        }
        else{
            end=(end +1)% maxSize;
        }
        arr[end]=data;
        currSize++;
    }
    //pop operation......
    public void pop(){
        if(currSize==0){
            System.out.println("Queue Underflow.");
        }

        if(currSize==1){
            start=-1;
            end =-1;
        }
        else{
            start=(start+1)%maxSize;
        }
        currSize--;

    }
    //Top ............
    public int top(){
        if(currSize==0){
            
            System.out.println("Stack is empty.");
            return -1;
        }
        return arr[start];
    }
    //size
    public int size(){
        return currSize;
    }
    //display..............
    public void display(){
        if(currSize==0){
            System.out.println("Queue is empty");
        }
        for(int i=0;i<maxSize;i++){
            int index=(i+start)%maxSize;
            System.out.print(arr[index]+" ");
        }
    }
    
    public static void main(String[] args) {
        QueueUsingArray q1=new QueueUsingArray(5);
        q1.push(1);
        q1.push(2);
        q1.push(3);
        q1.push(4);
        q1.push(5);
        System.out.println(q1.top());
        System.out.println(q1.size());
        q1.display();

        System.out.println();
        q1.pop();
        q1.pop();
        q1.push(6);
        q1.push(7);
        System.out.println(q1.top());
        System.out.println(q1.size());
        q1.display();
    }
}
