
package linkedlist;

class Node{
    public int data;
    public Node next;
    public Node (int getData){
        data = getData;
    }
    public void throughput(){
            System.out.print(" "+data);
    }
}

class LList{
    private Node first;
    public LList(){
        first = null;
    }
    
    public void addFirst(int newItem){
        Node newNode = new Node(newItem);
        newNode.next = first;
        first = newNode;
    }
    
    public Node find(int key){
        Node active = first;
        
        while(active.data != key){
            if(active.next == null)
                return null;
            else
                active = active.next;
        };
        return active;
    }
    
    public Node delete(int key){
        Node active = first;
        Node previous = first;
        
        while(active.data != key){
            if(active.next==null)
                return null;
            else
            {
                previous = active;
                active = active.next;
            }
        }
            if(active==first)
                first=first.next;
            else
                previous.next=active.next;
           return active;
        
        
    }
    
    public void getList(){
        System.out.println();
        System.out.print("First-to-End List :");
        Node active = first;
        while(active!= null){
            active.throughput();
            active=active.next;
        }
    }
}



public class LinkedList {

   
    public static void main(String[] args) {
        
        LList list = new LList();
        list.addFirst(9);
        for(int i=8; i>=1; --i)
            list.addFirst(i);
        list.getList();
        int value = 5;
        Node n = list.find(value);
        if(n==null)
            System.out.println("\n"+value+" is not in List");
        else
            System.out.println("\n"+value+" Find it");
        
        Node d=list.delete(5);
        list.getList();
    }
    
}
