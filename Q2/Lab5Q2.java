import java.util.Scanner;

public class Lab5Q2 {
    public static void main(String[] args) {
        // Create the Scanner
        Scanner input = new Scanner(System.in);

        // Input the number of the members
        System.out.println("Enter the number of the members:");
        int num_of_mem = input.nextInt();

        // Validate the number of members
        if (num_of_mem < 0) {
            System.out.println("Invalid input. Terminating the program.");
            input.close();
	 // Close the scanner before exiting
            return;
        }

        // Find the gift type using switch
        switch (num_of_mem) {
            case 0:
                System.out.println("No Prize");
                break;
            case 1:
                System.out.println("Pen");
                break;
            case 2:
                System.out.println("Umbrella");
                break;
            case 3:
                System.out.println("Bag");
                break;
            case 4:
                System.out.println("Travelling Chair");
                break;
            default:
                System.out.println("Headphone");
        }

        // Close the scanner
        input.close();
    }
}
		