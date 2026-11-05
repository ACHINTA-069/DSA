public class CheckForAnyLoopInLL {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    public void printList(){
        Node currNode=head;
        if(head==null){
            System.out.print("The list is empty.....");
        }
        while(currNode!=null){
            System.out.print(currNode.data+" ->");
            currNode=currNode.next;
        }
        System.out.print("NULL");
    }
    //check for any loop............
    public Node checkLoop(){
        Node fast=head;
        Node slow=head;
        //boolean isLoop=false;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                //isLoop= true;
                break;
            }
        }
        //check for the loop
        if(fast==null || fast.next==null){
            return null;
        }
        // Detect the Starting point of the loop..........
    
        slow=head;
        Node prev=null;
            while(slow!=fast){
                slow=slow.next;
                 prev=fast;
                fast=fast.next;
            }
            //deleteing  the loop................
            prev.next=null;
            return slow;
    }
    public static void main(String[] args) {
        CheckForAnyLoopInLL list=new CheckForAnyLoopInLL();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        System.out.println("Original List:");
        list.printList();
        
        //creat a loop.........
        Node loopStart=list.head.next.next;
        Node currNode=list.head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=loopStart;


        //check for the loop.................
        System.out.println();
        Node point =list.checkLoop();
        if(point!=null){
            System.out.println("There is a loop start at:"+point.data);
            System.out.println("The loop has been removed.....");
        }
        else{
            System.out.println("There is not any loop.");

        }
        //print after removeing the loop.
        System.out.println("print after removeing the loop:");
        list.printList(); 
        
    }
}
