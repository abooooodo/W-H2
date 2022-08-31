import java.util.Scanner;

public class Q3lab3 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        {
            double area,a,b;
            System.out.println("Enter length of the rectangle:");
            a = in.nextDouble();
            System.out.println("Enter width of the rectangle:");
            b = in.nextDouble();
            area = a*b;
            System.out.println("Area of a rectangle = " + area);

            double perimeter,l,w;
            System.out.println("Enter length of a rectangle:");
            l= in.nextDouble();
            System.out.println("Enter width of a rectangle:");
            w= in.nextDouble();
            perimeter=(l+w)*2;
            System.out.println("Perimeter of a rectangle = " + perimeter);

        }
    }
}
