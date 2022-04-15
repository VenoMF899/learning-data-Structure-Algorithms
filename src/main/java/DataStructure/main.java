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
    }
    
}
