package duke.choice;

/**
 *
 * @author user
 */
public class ShopApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Tax
        double tax = 0.2;
        double total = 0.0;
        // Welcome Message
        System.out.println("Welcome to duke choice shop!");

        //Customers        
        Customer c1 = new Customer();
        c1.setName("Tila");
        c1.setSize("S");

        //System.out.println("Customer c1 is " + c1.getName() + "," + c1.getSize());
        //Printing out the index of character a in the name:
        //System.out.println(c1.getName().indexOf('a'));

        //Clothing Items
        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        //An array of clothing items
        Clothing items[] = {item1, item2, new Clothing(), new Clothing()};

        item1.setDescription("Blue Jacket");
        item1.setPrice(20.9);
        item1.setSize("M");

        item2.setDescription("Orange T-shirt");
        item2.setPrice(10.5);
        item2.setSize("S");

        items[2].setDescription("Green Scarf");
        items[2].setPrice(5);
        items[2].setSize("S");

        items[3].setDescription("Blue T-shirt");
        items[3].setPrice(10.5);
        items[3].setSize("S");

        //Calculating total for 1 item1 and two item2
        /*total = (item1.price + (item2.price * 2)) * (1 + tax);*/
 /* System.out.println("Item1 is a " + item1.description + ", price $" + item1.price
                + ", and size " + item1.size + ".");
        System.out.println("Item2 is an " + item.getDescription + ", price $" + item.getP  rice
                + ", and size " + item.getSize + ".");*/
        int measurement = 8;
        
        c1.addItems(items);
        //Item details and Total price of items using Loops
        System.out.println("Customer " + c1.getName() + "," + c1.getSize()+ ","+ c1.getTotalClothingCost());
        for (Clothing item : c1.getItems()) {
           // System.out.println(item.getDescription() + ", price $" + item.getPrice() + ", size " + item.getSize() + ".");
        System.out.println("Item: " + item.getDescription());
        }
        /*System.out.println("Total price = " + total);*/
    }
}
