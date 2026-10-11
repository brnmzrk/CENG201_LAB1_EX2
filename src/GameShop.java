import game.inventory.*;


public class GameShop {
    public static void main(String[] args) {

        Inventory shop = new Inventory();
        Item game1 = new Item("Galaxy Racer","Racing",12,"GR-4421");
        Item game2 = new Item("Shadow Realm","RPG",5,"SR-8873");
        Item game3 = new Item("Pixel Legends","Strategy",3,"PL-0091");

        // adding item to inventory
        shop.addItem(game1);
        shop.addItem(game2);
        shop.addItem(game3);

        // Call displayAll()
        shop.displayAll();

        System.out.println();

        // Sell some copies:

        game1.sell(4);
        game2.sell(6);

        System.out.println();

        // Call displayAll() again to show updated stock
        shop.displayAll();

        System.out.println();

        // all auditSerialCodes()
        shop.auditSerialCodes();


        // System.out.println(item.getSerialCode()); // WHY does this fail?

        /* It was defined with package-private in Item class. It can access only same package like (game.inventory)*/
    }
}