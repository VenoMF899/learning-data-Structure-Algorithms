package DataStructure;

public class DoublyLinkedList {
    private DoublyNode head;
    private DoublyNode tail;
    private int size;

    public DoublyNode head() {
        return head;
    }

    public DoublyNode tail() {
        return tail;
    }

    public int size() {
        return size;
    }

    public DoublyNode createDoublyLinkedList(int nodeValue){
        /*
            what is the time and space complexity of this method,
            find the time and space complexity of this method.

            time complexity = o(1+1+1+1+1+1+1+1+1) -> o(1)
            space complexity = o(1)
         */
        head = new DoublyNode(); // o(1)
        DoublyNode newNode = new DoublyNode(); // o(1)
        newNode.value = nodeValue; // o(1)
        newNode.prev = null; // o(1)
        newNode.next = null ; // o(1)
        head = newNode; // o(1)
        tail = newNode; // o(1)
        size = 1; // o(1)
        return head; // o(1)
    }

    private boolean isEmpty(){
        return head == null;
    }

    public void insertDoublyLinkedList(int nodeValue , int location){
        DoublyNode newNode = new DoublyNode();
        newNode.value = nodeValue;
        if(isEmpty()){
            createDoublyLinkedList(nodeValue);
            return;
        }else if(location == 0){
           newNode.next = head;
           head.prev = newNode;
           head = newNode;
        }else if(location >= size){
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;

        }else{
            DoublyNode tempNode = head;
            DoublyNode prev = null;
            int index = 0;
            while(tempNode != null){
                if(index == location-1){
                    DoublyNode tempNext = tempNode.next;
                    tempNode.next = newNode;
                    newNode.prev = tempNode;
                    tempNext.prev = newNode;
                    newNode.next = tempNext;

                }
                tempNode = tempNode.next;
                index++;
            }
        }
        size++;
    }

    public void traversDoublyLinkedList(){
        if(isEmpty()){
            System.out.println("LinkedList does not exist");
            return;
        }
        DoublyNode tempNode = head;
        while(tempNode != null){
            System.out.print(tempNode.value);
            if(tempNode.next != null){
                System.out.print(" -> ");
            }
            tempNode = tempNode.next;
        }
    }

    public void reverseTraversDoublyLinkedList(){
        if(isEmpty()){
            System.out.println("LinkedList does not exist");
            return;
        }
        DoublyNode tempNode = tail;
        while (tempNode != null){
            System.out.print(tempNode.value);
            if(tempNode.prev != null){
                System.out.print(" -> ");
            }
            tempNode = tempNode.prev;
        }
    }

    public void deleteOfNodeByLocation(int location){
        if (isEmpty()) {
            System.out.println("LinkedList does not exist");
            return;
        }else if(location == 0){
            if(head == tail){
                head = tail = null;
            }
            head = head.next;
            head.prev = null;
        }else if(location >= size-1){
            if(head == tail){
                head = tail = null;
            }
            DoublyNode previous = tail.prev;
            tail.prev = null;
            previous.next = null ;
            tail = previous;
        }else{
            DoublyNode tempNode = head;
            int index = 0 ;
            while (tempNode.next != null){
                if(index+1 == location){
                    tempNode.next = tempNode.next.next;
                }
                tempNode = tempNode.next;
                index++;
            }
        }
        size--;
    }

    public void deleteOfNode(int nodeValue) {
        if (isEmpty()) {
            System.out.println("LinkedList does not exist");
            return;
        } else if (head.value == nodeValue) {
            head = head.next;
            head.prev = null;
        } else if (tail.value == nodeValue) {
            DoublyNode previous = tail.prev;
            tail.prev = null;
            previous.next = null ;
            tail = previous;
        }else{
            DoublyNode tempNode = head ;
            while (tempNode.next != null){
                if(tempNode.next.value == nodeValue){
                    tempNode.next = tempNode.next.next;
                }
                tempNode=tempNode.next;
            }
        }
        size--;
    }

    public boolean search(int nodeValue){
        if(isEmpty()){
            System.out.println("LinkedList does not exist");
            return false;
        }else if(head.value == nodeValue){
            System.out.println("value has been found in index " + 0);
            return true;
        }else if(tail.value == nodeValue){
            System.out.println("value has been found in index " + (size-1));
            return true;
        }else{
            DoublyNode tempNode = head;
            int index = 0 ;
            while (tempNode != null){
                if(tempNode.value == nodeValue){
                    System.out.println("value has been found in index " + index);
                    return true;
                }
                tempNode = tempNode.next;
                index++;
            }

        }
        return false;
    }


}
