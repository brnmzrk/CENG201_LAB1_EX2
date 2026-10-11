package game.inventory;

public class Item {

    // Declare fields
    private String name;
    private String genre;
    private String serialCode;
    private int stockCount;

    //Constructor
    public Item(String name, String genre, int stockCount, String serialCode) {
        //Initialize all fields
        this.name = name;
        this.genre = genre;
        this.serialCode = serialCode;
        this.stockCount = stockCount;

    }

    // Public getters for name, genre, stockCount
    public String getGenre() {
        return genre;
    }

    public int getStockCount() {
        return stockCount;
    }

    public String getName() {
        return name;
    }


    // Get serial code
    String getSerialCode(){
        return serialCode;
    }


    //checks whether enough stock exists.
    private boolean isAvailable(int quantity) {
        if (stockCount >= quantity){
            return true;
        }
        return false;
    }

    // Selling
    public void sell(int quantity) {
        if (isAvailable(quantity)){
            stockCount -= quantity;
            System.out.println("Selling successful");
        }else {
            System.out.println("Stock is insufficient!");
        }
    }
}