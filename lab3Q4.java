// Equivalence Testing with Arrays
import java.util.ArrayList;

public class lab3_Q4 {
    public static void main(String[] args) {
        ArrayList<Integer> A=new ArrayList();
        ArrayList<Integer> B=new ArrayList();
        A.add(3);
        B.add(7);
        B.add(5);
        A.add(6);
        if(A.equals(B))
            System.out.println("They are equals");
        else System.out.println("They are not equals");
    }
}
