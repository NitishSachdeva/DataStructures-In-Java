
package datastructure;
public class CircularSinglyLinkList {
    private ListNode last;
    private int length;
    
    private class ListNode{
        private ListNode next;
        private int data;
        public ListNode(int data){
            this.data=data;
        }
    }
    
    public CircularSinglyLinkList(){
        last=null;
        length=0;
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length==0;
    }
    public void createCSL(){
        ListNode first=new ListNode(1);
        ListNode second=new ListNode(5);
        ListNode third=new ListNode(10);
        ListNode fourth=new ListNode(15);
        
        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=first;
        
        last=fourth;
    }
    public void display(){
        if(last==null)
            return;
        ListNode first=last.next;
        while(first!=last){
            System.out.print(first.data + "-->");
            first=first.next;
        }
        System.out.print(first.data + "-->");
    }
    public static void main(String[] args){
        CircularSinglyLinkList cs=new CircularSinglyLinkList();
        cs.createCSL();
        cs.display();
    }
    
}
