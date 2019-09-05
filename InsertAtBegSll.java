
package datastructure;

public class InsertAtBegSll {
    
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
    
     public ListNode insertAtBeg(ListNode head,int data){
         ListNode newNode=new ListNode(data);//Simply call parameterised constructor of inner class
         if(head==null)
             return newNode;
         newNode.next=head;
         head=newNode;
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
        
        InsertAtBegSll leng=new InsertAtBegSll();
        leng.display(head);
        
        ListNode newHead=leng.insertAtBeg(head,15);
        leng.display(newHead);
        
        
    }
    
}
