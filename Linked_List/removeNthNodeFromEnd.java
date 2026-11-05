public class removeNthNodeFromEnd {
    
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
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;
    }
    public void display(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+" ->");
            curr=curr.next;
        }
        System.out.print("null");
    }
    public void deleteNthNode(int n){
        Node dummy=new Node(0);
        dummy.next=head;
        Node slow=dummy;
        Node fast=dummy;
        for(int i=0;i<n;i++){
            if(fast==null){
                return;
            }
            fast=fast.next;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=fast;
    }
    
    public static void main(String[] args) {
      removeNthNodeFromEnd sol=new removeNthNodeFromEnd();
        sol.addLast(1);
        sol.addLast(2);
        sol.addLast(3);
        sol.addLast(4);
        sol.addLast(5);
        sol.display();
        int n=2;
        sol.deleteNthNode(n);
        System.out.println();
        sol.display();
        //System.out.print(n+"th node is:"+ans.data);
    }
}

