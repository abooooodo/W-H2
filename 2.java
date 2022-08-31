import java.util.Scanner;

public class Q2lab2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        {
            double r;
            System.out.println("Enter radius");
            r= in.nextDouble();
            double area = 3.14 * r * r;
            double perimeter = 2 * 3.14 * r;
            System.out.println("Area of a circle = " + area);
            System.out.println("Perimeter of a circle = " + perimeter);
        }
    }
}
