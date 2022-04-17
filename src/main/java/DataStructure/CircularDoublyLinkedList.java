package DataStructure;

public class CircularDoublyLinkedList {
    private DoublyNode head ;
    private DoublyNode tail ;
    private int size ;

    public DoublyNode head() {
        return head;
    }

    public DoublyNode tail() {
        return tail;
    }

    public int size() {
        return size;
    }

    public void createCDLL(int nodeValue){
        head = new DoublyNode();
        DoublyNode node = new DoublyNode();
        node.value = nodeValue;
        node.next = node ;
        node.prev = node ;
        head = node ;
        tail = node ;
        size = 1;
    }

    private boolean isEmpty(){
        return head == null;

    }

    public void insertCDLL(int nodeValue , int location){
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        if(isEmpty()){
            createCDLL(nodeValue);
            size++;
            return;
        }else if(location == 0){
            head.prev = newNode;
            newNode.next = head;
            head = newNode ;
            head.prev = tail ;
            tail.next = head ;
        }else if(location >= size){
            tail.next = newNode ;
            newNode.prev = tail ;
            tail = newNode ;
            tail.next = head ;
        }else{
            DoublyNode tempNode = head ;
            for(int i = 0 ; i<size ; i++){
                if(i == location){
                    DoublyNode tempPrevious = tempNode.prev;
                    tempNode.prev = newNode ;
                    newNode.next = tempNode;
                    newNode.prev = tempPrevious;
                    tempPrevious.next = newNode;
                    break;
                }
                tempNode = tempNode.next;
            }

        }
        size++;
    }

    public void traversCDLL(){
        DoublyNode tempNode = head ;
        for(int i = 0 ; i<size ; i++){
            System.out.print(tempNode.value);
            if(i != size-1){
                System.out.print(" -> ");
            }
            tempNode = tempNode.next;
        }
        System.out.println("\n");
    }

}

