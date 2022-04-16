package  DataStructure;
public class CircularSinglyLinkedList {
    private Node head ;
    private Node tail ;
    private int size;

    // return the head of linkedList
    public Node head() {
        return head;
    }
    // return the tail of linkedList
    public Node tail() {
        return tail;
    }
    // return the size of linkedList
    public int size() {
        return size;
    }

    // create a circularSinglyLinkedList
    public Node createCSLL(int nodeValue){
        /*
            what is the time complexity of this method,
            find the time complexity of this method

            o(1+1+1+1+1+1+1+1) --> o(1)

            what is the space complexity of this method,
            find the space complexity of this method

            o(1)
         */
        head = new Node();
        Node node = new Node();
        node.value = nodeValue;
        node.next = node;
        head = node;
        tail = node;
        size = 1;
        return head;
    }
    private boolean isEmpty(){
        return head == null;
    }
    // Traversal Method
    public void traversCSLL(){

        if(isEmpty()){ // o(1)
            System.out.println("SLL does not exist!"); // o(1)
            return;
        }else{ // o(N)
            Node tempNode=head;
            for(int i = 0 ;i<size;i++){ // o(N)
                System.out.print(tempNode.value);
                if(i != size-1){
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
            System.out.println("\n");
        }
    }

    // Insert method CircularSinglyLinkedList
    public void insertCSLL(int nodeValue , int location){
        /*
             what is the time complexity of this method,
            find the time complexity of this method

            o(1+1+1+1+1+N) --> o(N+5) --> o(N)
         */
        if(isEmpty()){
            createCSLL(nodeValue);
            return;
        }
        Node node = new Node(); // o(1)
        node.value = nodeValue; // o(1)
        if (isEmpty()){ // o(1)
            createCSLL(nodeValue); // o(1)
            return;
        }else if(location == 0){ // o(1)
            node.next = head; // o(1)
            head = node; // o(1)
            tail.next = node;

        }else if(location >= size){ // o(1)
            tail.next = node;
            tail = node;
            tail.next = head;

        }else{ // o(n)
            Node tempNode = head; // o(1)
            int index = 0; // o(1)
            while(index < location-1){ // o(n)
                tempNode=tempNode.next;
                index++;
            }
            node.next = tempNode.next;
            tempNode.next = node;
        }
        size++;
    }

    // Searching method in CSLL
    public boolean SearchCSLL(int value){
        Node tempNode = head;
        for(int i = 0 ;i<size ; i++){
            if(tempNode.value == value){
                System.out.println("Found the node at location: " + i +"\n");
                return true;
            }
            tempNode = tempNode.next;
        }
        System.out.println("Node not found!"); // o(1)
        return false; // o(1)
    }

    public Node getPrevious(Node node){
        Node n = head;
        Node prev = null;
        while(n != null){
            if(n.value == node.value){
                break;
            }
            prev = n;
            n = n.next;
        }
        return prev;
    }

    public void clear(){
        if(isEmpty()){return;}
        head = tail = null;
        size = 0;
    }

    public void deletionOfNodeByLocation(int location){
        if(isEmpty()){
            System.out.println("The SLL does not exist");
            return;
        }else if(location == 0){
            head = head.next;
            size--;
            return;
        }else if(location >= size){
            if(head == tail){
                head = tail = null;
                size--;
                return;
            }
            Node previous = getPrevious(tail);
            previous.next = null ;
            tail = previous;
            tail.next = head;
            size--;
            return;
        }else{
            Node n = head;
            for(int i = 0 ; i<size ;i++){
                if(i+1 == location-1){
                    n.next = n.next.next;
                    size--;
                    return;
                }
                n=n.next;
            }
        }

    }

    public void deletionOfNode(int value){
        if(isEmpty()){
            System.out.println("The SLL does not exist");
            return;
        }else if(head.value == value){
            if(head == tail){
                head = tail = null;
                size--;
                return;
            }
            head = head.next;
            size--;
            return;
        }else if(tail.value == value){
            if(head == tail){
                head = tail = null;
                size--;
                return;
            }
            Node previous = getPrevious(tail);
            previous.next = null ;
            tail = previous;
            tail.next = head;
            size--;
            return;
        }else{
            Node n = head;
            while(n.next != null){
                if(n.next.value == value){
                    n.next = n.next.next;
                    size--;
                    return;
                }
                n=n.next;
            }

        }

    }
}