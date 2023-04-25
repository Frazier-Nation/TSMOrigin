public class MenuOptions{
    private int id = 0;
    private String displayValue = "null";

    public MenuOptions (int id, String displayValue){
        this.id = id;
        this.displayValue = displayValue;
    }
    /*enum*/
    enum MenuOption {
        EXIT, LIST_PRODUCTS, BUY_PRODUCT, FIND_PRODUCT, SHOW_CART, CHECKOUT;
    } //ends MenuOption Enum

    public int getId() {       
        return id;
    }
    
    public String getDisplayValue(MenuOption e) {
        switch (e) {
            case EXIT:
                displayValue = "Exit";
                return displayValue;
            case LIST_PRODUCTS:
                displayValue = "List Products";
                return displayValue;
            case BUY_PRODUCT:
                displayValue = "Buy Products";
                return displayValue;
            case FIND_PRODUCT:
                displayValue = "Find Products";
                return displayValue;
            case SHOW_CART:
                displayValue = "Show Cart";
                return displayValue;
            case CHECKOUT:
                displayValue = "Checkout";
                return displayValue;
            
        }
        return displayValue;
    }

    public void menuOptionFromOptionId(int optionId){
        int passedId = optionId;
        MenuOption[] values = MenuOption.values();
        

    }
}//ends MenuOption class