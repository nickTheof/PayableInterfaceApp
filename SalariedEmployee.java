package gr.nikolaostheofanis.books.javabook.ch10.PayableInterfaceApp;

/**
 * Define concrete subclass SalariedEmployee that inherits from Employee abstract superclass
 */
public class SalariedEmployee extends Employee{
    private double monthlySalary;

    // constructor
    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, Date birthDate, double monthlySalary){
        super(firstName, lastName, socialSecurityNumber, birthDate);
        if (monthlySalary < 0.0){ // validate monthly salary
            throw new IllegalArgumentException("Monthly Salary must be >= 0.0");
        }
        this.monthlySalary = monthlySalary;
    } // end constructor

    // getter method for monthly salary
    public double getMonthlySalary() {
        return monthlySalary;
    }

    // setter method for monthly salary
    public void setMonthlySalary(double monthlySalary){
        if (monthlySalary < 0.0){ // validate monthly salary
            throw new IllegalArgumentException("Monthly Salary must be >= 0.0");
        }
        this.monthlySalary = monthlySalary;
    }

    // String representation of SalariedEmployee class
    @Override
    public String toString(){
        return String.format("Monthly Salaried Employee:\n%s\nMonthly Salary: %.2f", super.toString(), getMonthlySalary());
    }

    // Implement the Payable Interface
    @Override
    public double getPaymentAmount(){
        return getMonthlySalary();
    }
}
