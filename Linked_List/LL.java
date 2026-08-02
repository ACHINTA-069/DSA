class LL{
    Node head;
    int size;
    LL(){
        this.size=0;
    }
    class Node{
        String data;
        Node next;
    
    Node(String data){
        this.data=data;
        this.next=null;
        size++;
        }
    }
    //add first........
    public void addFirst(String data){
       
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }
    //add last.............
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node currNode=head;
        while(currNode.next != null){
            currNode=currNode.next;
        }
        currNode.next=newNode;
    }
    //delete first.........
    public void delFirst(){
        if(head==null){
            System.out.print("The list is empty.......");
        }
        size--;
        head=head.next;
    }
    //delete last.............
    public void delLast(){
        if(head==null){
            System.out.print("The list is empty....");
            return;
        }
        size--;
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node last=head.next;
        while(last.next!=null){
            last=last.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }
    //print.....
    public void PrintList(){
        if(head==null){
            System.out.print("The list is empty.....");
            return;
        }
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data+" ->");
            currNode=currNode.next;
        }
        System.out.print("null");
    }
    public int getSize(){
        return size;
    }

    public static void main(String[]args){
        
        LL list=new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.PrintList();

        System.out.println();

        list.addLast("good");
        list.addLast("boy");
        list.PrintList();

        System.out.println();

        list.addFirst("Ram");
        list.PrintList();

        //print after delete first.....
        System.out.println();
        list.delFirst();
        list.PrintList();

        //print after delete last....
        System.out.println();
        list.delLast();
        list.PrintList();

        //print size..........
        System.out.println();
        System.out.println(list.getSize());

        //check the print function after add one node
        list.addLast("boy");
        System.out.print(list.getSize());
    }
}