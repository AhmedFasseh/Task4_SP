import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = input.nextDouble();

        //if-else statement
        if (radius > 0) {
            double area = Math.PI * radius * radius;
            System.out.println("The area of the circle is " + area);
        } else {
            System.out.println("Invalid radius.");
        }

        //switch-case statement
        switch (Double.compare(radius, 0.0)) {
            case 1:
                double area = Math.PI * radius * radius;
                System.out.println("The area of the circle is " + area);
                break;
            default:
                System.out.println("Invalid radius.");
        }

        input.close();    }
}