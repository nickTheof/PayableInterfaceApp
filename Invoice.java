package gr.nikolaostheofanis.books.javabook.ch10.PayableInterfaceApp;

/**
 * Invoice class implements Payable Interface
 */
public class Invoice implements Payable{
    private final String partNumber;
    private final String partDescription;
    private int quantity;
    private double pricePerItem;

    // constructor
    public Invoice(String partNumber, String partDescription, int quantity, double pricePerItem){
        if (quantity < 0){ // validate quantity
            throw new IllegalArgumentException("Quantity must be >= 0");
        }
        if (pricePerItem < 0.0){ // validate price
            throw new IllegalArgumentException("Price per item must be >= 0.0");
        }
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    } // end constructor

    // getter method for part number
    public String getPartNumber(){
        return partNumber;
    }

    // getter method for part description
    public String getPartDescription() {
        return partDescription;
    }

    // getter method for quantity
    public int getQuantity() {
        return quantity;
    }

    // setter method for quantity
    public void setQuantity(int quantity){
        if (quantity < 0){ // validate quantity
            throw new IllegalArgumentException("Quantity must be >= 0");
        }
        this.quantity = quantity;
    }

    // getter method for price per item
    public double getPricePerItem() {
        return pricePerItem;
    }

    // setter method for price per item
    public void setPricePerItem(double pricePerItem){
        if (pricePerItem < 0.0){ // validate price per item
            throw new IllegalArgumentException("Price per item must be >= 0.0");
        }
        this.pricePerItem = pricePerItem;
    }

    // set string representation
    @Override
    public String toString(){
        return String.format("Invoice:\nPart Number: %s (%s)\nQuantity: %d\nPrice per Item: %.2f",
                getPartNumber(), getPartDescription(), getQuantity(), getPricePerItem());
    }

    //implements Interface overriding getPaymentAmount method
    @Override
    public double getPaymentAmount(){
        return getPricePerItem() * getQuantity();
    }
}
