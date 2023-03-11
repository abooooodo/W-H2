import java.util.ArrayList;
import java.util.Random;

public class lab2_Q3 {
    public static void main(String[] args) {
        ArrayList<Integer> C=new ArrayList();
        Random random = new Random();
        C.add(1);
        C.add(2);
        C.add(3);
        C.add(4);
        C.add(5);

        int removedIndex;
        while (!C.isEmpty()) {
           removedIndex = random.nextInt(C.size());
            System.out.println(C);
            C.remove(removedIndex)   ;
        }
        }
    }