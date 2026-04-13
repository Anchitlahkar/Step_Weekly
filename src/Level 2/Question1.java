import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numEmployees = 10;
        double[] salary = new double[numEmployees];
        double[] yearsOfService = new double[numEmployees];
        double[] newSalary = new double[numEmployees];
        double[] bonusAmount = new double[numEmployees];

        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        for (int i = 0; i < numEmployees; i++) {
            System.out.println("Employee " + (i + 1) + ":");
            System.out.print("Enter salary: ");
            double s = sc.nextDouble();
            System.out.print("Enter years of service: ");
            double y = sc.nextDouble();

            if (s <= 0 || y < 0) {
                System.out.println("Invalid input. Please enter again.");
                i--;
                continue;
            }

            salary[i] = s;
            yearsOfService[i] = y;
            totalOldSalary += s;
        }

        for (int i = 0; i < numEmployees; i++) {
            double bonusPercent = (yearsOfService[i] > 5) ? 0.05 : 0.02;
            bonusAmount[i] = salary[i] * bonusPercent;
            newSalary[i] = salary[i] + bonusAmount[i];

            totalBonus += bonusAmount[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        sc.close();
    }
}
