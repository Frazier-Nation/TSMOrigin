import java.util.ArrayList;
import java.util.Arrays;

class Shop {
    private ArrayList<Product> products;
    private String name;
    
    public Shop (String passedShopName, ArrayList<Product> passedProducts){
        this.name = passedShopName;
        this.products = passedProducts;
        
    }//ends Shop(passed)
    
    public Shop (){
        
        
    }//ends Shop()
    
    public String getName(){
        return name;
    }//Ends getter for Name
    
    public void printProducts() { 

        System.out.println("--Products--"); 

        for (Product count : products) { 
            String str = String.format("ID %1$d: %2$s - $%3$.2f", count.getId(), count.getName(), count.getPrice());
            System.out.println(str); 

        } //ends for loop 

    } //ends printProducts()  
    
    public int findProduct(String searchText) { 

        for (Product count : products) { 
            String name = count.getName();            

            if (searchText.equalsIgnoreCase(name)) { 

                return count.getId(); 
                        

            } //ends if 

                           

        } //end for loop 

        return -1; 

    } //ends findProduct() 
}//ends Shop Class
