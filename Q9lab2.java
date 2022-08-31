
import java.util.Scanner;

public class Q9lab2 {
    public static void main(String[] args) {
        int x,y;
        int sum,diff,product,average;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number:");
        x= in.nextInt();
        System.out.println("Enter the seconed number:");
        y= in.nextInt();
        sum=(x+y);
        System.out.println("Sum:" + sum);
        diff=(x-y);
        System.out.println("difference:" + diff);
        product=(x*y);
        System.out.println("product:" + product);
        average=((x+y)/2);
        System.out.println("average:" + average);
     /* Distance */
        if (diff < 0)
        {
            System.out.println(-diff);
        }
        else
        {
            System.out.println("Distance:" + diff);
        }
        /* the maximum number */
        if (x>y)
        {
            System.out.println( "Maximum:" + x);
        }
        else
        {
            System.out.println( "Maximum:" + y);
        }
        /* the minimum number */
        if (x<y)
        {
            System.out.println("Minimum:" + x);
        }
        else
        {
            System.out.println("Minimum:" + y);
        }






            }

            }


