import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {
    private static final Map<String, Double> exchangeRates = new HashMap<>();

    static {
        exchangeRates.put("USD", 1.0);
        exchangeRates.put("INR", 83.25);
        exchangeRates.put("EUR", 0.92);
        exchangeRates.put("GBP", 0.78);
        exchangeRates.put("JPY", 155.60);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Available currencies: " + exchangeRates.keySet());
        System.out.print("Enter base currency (e.g. USD): ");
        String base = scanner.next().toUpperCase();

        System.out.print("Enter target currency (e.g. INR): ");
        String target = scanner.next().toUpperCase();

        if (!exchangeRates.containsKey(base) || !exchangeRates.containsKey(target)) {
            System.out.println("Invalid currency entered.");
            return;
        }

        System.out.print("Enter amount in " + base + ": ");
        double amount = scanner.nextDouble();

        double converted = convert(base, target, amount);
        System.out.printf("%.2f %s = %.2f %s\n", amount, base, converted, target);

        scanner.close();
    }

    public static double convert(String base, String target, double amount) {
        double inUSD = amount / exchangeRates.get(base); // Convert to USD
        return inUSD * exchangeRates.get(target); // Convert to target
    }
}
