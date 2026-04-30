class Node {
    int val;
    Node next;
    Node prev;

    public Node(int val) {
        this.val = val;
    }

}

class Deque {
    int size;
    Node head;
    Node tail;
    public Deque() {
        size=0;
    }

    public boolean isEmpty() {
        if(size==0) return true;
        return false;
    }

    public void append(int value) {
        Node node = new Node(value);
        if(head == null && tail == null){
            head = node;
            tail = node;
        }
        else {
            node.prev=tail;
            tail.next=node;
            tail=tail.next;
        }
        size++;
    }
    /**
     N-><-N-><-N<-N
          h     
                  t
 */
    public void appendleft(int value) {
        Node node = new Node(value);
        if(head == null && tail == null){
            head = node;
            tail = node;
        }
        else{
            head.prev=node;
            node.next = head;
            head = head.prev;
        }
        size++;
    }

    public int pop() {
        if(this.isEmpty()) return -1;
        int val =tail.val;
        size--;
        if(size == 0) {
            head = null;
            tail=null;
            return val;
        }
        tail.prev.next = null;
        tail=tail.prev;
        return val;
    }

    public int popleft() {
        if(this.isEmpty()) return -1;
        int val =head.val;
        size--;
        if(size == 0) {
            head = null;
            tail=null;
            return val;
        }
        head.next.prev=null;
        head = head.next;
        return val;
    }
}
