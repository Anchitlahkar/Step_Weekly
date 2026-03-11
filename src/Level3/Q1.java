
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {
        double side1, side2, side3;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the length of side 1 in meters: ");
            side1 = input.nextDouble();
            System.out.print("Enter the length of side 2 in meters: ");
            side2 = input.nextDouble();
            System.out.print("Enter the length of side 3 in meters: ");
            side3 = input.nextDouble();
            double perimeter = side1 + side2 + side3;
            double totalDistance = 5000; // 5 km in meters
            double rounds = totalDistance / perimeter;
            System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km");
            input.close();
        }
    }
}
