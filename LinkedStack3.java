public class LinkedStack<E> implements Stack{
    SinglyLinkedList<E> list = new SinglyLinkedList<>();
    @Override
    public boolean isEmpty() {return list.isEmpty();}

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public E top() {return list.first();}

    @Override
    public void push(Object e) {list.addFirst((E) e);
    }

    @Override
    public Object pop() {return list.removeFirst();
    }


    public void printListReverse(LinkedStack<E> list) {
        LinkedStack<E> st = new LinkedStack<>();
        while (!list.isEmpty()) st.push(list.pop());
        list = st;
        while (!list.isEmpty()) System.out.println(st.pop());
    }

    public static <E> E popBottom(LinkedStack<E> st) {
        while (!st.isEmpty()) {
            E d = (E) st.pop();
            if (st.isEmpty()) return d;
        }
        return null;
//       
    }

    public E bottom() {
        while (this.size() != 1) this.pop();
        return this.top();
    }

    public E popbottom() {
        while (!this.isEmpty()) {
            E d= (E) this.pop();
            if (this.isEmpty()) return d;
        }
        return null;
    }

    public void transfer(Stack<E> A,Stack<E> B)
    {
        while (!A.isEmpty())
        {
            B.push(A.pop());
        }
    }
    public void removeAll()
    {
        while (!isEmpty())
        {
            pop();
        }
    }
}
