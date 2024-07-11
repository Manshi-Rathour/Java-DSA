package LinkedList;

public class LinkedListBasics {
     Node head;
     private int size;
     LinkedListBasics(){
         this.size = 0;
     }
     public class Node {
         String data;
         Node next;
         Node(String data) {
             this.data = data;
             this.next = null;
             size++;
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

     // delete from first
    public void deleteFirst(){
         if(head == null){
             System.out.println("List is empty.");
             return;
         }
         size--;
         head = head.next;
    }

    // delete from last
    public void deleteLast(){
         if(head == null){
             System.out.println("List is empty.");
             return;
         }

         size--;

         if(head.next == null){
             head = null;
             return;
         }

         Node secondLast = head;
         Node lastNode = head.next;
         while(lastNode.next != null) {
             lastNode = lastNode.next;
             secondLast = secondLast.next;
         }
         secondLast.next = null;
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

     // get size of LinkedList
    public int getSize(){
         return size;
    }

    // reverse the LinkedList
    public void reverseList(){
         if(head == null || head.next == null){
             return;
         }
         Node prevNode = head;
         Node currNode = head.next;
         while(currNode != null){
             Node nextNode = currNode.next;
             currNode.next = prevNode;

             // update
             prevNode = currNode;
             currNode = nextNode;
         }
         head.next = null;
         head = prevNode;
    }

    // reverse using recursion
    public Node reverseRecursive(Node head){
         if(head == null || head.next == null){
             return head;
         }
         Node newHead = reverseRecursive(head.next);
         head.next.next = head;
         head.next = null;

         return newHead;
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

//        list.deleteFirst();
//        list.printList();
//
//        list.deleteLast();
//        list.printList();

        System.out.println("Size of the LinkedList is " + list.getSize());

//        list.reverseList();
        list.head = list.reverseRecursive(list.head);
        list.printList();
    }
}
