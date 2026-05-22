public class StockItem {
    private String name;
    private int quantity;
    private int threshold;

    public StockItem(String name, int quantity, int threshold) {
        this.name = name;
        this.quantity = quantity;
        this.threshold = threshold;
    }

    // Logic to determine if stock is low
    public boolean isLowStock() {
        return this.quantity <= this.threshold;
    }

    // Getters and Setters
    public String getName() { return name; }
    public int getQuantity() { return quantity; }
}