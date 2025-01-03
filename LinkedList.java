class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
     static int size;
    public static Node head;
    public static Node tail;
    
    public void addNode(int data){
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

    public void lastNode(int data){
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        tail=newNode;
    }

    public void print(){
        
        if(head==null){
            System.out.println("LL is empty");
        }
        Node temp=head; 
        while(temp!=null){
            System.out.print(temp.data+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public static void addMiddle(int idx, int data){
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }
   

    public static int removefirst(){
        int val= head.data;
        head=head.next;
        return val;
    }

    public static int removeLast(){
        if (head == null) {  // Check if the list is empty
             System.out.println("Emplty");
        }
        
        if (head.next == null) {  // If the list has only one element
            int val = head.data;
            head = null;
            tail = null;
            size--;
            return val;
        }
        Node prev = head;
        while (prev.next != tail) {  // Traverse until prev is the second-to-last node
            prev = prev.next;
        }
    
        int val= prev.next.data;
        prev.next=null;
        tail=prev;
        size--;
        return val;
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addNode(3);
        ll.addNode(2);
        ll.addNode(1);
        ll.print();
        ll.lastNode(4);
        ll.lastNode(5);
        ll.print();
        ll.addMiddle(3,12 );
        ll.removefirst(); //garbage collection remove the first linked node by it self only.
        ll.print();

        ll.removeLast();
        ll.print();
         
    }
}