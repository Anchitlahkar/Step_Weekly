
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        int numberOfStudents;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        numberOfStudents = input.nextInt();
        int handshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
        System.out.println("The number of possible handshakes is " + handshakes);
        input.close();
    }
}
