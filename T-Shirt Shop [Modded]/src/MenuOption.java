    enum MenuOption{

    EXIT("Exit"), LIST_PRODUCTS("List Products"), BUY_PRODUCT("Buy Product"), FIND_PRODUCT("Find Product"), SHOW_CART("Show Cart"), CHECKOUT("Checkout");
    private int id = 0;
    private String displayValue = "null";

    MenuOption () {
        
    }

    MenuOption (String passedDisplayValue) {
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