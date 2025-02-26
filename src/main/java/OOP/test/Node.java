package OOP.test;

public class Node<E> {
    public E item;
    public Node next;

    Node (E item){
        this.item=item;
        this.next=null;
    }
}
