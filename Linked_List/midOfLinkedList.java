public class midOfLinkedList {
    
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    //add Last.............................................
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

    //print list...........................................
    public void printList(){
        if(head==null){
             System.out.println("The List is empty");
            return;
        }
        Node currNode=head;
        while(currNode!=null){
             System.out.print(currNode.data+" ->");
            currNode=currNode.next;
        }
         System.out.print("null");
     }
     public int midList(){
        Node slow=head;
        Node fast=head;
        if(head==null){
            return -1;
        }
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow.data;
     }
       public static void main(String[]args){
        midOfLinkedList list=new midOfLinkedList();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
                list.addLast(5);

        list.printList();
            System.out.println();
         int a=list.midList();
         if(a==-1){
            System.out.println("List is empty");
         }
         else{
            System.out.println("Middle is:"+a);
         }
    }
}

