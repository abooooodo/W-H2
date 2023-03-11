public class DoublyStack<E> implements Stack{


    DoublyLinkedList<E>list=new DoublyLinkedList<>();
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public E top() {
        return list.first();
    }

    @Override
    public void push(Object e) {list.addLast((E) e);}

    @Override
    public Object pop() {
        return list.removeLast();
    }



}
