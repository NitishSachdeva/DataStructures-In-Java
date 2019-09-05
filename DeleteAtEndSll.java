
package datastructure;

public class DeleteAtEndSll {

    private ListNode head;
    public void display(ListNode head){
        if(head==null)
            return ;
        ListNode current=head;
        int count=0;
        while(current!=null){
            System.out.print(current.data + "-->");
            count++;
            current=current.next;
        }
        System.out.println(current);
        System.out.println(count);
    }
    
     public ListNode delAtEnd(ListNode head){
        if(head==null)
         return head;
        ListNode last=head;
        ListNode prevToLast=null;
        while(last.next!=null){
            prevToLast=last;
            last=last.next;
        }
        prevToLast.next=null;    
        return last;
        }
    
    private static class ListNode{
        private int data;
        private ListNode next;
        
        public ListNode(int data){
                this.data=data;
                this.next=null;
        }
       
    }
    
     public static void main(String[] args){
        ListNode head=new ListNode(10);
        ListNode second=new ListNode(8);
        ListNode third=new ListNode(1);
        ListNode fourth=new ListNode(11);
        
        head.next=second;
        second.next=third;
        third.next=fourth;
        
        DeleteAtEndSll leng=new DeleteAtEndSll();
        leng.display(head);
        
        ListNode last=leng.delAtEnd(head);
        System.out.println(last.data);
        leng.display(head);
        
        
    }       
}
