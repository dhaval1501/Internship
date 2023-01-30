package OOP.test;

public class ArrayL<E> {
    private E[] arr;
    private int size;

    public ArrayL(){
            arr = (E[]) new Object[10];
    }

    public ArrayL(int arr_size){
        arr = (E[]) new Object[arr_size];
    }

    public void add(E item) {

        if(arr.length==size){
            E[] arr2=(E[]) new Object[size*2];

            for (int i=0;i<size;i++){
                arr2[i]=arr[i];
            }
            arr=arr2;
        }
        arr[size++]=item;
    }

    public void add(int index,E item){
        if(arr.length==size+1||arr.length==size){
            E[] arr2=(E[]) new Object[size*2];

            for (int i=0;i<size;i++){
                arr2[i]=arr[i];
            }
            arr=arr2;
        }

        for (int i=size;i>=index;i--){
           E temp=arr[i];
           arr[i]=arr[i-1];
           arr[i+1]=temp;
        }
        set(index,item);
        size++;
    }

    public void remove(int index){

        if (index<0||index>size){
            throw new ArrayIndexOutOfBoundsException();
        }

        for (int i=index;i<size;i++){
            arr[i]=arr[i+1];
        }
        size--;
    }

    public int size(){
        return size;
    }

    public void set(int index,E item){
        if (index<0||index>size){
            throw new ArrayIndexOutOfBoundsException();
        }
        arr[index]=item;
    }

    public E get(int index){
        return arr[index];
    }

    public void clear(){
        int s=size;
        for (int i=0;i<s;i++){
            arr[i]=null;
            size--;
        }
    }

    public void print() {
        if (size==0){
            System.out.println("[null]");
        }
        System.out.print("[ ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.print("]");
    }

}
