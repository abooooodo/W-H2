public class Test {

    public static void main(String[] args) {



        LinkedStack <Integer>stack1=new LinkedStack<>();
        stack1.push(3);
        stack1.push(4);
        System.out.println(stack1.size());
        stack1.removeAll();
        System.out.println(stack1.size());
        System.out.println(stack1.popbottom());
    }
}
