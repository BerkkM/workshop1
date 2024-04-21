import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How many products would you like to purchase? ");
        int number = scanner.nextInt();

        double totalCost = 0;

        for (int i = 1; i <= number; i++) {
            System.out.print("Enter the price of product " + i + ": ");
            double productPrice = scanner.nextDouble();
            totalCost += productPrice;
        }

        System.out.println("Total shopping cost: " + totalCost );

        scanner.close();
    }
}
