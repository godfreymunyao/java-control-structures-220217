import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int correctStudentNumber = 220217;
        String correctPassword = "noia123";

        int studentNumber;
        String password;

        do {
            System.out.print("Enter student number: ");
            studentNumber = input.nextInt();

            System.out.print("Enter password: ");
            password = input.next();

            if (!password.equals(correctPassword)) {
                System.out.println("Incorrect password. Try again.\n");
            }

        } while (!password.equals(correctPassword));

        System.out.println("Access Granted");


    }
}
