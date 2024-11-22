import java.util.Scanner;

public class Lab5Q3{
    // room charges and discount rates
    public static final double ROOM_CHARGE_PER_DAY = 48000.0;
    public static final int DISCOUNT_10_DAYS = 3;
    public static final int DISCOUNT_20_DAYS = 5;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input start and end dates
        System.out.println("Enter the start date it will be(1-31)days:");
        int startDate = input.nextInt();
        System.out.println("Enter the end date (1-31):");
        int endDate = input.nextInt();

        // Validation for start date and end date
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("invalid, Start date and end date must be between 1 and 31.");
            input.close();
            return;
        }

        if (startDate >= endDate) {
            System.out.println("invalid, Start date must be less than the end date.");
            input.close();
            return;
        }

        // Calculate number of days reserved
        int numberDays = endDate - startDate;

        // Determine discount rate
        double discountRate = 0.0;
        if (numberDays >= 3 && numberDays <= 4) {
            discountRate = 10.0;
        } else if (numberDays >= 5) {
            discountRate = 20.0;
        }

        // Calculate total amount
        double totalCost = numberDays*ROOM_CHARGE_PER_DAY;
        double discount = totalCost * (discountRate / 100);
        double finalAmount = totalCost - discount;

        // Display results
        System.out.println("Number of days reserved: " + numberOfDays);
        System.out.println("Total cost before discount: Rs. " + totalCost);
        System.out.println("Discount applied: " + discountRate + "%");
        System.out.println("Final amount to paid: Rs. " + finalAmount);

        input.close();
    }
}
