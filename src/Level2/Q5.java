
import java.util.Scanner;

public class Q5 {

    public static void main(String[] args) {
        double unitPrice, quantity;
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter the unit price: ");
            unitPrice = input.nextDouble();
            System.out.print("Enter the quantity: ");
            quantity = input.nextDouble();
            double totalPrice = unitPrice * quantity;
            System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
            input.close();
        }
    }
}
