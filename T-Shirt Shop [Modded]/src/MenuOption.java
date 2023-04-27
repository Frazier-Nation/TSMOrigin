    enum MenuOption{

    EXIT(0, "Exit"), LIST_PRODUCTS(1, "List Products"), BUY_PRODUCT(2, "Buy Product"), FIND_PRODUCT(3, "Find Product"), SHOW_CART(4, "Show Cart"), CHECKOUT(5, "Checkout");
    private int id = 0;
    private String displayValue = "null";

    MenuOption () {
        
    }

    MenuOption (int passedId, String passedDisplayValue) {
        this.id = passedId;
        this.displayValue = passedDisplayValue;
    }//ends MenuOption Constr
    
    public int getId() {       
        return id;
    }
    
    public String getDisplayValue() {        
        return displayValue;
    }

    public MenuOption fromOptionId(int optionId){
        int passedId = optionId;
        MenuOption[] values = MenuOption.values();
        return values[passedId];
    }//ends fromOptionId ()

        

    
}//ends MenuOption class