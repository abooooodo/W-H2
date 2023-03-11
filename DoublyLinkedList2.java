public class DoublyLinkedList<E> {
    private int size=0;
    private Node<E> header;
    private Node<E> trailer;

    public DoublyLinkedList() {
        header=new Node<>(null,null,null);
        trailer=new Node<>(null,null,header);
        header.next=trailer;
    }

    public boolean isEmpty()
    {
        return size==0;
    }
    public int size()
    {
        return size;
    }
    public E first()
    {
        if (isEmpty())return null;
        return header.next.element;
    }
    public E last()
    {
        if (isEmpty())return null;
        return trailer.prev.element;
    }
    private void addBetween(E e,Node<E> next, Node<E> prev)
    {
        Node<E> newe = new Node<>(e,next,prev);
        prev.next=newe;
        next.prev=newe;
        size++;
    }




    public void addFirst(E e)
    {
        addBetween(e,header.next,header);
    }
    public void addLast(E e)
    {
        addBetween(e,trailer,trailer.prev);
    }
    private E remove(Node<E>y)
    {
        Node<E> pr=y.prev;
        Node<E> ne=y.next;
        pr.next=ne;
        ne.prev= pr;
        size--;
        return y.element;
    }
    public E removeFirst()
    {
        return remove(header.next);
    }
    public E removeLast()
    {
        return remove(trailer.prev);
    }
    private class Node<E>{
        private E element;
        Node<E> prev;
        Node<E> next;

        public Node(E element, Node<E> next, Node<E> prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public void setPrev(Node<E> prev) {
            this.prev = prev;
        }
    }
}
