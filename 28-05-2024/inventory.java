public class inventory {
    private String itemId;
    private String name;
    private int quantity;
    private double price;
    public inventory(String itemId, String name, int quantity, double price) {
        this.itemId = itemId;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }
    public void updateQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
            System.out.println("Quantity updated to: " + this.quantity);
        } else {
            System.out.println("Quantity cannot be negative.");
        }
    }
    public void displayDetails() {
        System.out.println("ID: " + itemId + ", Name: " + name + ", Quantity: " + quantity + ", Price: $" + price);
    }
    public static void main(String[] args) {
        inventory item = new inventory("01", "Phone", 5, 999.99);
        item.displayDetails();
        item.updateQuantity(5);
        item.displayDetails();
        item.updateQuantity(-3);
        item.displayDetails();
    }
}
