
package datastructure;


public class SingleLinkList {
    private ListNode head;
    public void display(ListNode head){
        if(head==null)
            return;
        ListNode current=head;
        while(current!=null){
            System.out.print(current.data + "-->");
            current=current.next;
        }
        System.out.println(current);
      
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
        
        SingleLinkList sll=new SingleLinkList();
        sll.display(head);
    }
    
}
