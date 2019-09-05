
package datastructure;

public class InsertAtEndSll {
    
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
    
     public ListNode insertAtEnd(ListNode head,int data){
         ListNode newNode=new ListNode(data);//Simply call parameterised constructor of inner class
         if(head==null)
             return newNode;
         ListNode current=head;
         while(current.next!=null){
             current=current.next;
         }
         current.next=newNode;
         return head;   
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
        
        InsertAtEndSll leng=new InsertAtEndSll();
        leng.display(head);
        
        ListNode newHead=leng.insertAtEnd(head,15);
        leng.display(newHead);
        
        
    }
}
