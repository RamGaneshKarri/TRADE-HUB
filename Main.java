import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        UserService userService = new UserService();
        PortfolioService portfolioService = new PortfolioService();

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        System.out.print("Enter your phone number: ");
        String phone = scanner.nextLine();

        User user = userService.createUser("U1", name, email, phone);
        Portfolio portfolio = new Portfolio();
        TradingAccount account = new TradingAccount();

        System.out.print("Enter the amount to add to your trading account: ");
        double funds = scanner.nextDouble();
        account.addFunds(funds);

        Asset google = new StockAsset("S1", "Google", 2800.50);
        Asset apple = new StockAsset("S2", "Apple", 175.25);
        Asset tesla = new StockAsset("S3", "Tesla", 680.75);

        Asset[] assets = { google, apple, tesla };

        System.out.println("Available assets:");
        for (int i = 0; i < assets.length; i++) {
            System.out.println((i + 1) + ". " + assets[i].getName() + " - Price: $" + assets[i].getPrice());
        }

        System.out.print("Select an asset to buy (enter the number): ");
        int assetChoice = scanner.nextInt();

        if (assetChoice < 1 || assetChoice > assets.length) {
            System.out.println("Invalid choice.");
            return;
        }

        Asset selectedAsset = assets[assetChoice - 1];

        System.out.print("Enter the quantity to buy: ");
        int quantity = scanner.nextInt();

        portfolioService.placeOrder(user, portfolio, account, selectedAsset, quantity);

        portfolio.viewPortfolio();

        scanner.close();
    }
}
