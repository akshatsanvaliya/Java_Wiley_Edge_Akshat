import java.util.Scanner;

public class Cart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of items in your cart: ");
        int numItems = scanner.nextInt();

        double[] prices = new double[numItems];
        int[] quantities = new int[numItems];

        for (int i = 0; i < numItems; i++) {
            System.out.printf("Enter the price of item %d: ", i+1);
            prices[i] = scanner.nextDouble();
            System.out.printf("Enter the quantity of item %d: ", i+1);
            quantities[i] = scanner.nextInt();
        }

        scanner.close();

        double totalCartValue = 0;

        for (int i = 0; i < prices.length; i++) {
            double originalPrice = prices[i] * quantities[i];
            double discountedPrice = originalPrice;

            totalCartValue += originalPrice;

            if (totalCartValue > 10000) {
                discountedPrice = originalPrice * 0.9;
            } else {
                totalCartValue += 10000; 
            }

            System.out.printf("Item %d: Original Price: INR %.2f, Discounted Price: INR %.2f\n", i+1, originalPrice, discountedPrice);
        }

        System.out.printf("Total cart value: INR %.2f\n", totalCartValue);
    }
}
