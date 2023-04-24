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
    
    public String getDisplayValue() {
        return displayValue;
    }

    public void menuOptionFromOptionId(int optionId){
        int passedId = optionId;
        MenuOption[] values = MenuOption.values();
        

    }
}//ends MenuOption class