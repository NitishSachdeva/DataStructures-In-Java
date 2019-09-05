
package datastructure;

public class InsertAfterNodeSll {
        
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
    
     public void insertAfter(ListNode previous,int data){
         ListNode newNode=new ListNode(15);//Simply call parameterised constructor of inner class
         if(previous==null){
             System.out.println("Can't be null");
             
         }
         newNode.next=previous.next;
         previous.next=newNode;
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
        
        InsertAfterNodeSll leng=new InsertAfterNodeSll();
        leng.display(head);
        
        leng.insertAfter(second,15);
        leng.display(head);
        
        
    }
    
}
