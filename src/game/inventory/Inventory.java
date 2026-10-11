package game.inventory;

public class Inventory {

    //list
    private Item[] items;
    private int count;


    public Inventory() {
        items = new Item[10];
        count = 0;
    }

    // Adds an item to the inventory
    public void addItem(Item item) {
        if (count < 10){
            items[count] = item;
            count++;
        }else {
            System.out.println("Inventory full");
        }
    }

    // Displays name, genre, and stock count for every item
    public void displayAll() {
        System.out.println("--- Inventory Listing ---");
        for (int i = 0; i < count; i++){
            System.out.println(items[i].getName() + " | " + items[i].getGenre() + " | " + " Stock: " + items[i].getStockCount());
        }
    }


    public void auditSerialCodes() {
        System.out.println("--- Serial Code Audit ---");
        for (int i = 0; i < count;i++){
            System.out.println(items[i].getName() + " -> " + items[i].getSerialCode());
        }
    }
}