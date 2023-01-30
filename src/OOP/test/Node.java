package OOP.test;

public class Node<E> {
    E item;
    Node next;

    Node (E item){
        this.item=item;
        this.next=null;
    }
}
