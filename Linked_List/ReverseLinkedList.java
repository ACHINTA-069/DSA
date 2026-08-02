public class ReverseLinkedList {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;

        }
    }
    Node head;
    //Add last..............
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
    //Reverse list...........
    public void Reverse(){
        Node prevNode=null;
        Node currNode=head;
        while(currNode!=null){
            Node nextNode=currNode.next;
            currNode.next=prevNode;

            //update
            prevNode=currNode;
            currNode=nextNode;  
        }
        //add haad..........
        head=prevNode;
    }
    //print..............
    public void PrintList(){
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+" ->");
            currNode=currNode.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) {
        ReverseLinkedList list=new ReverseLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        System.out.println("Original List:");
        list.PrintList();

        System.out.println( );
        list.Reverse();
        System.out.println("Reversed List:");
        list.PrintList();
    }
}
