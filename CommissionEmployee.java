package gr.nikolaostheofanis.books.javabook.ch10.PayableInterfaceApp;

/**
 * Define concrete subclass CommissionEmployee that inherits from Employee abstract superclass
 */
public class CommissionEmployee extends Employee{
    private double grossSales;
    private double commissionRate;

    // constructor
    public CommissionEmployee(String firstName, String lastName, String socialSecurityNumber, Date birthDate,
                              double grossSales, double commissionRate){
        super(firstName, lastName, socialSecurityNumber, birthDate);
        if (grossSales < 0.0) { // validate gross sales
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate commission rate
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    } // end constructor

    // getter method for commission rate
    public double getCommissionRate() {
        return commissionRate;
    }

    // setter method for commission rate
    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0.0 || commissionRate >= 1.0){ // validate commission rate
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }
        this.commissionRate = commissionRate;
    }

    // getter method for gross sales
    public double getGrossSales() {
        return grossSales;
    }

    // setter method for gross sales
    public void setGrossSales(double grossSales) {
        if (grossSales < 0.0){ // validate gross sales
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }
        this.grossSales = grossSales;
    }

    // String representation of CommissionEmployee class
    @Override
    public String toString(){
        return String.format("Commission Employee: %s\nGross Sales: %.2f\nCommission Rate: %.2f",
                super.toString(), getGrossSales(), getCommissionRate());
    }

    // Implement the Payable Interface
    @Override
    public double getPaymentAmount(){
        return getGrossSales() * getCommissionRate();
    }
}
