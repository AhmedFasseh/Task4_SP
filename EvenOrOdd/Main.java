import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        //if-else statement
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        //switch-case statement
        switch (number % 2) {
            case 0:
                System.out.println(number + " is even.");
                break;
            case 1:
                System.out.println(number + " is odd.");
                break;
        }

        input.close();    }
}