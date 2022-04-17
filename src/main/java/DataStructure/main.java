package DataStructure;

public class main {

    public static void main(String[] args) {
            CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
            for(int i = 0;i<10 ; i++){
                    csll.insertCSLL(i,i);
            }
            csll.traversCSLL();
            System.out.println(csll.size());
            csll.clear();
            System.out.println(csll.size());

            csll.traversCSLL();

            DoublyLinkedList dll = new DoublyLinkedList();
            dll.createDoublyLinkedList(1);
            dll.insertDoublyLinkedList(0,0);
            dll.insertDoublyLinkedList(5,3);
            dll.insertDoublyLinkedList(4,2);
            dll.search(1);
            dll.traversDoublyLinkedList();

            System.out.println("Circular Doubly Linked List");
            CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
            cdll.createCDLL(5);
            cdll.insertCDLL(0,0);
            cdll.insertCDLL(4,1);
            cdll.insertCDLL(7,3);
            System.out.println("head.prev.value =" + cdll.head().prev.value);
            System.out.println("tail.next.value ="+ cdll.tail().next.value);

            cdll.traversCDLL();



    }
    
}
