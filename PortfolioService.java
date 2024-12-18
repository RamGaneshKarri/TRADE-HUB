class PortfolioService {
    public void placeOrder(User user, Portfolio portfolio, TradingAccount account, Asset asset, int quantity) {
        double totalCost = asset.getPrice() * quantity;
        if (account.deductFunds(totalCost)) {
            Order order = new Order("O" + (portfolio.hashCode() + 1), asset, quantity);
            portfolio.addOrder(order);
            System.out.println("Order placed successfully!");
        }
    }
}