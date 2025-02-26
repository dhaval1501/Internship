package OOP.test;

public class LinkedL<E> {

    public Node head;
    private int size;

    public void addFirst(E item){
        Node node=new Node<>(item);
        size++;
        if(head==null){
            head=node;
            return;
        }
        node.next=head;
        head=node;
    }

    public void add(E item){
        Node node=new Node<>(item);
        size++;
        if(head==null){
            head=node;
            return;
        }
        Node currNode=head;
        while (currNode.next!=null){
            currNode=currNode.next;
        }
        currNode.next=node;

    }
    public void add(int index,E item){
        if(index<0||index>size){
            throw new IndexOutOfBoundsException();
        }
        Node node=new Node<>(item);
        size++;
        if(head==null){
            head=node;
            return;
        }
        if (index==0){
            Node currNode=head;
            head=node;
            head.next=currNode;
            return;
        }

        Node currNode=head;
        Node currNode1 = currNode.next;
       for (int i=1;i<index;i++){
           currNode=currNode.next;
           currNode1=currNode1.next;
        }
       currNode.next=node;
       node.next=currNode1;
    }

    public E removeFist(){
        if (head==null){
            System.out.println("list is empty");
        }
        size--;
        Node currNode=head;
        head=head.next;
        return (E) currNode.item;
    }
    public E removeLast(){
        if (head==null){
//            System.out.println("list is empty");
            throw new IndexOutOfBoundsException();
        }
        size--;
        Node currNode=head;
        Node currNode1=head;
        if (head.next==null){
            head=null;
            return (E)currNode.item;
        }
        while (currNode.next.next!=null){
            currNode1=currNode1.next;
            currNode=currNode.next;
        }
        currNode.next=null;
        return (E) currNode1.item;
    }

    public void remove(int index){
        if (head==null){
            System.out.println("list is empty");
            return;
        }
        if(index<0||index>size){
            throw new IndexOutOfBoundsException();
        }
        size--;
        if(index==0){
            head=head.next;
            return;
        }
        Node currNode=head;
        Node currNode1=head;

        for (int i=0;i<index-1;i++){
            currNode1=currNode1.next;
            currNode=currNode.next.next;
        }
        currNode1.next=currNode.next;
        currNode.next=null;

    }

    public void clear(){
//        Node currNode=head;
//        for (int i=0;i<size;i++){
//            head.item=null;
//            currNode=currNode.next;
//            head=currNode;
//        }
        head=null;
        size=0;
    }

    public void set(int index,E item){
        if(index<0||index>size){
            throw new IndexOutOfBoundsException();
        }
        if (head==null){
            addFirst(item);
            return;
        }

        Node currNode=head;
        for (int i=0;i<=index-1;i++){
            currNode=currNode.next;
        }
        currNode.item=item;
    }

    public E getFirst(){
        if(head==null){
            System.out.println("list is empty");
        }
        return (E) head.item;
    }

    public E getLast(){
        if(head==null){
            System.out.println("list is empty");
        }
        Node currNode=head;
        while (currNode.next!=null){
            currNode=currNode.next;
        }
        return (E)currNode.item;
    }
    public E get(int index){
        if(index<0||index>size){
            throw new IndexOutOfBoundsException();
        }
        if(head==null){
            System.out.println("list is empty");
        }
        Node currNode=head;
        for (int i=0;i<=index-1;i++){
            currNode=currNode.next;
        }
        return (E)currNode.item;
    }

    public void print(){
        if(head==null){
            System.out.println("list is empty");
            return;
        }
        Node currNode=head;
        System.out.print("[ ");
        while (currNode!=null){
            System.out.print(currNode.item+" ");
            currNode=currNode.next;
        }
        System.out.print("null");
        System.out.println("]");
    }
    public int size(){
        return size;
    }

    public void hasCycle(Node head){
        Node temp=head;
        Node link=head.next;
        while (temp!=null){
            temp=temp.next;
            if (temp.next == null){
                temp.next=link;
                break;
            }
        }
        var fast=head;
        var slow = head;
        while (fast !=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){

            }
        }

    }

    public static void main(String[] args) {
        LinkedL<Integer> list = new LinkedL<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);


        list.print();
//        System.out.println(list.hasCycle(list.head));


    }

    public Node recSwapPair(Node head){
        if (head == null || head.next == null) {
            return head;
        }

        // Nodes to be swapped
        Node first = head;
        Node second = head.next;

        // Store next pair's head
        Node nextPairHead = second.next;

        // Swap the pair
        second.next = first;

        // Recursively swap the remaining pairs and connect
        first.next = recSwapPair(nextPairHead);

        // Return new head after swap (second node becomes new head)
        return second;

    }

    public void swapPair(){
        if (head == null || head.next== null){
            return;
        }
        Node prev=head;
        Node current=head.next;
        head = current;
        while (current != null){
            Node next=current.next;

            current.next = prev;

            if(next == null){
                prev.next=null;

                current=null;
            }else{
                prev.next=next.next;

                current=next.next;
            }

            prev=next;




        }
    }

    public Node recReversList(Node head){
        if (head == null || head.next== null){
            return head;
        }

        Node newNode=recReversList(head.next);
        head.next.next=head;
        head.next=null;
        return  newNode;

    }

    public void reversList(){
        if (head == null || head.next== null){
            return;
        }

        Node pervious= null;
        Node current=head;

        while (current != null){
            Node next=current.next;
            current.next=pervious;

            pervious=current;
            current=next;
        }
       
        head=pervious;
    }
}
