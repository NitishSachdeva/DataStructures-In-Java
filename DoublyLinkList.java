
package datastructure;
public class DoublyLinkList {
    private ListNode head;
    private ListNode tail;
    private int length;
    
    private class ListNode{
        private int data;
        private ListNode next;
        private ListNode previous;
        
        public ListNode(int data){
            this.data=data;
        }        
    }
     public DoublyLinkList(){
         this.head=null;
         this.tail=null;
         this.length=0;
     }
     public boolean isEmpty(){
         return length==0;  //if head==null
     }
     public int length(){
         return length;
     }
     
     public void insertLast(int value){
        ListNode newNode=new ListNode(value);    
         if(isEmpty()){
             head=newNode;
         }
         else{
             tail.next=newNode;
         }
         newNode.previous=tail;
         tail=newNode;
         length++;
     }
     
     public void insertFirst(int value){
        ListNode newNode=new ListNode(value);    
         if(isEmpty()){
             tail=newNode;
         }
         else{
             head.previous=newNode;
         }
         newNode.next=head;
         head=newNode;
         length++;
     }
     
     public void displayForward(){
         if(head==null)
             return;
         ListNode temp=head;
         while(temp!=null){
             System.out.print(temp.data + "-->");
             temp=temp.next;
         }
         System.out.print("null");
     }
     public void displayBackward(){
         if(head==null)
             return;
         ListNode temp=tail;
         while(temp!=null){
             System.out.print(temp.data + "-->");
             temp=temp.previous;
         }
         System.out.print("null");
     }
     
     
     
     public static void main(String[] args){
         DoublyLinkList dll=new DoublyLinkList();
         dll.insertLast(1);
         dll.insertLast(10);
         dll.insertLast(15);
         dll.insertLast(25);
         
         dll.displayForward();
         dll.displayBackward();
     }
             

      
    
}
