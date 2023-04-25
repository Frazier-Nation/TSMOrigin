import java.util.Scanner;
import java.util.ArrayList;

/**
 * The ShopRunner class is the main entry point for the application.
 * It encapsulates a Menu, providing it with a Scanner configured
 * with System.in to allow the menu to read from standard in.
 * When the application starts, the menu's greet and show methods are called.
 */
public class ShopRunner {
    /**
     * Main entry point to the application.
     * Asks the menu's greeting to be printed to standard out by calling its greet method.
     * Asks the menu to be shown by calling its show method.
     * @param args Command line arguments to the application
     */
    public static void main(String[] args) {
        Product product0 = new Product (0, "Crew Neck", 18.00);
        Product product1 = new Product (1, "V-Neck", 18.00);
        Product product2 = new Product (2, "Polo", 23.50);
        Product product3 = new Product (3, "Boat Neck", 34.95);
        Product product4 = new Product (4, "Tank Top", 13.00);
        ArrayList<Product> products = new ArrayList<Product>();
        products.add(product0);
        products.add(product1);
        products.add(product2);
        products.add(product3);
        products.add(product4);
        Cart cart = new Cart(products);
        Shop shop = new Shop ("T-Shirt Mart", products);
        Menu menu = new Menu(new Scanner(new InputStreamReader(System.in, Charset.forName("UTF-8"))), shop, cart);
        MenuOption[] enumValues = MenuOption.values();
        

        menu.greet();
        menu.executeMenu(MenuOption enumValues);
    }//Ends main()
}//ends ShopRunner Class
