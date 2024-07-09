package LinkedList;

public class LinkedListBasics {
     Node head;
     public class Node {
         String data;
         Node next;
         Node(String data) {
             this.data = data;
             this.next = null;
         }
     }

    // insert a node at first
    public void addFirst(String data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // insert a node at last
     public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;
     }

     // print list
     public void printList(){
        Node currNode = head;

        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
         System.out.println("null");
     }

    public static void main(String[] args) {
        LinkedListBasics list = new LinkedListBasics();

        list.addFirst("a");
        list.addFirst("is");
        list.printList();
        list.addLast("list");
        list.printList();
        list.addFirst("this");
        list.printList();
    }
}
