public class Palindome {
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            this.next=null;
        }
        
    }
    Node head;
    //add last function.................
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
    //print function..........
    public void PrintList(){
        Node currNode=head;
        if(head==null){
            System.out.println("The list is empty..........");
            return;
        }
        while(currNode!=null){
            System.out.print(currNode.data+" ->");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }
    //palindome check..........
    public boolean check_is_Palindome(){
        //check for empty or single list..........
        if(head==null||head.next==null){
            return true;
        }
        //find middle of the list..............
        Node fast=head;
        Node slow=head;
        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        //reverse of the loop..........
        Node secondHalf=reverseLinkedList(slow);

        Node firstHalf=head;
        //palindome check............
        while(secondHalf!=null){
            if(secondHalf.data!=firstHalf.data){
                return false;
            }
            secondHalf=secondHalf.next;
            firstHalf=firstHalf.next;
        }

        return true;
    }
    //reverse linked list.........
    public Node reverseLinkedList(Node head){
        Node prev=null;
        Node curr=head;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            //update
            prev=curr;
            curr=next;
        }
        return prev;
    }
    public static void main(String[] args) {
        Palindome list=new Palindome();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(2);
        list.addLast(1);
        System.out.println("Original List:");
        list.PrintList();
        
        if(list.check_is_Palindome()){
            System.out.println("The list is Palindome............");
        }
        else{
            System.out.println("The list is not palindome.........");
        }
    }
}