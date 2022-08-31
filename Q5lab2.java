import java.util.Scanner;

public class Q5lab2 {
    public static void main(String[] args) {
        int x,y,temp;
        System.out.println("Enter x");
        System.out.println("Enter y");
        Scanner in= new Scanner(System.in);
        x= in.nextInt();
        y= in.nextInt();
         temp=x;
         x=y;
        y=temp;
        System.out.println( " x = " + x + " " + " y = " + y );


    }
}
