package DataStructure;

public class DoublyNode {
    int value ;
    DoublyNode prev;
    DoublyNode next;

    public DoublyNode(){

    }

    public DoublyNode(int value){
        this.value =value;
        this.prev = null;
        this.next = null;
    }
}
