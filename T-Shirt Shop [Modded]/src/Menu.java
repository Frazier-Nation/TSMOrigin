import java.util.*;


/**
 * Menu class is responsible for greeting the user, showing a menu
 * to the user for interaction with the application.
 * The class maintains a String[] array of menu options, which it
 * uses for printing the menu to standard out.
 * The class is also responsible for responding to user interaction
 * with respect to its menu.
 */
public class Menu {    
    private Scanner scanner = new Scanner(System.in);
    private Shop shop = new Shop();
    private Cart cart;
    int numHandler = 0;
    /**
     * Class constructor, which expects a Scanner object
     * It allows for the user to specify how a Scanner is to
     * be configured outside this class and for basic inversion of control.
     * @param scanner takes in a Scanner object to initialize
     */
    public Menu(Scanner scanner, Shop shop, Cart cart) {
        this.shop = shop;
        this.scanner = scanner;
        this.cart = cart;
        
    }


    /**
     * Prints the menu to standard output, using the class's menuOptions array.
     * It accepts user input using the encapsulated Scanner instance.
     * All output is printed to standard out.
     * All input is collected from standard in.
     */
    public void executeMenu(MenuOption enumValues) {
        int menuChoice = 9;
        do {
            
            printMenu();
            menuChoice = getNextIntFromUser();
            if (menuChoice >= 0 || menuChoice <6){ 
            switch (menuChoice){
                case 0: exit();
                    break;
                case 1: shop.printProducts();
                    break;
                case 2: System.out.println(cart.addItem(scanner));
        
                    break;
                case 3: 
                    System.out.println("Enter the item to search for:");
                    String itemToFind = getNextStringLineFromUser();
                    numHandler = shop.findProduct(itemToFind);
                        if (numHandler != -1) {                    
                            System.out.println(itemToFind + " was found and its product id is " + numHandler);
                        } else {
                            System.out.println("That product was not found.");
                          }
                            break;
                case 4: 
                    if (cart.getSize() == 0){
                        System.out.println("The cart is empty. Please add at least one product to see it in the cart.");
                    } else {
                        cart.showDetails();
                    }
                    break;
                case 5: 
                    if (cart.getSize() == 0){
                        System.out.println("Your cart is currently empty. Please add at least one product to check out.");
                    } else {
                        System.out.println(cart.checkOut());
                    }
                    break;
         
              } //end Switch
            }    else {
              System.out.println ("Please enter a valid choice");
          
            } 
        } while (menuChoice != 0);     
        
          
    
    }//end Execute Menu


    /**
     * Asks the user to enter their name.
     * After the user provides their name, it outputs a greeting to the user to standard out.
     */
    public void greet() {
        System.out.println("Hello. Please enter your name:");
        String name = scanner.nextLine();
        //System.out.println("Welcome " + name + " to " + shop.getName());
        String finalPrint = String.format("Welcome %1$s to %2$s", name, shop.getName());
        System.out.println(finalPrint);        
    }

    /**
     * Prints the menu header and menu options.
     */
    private void printMenu() {
        System.out.println("\n--Main Menu--");
        System.out.println("Select an option using one of the numbers shown\n");
       
        for (MenuOption e : MenuOption.values()) {
            int i = 0;

            String loopString = string.format("%1$f: %2$s", i, getDisplayValue(e);)
            i++;
            //System.out.print(i + ": ");
            //System.out.println(menuOptions[i]);
        }
    }

    /**
     * Prints an exit statement and closes the scanner object.
     */
    private void exit() {
        System.out.println("Exiting now. Goodbye.");
        scanner.close();
    }

    /**
     * Collects next user-entered int.
     * @return integer value denoting the user selection
     */
    private int getNextIntFromUser() {
        return scanner.nextInt();
    }

    /**
     * Skips a line of empty input from the scanner's input stream
     * and then returns the next available line.
     * @return string representing the line of input typed by the user
     */
    private String getNextStringLineFromUser() {
        scanner.nextLine();
        return scanner.nextLine();
    }
    
}
