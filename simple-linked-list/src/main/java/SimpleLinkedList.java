import java.util.NoSuchElementException;
import java.lang.reflect.Array;
class SimpleLinkedList<T> {
    public class Node<T>{
        T val;
        Node<T> next;
        Node(T val){
            this.val=val;
            next=null;
        }
    }
    int siz=0;
    Node<T> head=null;
    Node<T> tail=null;
    SimpleLinkedList() {
    }

    SimpleLinkedList(T[] values) {
        for(T cur: values){
            push(cur);
        }
    }

    void push(T value) {
        Node<T> cur=new Node<T>(value);
        if(head==null){
            head=cur;
            tail=cur;
        }
        else{
            cur.next=tail;
            tail=cur;
        }
        siz++;
    }

    T pop() {
        if(siz==0){
            throw new NoSuchElementException();
        }
        T value=tail.val;
        tail=tail.next;
        siz--;
        return value;
    }

    void reverse() {
        Node<T> cur=tail;
        tail=head;
        head=tail;
        Node<T> prev=null;
        while(cur!=null){
            Node<T> next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
    }

    T[] asArray(Class<T> clazz) {
        T[] arr= (T[]) Array.newInstance(clazz,siz);
        Node<T>cur=tail;
        for(int i=0;i<siz;i++){
            arr[i]=cur.val;
            cur=cur.next;
        }
        return arr;
    }

    int size() {
        return siz;
    }
}
