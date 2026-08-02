public class RemoveNthNode {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    //Add last.............
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
    //print list............
    public void PrintList(){
        if(head==null){
            System.out.println("The list is empty:");
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+" ->");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }
    //Delete Nth from the reverse of the list........
    public void RemoveNthFromBack(int n){
        Node dummy=new Node(0);
        dummy.next=head;
        //assign fast & slow............
        Node Fast=dummy;
        Node Slow=dummy;
        //move first to nth row
        for(int i=0;i<n;i++){
            Fast=Fast.next;
        }
        //Move both.........
        while(Fast.next!=null){
            Fast=Fast.next;
            Slow=Slow.next;
        }
        //remove nth node........
        Slow.next=Slow.next.next;
        //update head if neaded....
        head=dummy.next;
    }
    public static void main(String[] args) {
        RemoveNthNode list=new RemoveNthNode();
        list.addLast(1);   
        list.addLast(2);   
        list.addLast(3);   
        list.addLast(4);   
        list.addLast(5);   
        list.addLast(6); 
        int n=3;  
        System.out.println("Original List:");
        list.PrintList();
        System.out.println();
        
        System.out.println("List after remove:");
        list.RemoveNthFromBack(n);
        list.PrintList();
    }
}
