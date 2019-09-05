
package datastructure;

public class DeleteAtBegSll {

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
    
     public ListNode delAtBeg(ListNode head){
         ListNode temp=head;
         head=head.next;
         temp.next=null;
         return temp;
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
        
        DeleteAtBegSll leng=new DeleteAtBegSll();
        leng.display(head);
        
        ListNode first=leng.delAtBeg(head);
        System.out.println();
        leng.display(head);
        
        
    }    
}
