class TRNode{
    int data;
    TRNode next;
    TRNode prev;

    TRNode(int new_data){
        this.data=new_data;
        this.next=null;
        this.prev=null;
    }
}

public class traversalDLL {

    public static void forwardTraverse(TRNode head){
        TRNode curr=head;
        while(curr!=null){
            System.out.print(curr.data+"->");
            curr=curr.next;
        }
        System.out.println("null");
    }

    public static void backwardTraverse(TRNode tail){
        TRNode curr=tail;
        System.out.print("null");
        while(curr!=null){
            System.out.print("<-"+curr.data);
            curr=curr.prev;
        }
    }


    public static void main(String[] args) {
        TRNode head=new TRNode(10);
        TRNode second=new TRNode(20);
        TRNode third=new TRNode(30);

        head.next=second;
        second.next=third;
        second.prev=head;
        third.prev=second;


        System.out.println("Forward Traversal: ");
        forwardTraverse(head);


        System.out.println("Backward Traversal: ");
        backwardTraverse(third);
    }
}
