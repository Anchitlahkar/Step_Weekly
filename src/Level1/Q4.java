
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        double fee;
        double discountPercent;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the fee: ");
        fee = input.nextDouble();
        System.out.print("Enter the discount percentage: ");
        discountPercent = input.nextDouble();
        double discount = (fee * discountPercent) / 100;
        double discountedPrice = fee - discount;
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedPrice);
        input.close();
    }
}
