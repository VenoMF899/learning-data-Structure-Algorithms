package DataStructure;

public class SinglyLinkedList {
    /*
        im doing or implementing the linkedList class as the teacher
        wrote it in the course
     */
    private Node head ;
    private Node tail ;
    public  int size;

    // create a linkedList with head node of nodeValue
    public Node createSinglyLinkedList(int nodeValue){
        /*
            what is time complexity of creating SinglyLinkedList?
            find the time complexity of creating SinglyLinkedList

            time complexity o(1+1+1+1+1+1+1+1) --> o(1)
            space complexity o(1)
         */
        head = new Node(); // o(1)
        Node node = new Node(); // o(1)
        node.next= null; // o(1)
        node.value = nodeValue; // o(1)
        head = tail = node ; // o(1
        size = 1; // o(1)
        return head; // o(1)
    }

    // return the head node of linkedList
    public Node getHead() {
        return head;
    }

    // return the tail node of linkedList
    public Node getTail() {
        return tail;
    }

    // return the size of linkedList
    public int size() {
        return size;
    }

    // Delete Entire SinglyLikedList
    public void clear(){
        if(isEmpty()){return;}
        head = tail = null;
        size = 0 ;
    }



    // Insert Method SinglyLinkedList
    public void insertInLinkedList(int nodeValue , int location){
        Node node = new Node(); // o(1)
        node.value = nodeValue; // o(1)
        if(isEmpty()){ // o(1)
            createSinglyLinkedList(nodeValue);
            return;
        }else if(location == 0){ // o(1)
            node.next = head;
            head = node;
        }else if(location >= size){ // o(1)
            node.next = null;
            tail.next = node;
            tail = node;
        }else{ // o(N)
            Node n = head; // o(1)
            int index = 0 ; // o(1)
            Node prev = null; // o(1)
            while (index < location -1){ // o(N)
                n = n.next;
                index++;
            }
            Node nextNode = n.next;
            n.next = node;
            node.next = nextNode;

            /*  OR

                while(n != null){
                if(index == location){
                    node.next = n;
                    prev.next = node;
                    return;
                }
                prev = n;
                n=n.next;
                index++;
            }
             */
        }
        size++;
    }

    // SinglyLinkedList Traversal
    public void traverseSinglyLinkedList(){
        if(isEmpty()){ // o(1)
            System.out.println("SLL does not exist!"); // o(1)
            return;
        }else{ // o(N)
            Node tempNode=head;
            for(int i = 0 ;i<size ;i++){ // o(N)
                System.out.print(tempNode.value);
                if(i != size-1){
                    System.out.print(" -> ");
                }
                tempNode = tempNode.next;
            }
            System.out.println("\n");
        }
    }

    // Search For a Node
    public boolean searchNode(int nodeValue){
        // this method take o(n) time complexity and o(1) space complexity
        if(isEmpty()){ // o(1)
            System.out.println("Node not found");
            return false;
        }
        Node n = head;
        int index =0 ;
        while (n != null){ // o(N)
            if(n.value == nodeValue){ // o(1)
                System.out.println("Found the node at location: " + index +"\n");
                return true;
            }
            n=n.next; // o(1)
            index++; // o(1)
        }
        System.out.println("Node not found!"); // o(1)
        return false; // o(1)

    }

    // Delete a Node from SinglyLinkedList
    public void deletionOfNodeByLocation(int location){
        if(isEmpty()){
            System.out.println("The SLL does not exist");
            return;
        }
        if(location == 0 ){
            head = head.next;
            size--;
            if(size ==0 ){
                tail = null;
            }
            return;
        }else if(location >= size){
            if(tail == head){
                tail = head = null;
                size--;
                return;
            }
            Node previous = getPreviousByIndex(location);
            previous.next =null;
            tail = previous;
            size--;
            return;
        }else{
            Node n = head;
            int index = 0;
            while(n.next != null){
                if(index == location){
                    n.next = n.next.next;
                }
                n=n.next;
                index++;
            }
            size--;
            return;
        }

    }

    public void deletionOfNode(int value){
        if(isEmpty()){
            System.out.println("The SLL does not exist");
            return;
        }


        if(head.value == value){
            head = head.next;
            size--;
            if(size == 0){
                tail = null;
            }
            return;


        }else if(tail.value == value && size >1){
            Node previous = getPrevious(tail);
            previous.next = null;
            tail = previous;
            size--;
            return;
        }else{
            Node n = head ;
            while(n.next != null){
               if(n.next.value == value){
                   n.next = n.next.next;
               }
               n=n.next;
            }
            size--;
            return;
        }


    }

    private Node getPrevious(Node node){
        Node n = head;
        Node prev = null;
        while(n != null){
            if(n.value == node.value){
                break;
            }
            prev = n;
            n=n.next;
        }
        return prev;
    }


    private Node getPreviousByIndex(int location){
        Node n = head;
        Node prev = null;
        int index =  0;
        while(n != null){
            if(index == location){
                break;
            }
            prev = n;
            n=n.next;
            index++;
        }
        return prev;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void print(){
        if(isEmpty()){return;}
        Node n = head;

        while(n != null){
            System.out.print(n.value + " ");
            if(n.next != null){
                System.out.print("->");
            }
            n=n.next;
        }
        System.out.println("");

    }







}
