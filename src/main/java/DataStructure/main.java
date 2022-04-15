package DataStructure;

public class main {

    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        csll.createCSLL(5);
        csll.insertCSLL(6,0);
        csll.insertCSLL(7,8);
        csll.SearchCSLL(7);

        csll.traversCSLL();
    }
    
}
