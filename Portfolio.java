import java.util.List;
import java.util.ArrayList;

class Portfolio {
    private List<Order> orders;

    public Portfolio() {
        this.orders = new ArrayList<>();
    }

    public void addOrder(Order order) {
        orders.add(order);
    }

    public void viewPortfolio() {
        System.out.println("Portfolio:");
        for (Order order : orders) {
            System.out.println(order.getAsset().getName() + " - Quantity: " + order.getQuantity());
        }
    }
}
