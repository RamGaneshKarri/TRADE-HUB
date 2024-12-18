class Order {
    private String orderId;
    private Asset asset;
    private int quantity;

    public Order(String orderId, Asset asset, int quantity) {
        this.orderId = orderId;
        this.asset = asset;
        this.quantity = quantity;
    }

    public Asset getAsset() {
        return asset;
    }

    public int getQuantity() {
        return quantity;
    }
}