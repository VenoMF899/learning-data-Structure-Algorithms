package DataStructure;

public class main {

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.createDoublyLinkedList(1);
        dll.insertDoublyLinkedList(0,0);
        dll.insertDoublyLinkedList(5,3);
        dll.insertDoublyLinkedList(4,2);
        dll.search(1);
        dll.traversDoublyLinkedList();
    }
    
}
