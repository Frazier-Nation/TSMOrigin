class Product {
    
    private int id;
    private String name;
    private double price;
    
    public Product (int passedId, String passedName, double passedPrice) {
        this.id = passedId;
        this.name = passedName;
        this.price = passedPrice;
                     
    }//End of Product's Constr
    
    public int getId (){
        return id;
    }// Ends Id Getter
    public String getName () {
        return name;
    }//Ends Name Getter
    public double getPrice () {
        return price;
    }//Ends Price Getter
}//End of Product Class