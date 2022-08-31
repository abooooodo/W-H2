import java.util.Scanner;

public class Q4lab2 {
    public static void main(String[] args) {
        int q,e,l;
        float ava,intnumber;
        Scanner in= new Scanner(System.in);
        System.out.println("Enter first number");
        q= in.nextInt();
        System.out.println("Enter seconed number");
        e= in.nextInt();
        System.out.println("Enter third number");
        l= in.nextInt();
        System.out.println("Enter integr number");
        intnumber= in.nextFloat();
        ava=(q+e+l/intnumber);
        System.out.println(ava);
    }
}
