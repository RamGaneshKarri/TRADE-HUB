class StockAsset implements Asset {
    private String assetId;
    private String name;
    private double price;

    public StockAsset(String assetId, String name, double price) {
        this.assetId = assetId;
        this.name = name;
        this.price = price;
    }

    @Override
    public String getId() {
        return assetId;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
