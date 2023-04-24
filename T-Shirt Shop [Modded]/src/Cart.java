import java.util.*;

public class Cart {
    private ArrayList<Product> items = new ArrayList<>();
    private ArrayList<Product> products;
    private double taxrate = 1.10;
    private double total = 0.00;
    private Scanner scanner;
    
    public Cart (ArrayList <Product> passedProducts){
    this.products = passedProducts;
}
    
    public String addItem (Scanner passedScanner){        
        String returnString = "null";        
        this.scanner = passedScanner;
        System.out.println("Please enter the ID of the product you would like to purchase:");        
        int cartNumHolder = scanner.nextInt();
        for (Product i : products){
            if (cartNumHolder == i.getId()){
                items.add(i);
                returnString = String.format("%1$s has been added to your cart.", i.getName());
                total = total + i.getPrice();              
                return returnString; 
            }
                                      
        } //ends for loop
            String str = ("That item ID is invalid and could not be added to the cart.");
            
            return str;           
    }//ends addItem()
            
  
    
    public void showDetails(){
        //System.out.println("--Cart--\nItem Count: " + items.size() + "\nItems:");
        String itemCount = String.format("--Cart--\nItem Count: %d\n", items.size());
        System.out.println(itemCount);

        for (Product i : items){
            String goBack = String.format("%1$s: $%2$.2f", i.getName(), i.getPrice());
            System.out.println(goBack);
        }//ends Enhanced For
        //System.out.println("\nPre-Tax Total: $" + total);
        String preTaxString = String.format("\nPre-Tax Total: $%.2f", total);
        System.out.println(preTaxString);
        double newTotal = (total * taxrate);
        String str = String.format("Post-Tax Total (10.00%% Tax): $%.2f", newTotal);
        System.out.println(str);
        
        
}//ends showDetails()
            
    private boolean empty(){
       if (items.size() > 0){
           items.clear();
           return true;
       } else {
           System.out.println("Your cart is currently empty. Please add at least one product to check out.");
           return false;
       }
    }//ends empty ()
    
    public String checkOut(){
        String sendBack = "null";
        if (empty()){        
        double trueTotal = total * taxrate;
        sendBack = String.format("Your total is $%1$.2f\nThank you for shopping at T-Shirt Mart.", trueTotal);         
        }//ends If
        return sendBack;
    }//ends checkOut()
   
    public int getSize (){
        if (items.isEmpty()){
            return 0;
        } else{            
        
        return items.size();
        }
    }//Ends getSize()
}//ends Cart Class