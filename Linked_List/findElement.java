

public class findElement {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
      Node head;
       //add First.........................................
    public void addFirst(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            //size++;
            return;
        }
        newNode.next=head;
        head=newNode;
        //size++;
    }
     //add Last.............................................
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
           // size++;
            return;
        }
        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
        //size++;
    }
      //delete first...........................................
    public void removeFirst(){
        if(head==null){
            System.out.println("The List is empty");
            return;
        }
       // size--;
        head=head.next;
    }
     //delete last.........................................
    public void removeLast(){
        if(head==null){
            System.out.println("The list is empty");
            return;
        }
        //size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node last=head.next;
        Node secondlast=head;
        while(last.next!=null){
            last=last.next;
            secondlast=secondlast.next;
        }
        secondlast.next=null;
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
     public int getNode(int target){
        Node currNode=head;
        int count=1;
        while(currNode!=null){
            if(currNode.data==target){
                return count;
            }
            currNode=currNode.next;
            count++;
        }
        return -1;
     }
    public static void main(String[] args) {
        int target=7;
         findElement list=new findElement();
        list.addFirst(2);
        list.addFirst(1);
        list.addLast(3);
        list.addLast(4);
        list.printList();
        System.out.println();
       int a=list.getNode(target);
        if(a==-1){
            System.out.println("The element  is not presrnt in the List");
        }
        else{
            System.out.println("The element  is present at index:"+a);
        }
    
    }
    
}
