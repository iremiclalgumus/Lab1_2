package game.inventory;

public class Inventory {

    private Item[] items;
    private int count;

    public Inventory() {
        items = new Item[10];
        count = 0;
    }

    public void addItem(Item item) {
        if (count < items.length) {
            items[count] = item;
            count++;
        }
    }

    public void displayAll() {
        System.out.println("--- Inventory Listing ---");
        for (int i = 0; i < count; i++) {
            Item item = items[i];
            System.out.println(item.getName() + " \t| " + item.getGenre() + " \t| Stock: " + item.getStockCount());
        }
    }

    public void auditSerialCodes() {
        System.out.println("--- Serial Code Audit ---");
        for (int i = 0; i < count; i++) {
            Item item = items[i];
            System.out.println(item.getName() + " \t-> " + item.getSerialCode());
        }
    }
}