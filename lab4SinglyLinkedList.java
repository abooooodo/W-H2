public class lab4_SinglyLinkedList<E>{

    private Node<E> head=null;
    private Node<E> tail=null;
    private int size=0;

    public lab4_SinglyLinkedList() {

    }
    public boolean isEmpty()
    {return size == 0;
    }
    public int size()
    {return size;
    }
    public E First()
    {if (isEmpty())return null;
        return head.element;
    }
    public E Last()
    {if (isEmpty())return null;
        return tail.element;
    }
    public void addFirst(E element)
    {head=new Node<E>(element,head);
        if (isEmpty())
            tail=head;
        size++;

    }
    public void addLast(E element)
    { Node<E> news=new Node<>(element,null);
        if (isEmpty())
            head=news;
        else
            tail.setNext(news);
        tail=news;
        size++;
    }
    public E removeFirst()
    {if (isEmpty())return null;
        E d=head.element;
        head=head.next;
        size--;
        if (size==0)
            tail=null;
        return d;
    }

    public E printLinkedList()
    {
        if (isEmpty()) return null;

        E print=head.element;
        head=head.next;
        if (print==tail.element && tail.next==null)
            print= tail.element;

        return print;

    }
    public boolean rotate()
    {
      tail.element=head.element;


        return false;
    }

    private static class Node<E>
    {
        E element;
        Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
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



    }
}
