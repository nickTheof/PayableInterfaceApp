package gr.nikolaostheofanis.books.javabook.ch10.PayableInterfaceApp;

/**
 * Define concrete subclass BasePlusCommissionEmployee that inherits from CommissionEmployee subclass
 */
public class BasePlusCommissionEmployee extends CommissionEmployee {
    private double baseSalary;

    // constructor
    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecurityNumber, Date birthDate,
                                      double grossSales, double commissionRate, double baseSalary){
        super(firstName, lastName, socialSecurityNumber, birthDate, grossSales, commissionRate);
        if (baseSalary < 0.0){ // validate base salary
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    //getter method for base salary

    public double getBaseSalary() {
        return baseSalary;
    }

    //setter method for base salary
    public void setBaseSalary(double baseSalary){
        if (baseSalary < 0.0){ // validate base salary
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString(){
        return String.format("%s\nBase Salary: %.2f", super.toString(), getBaseSalary());
    }

    @Override
    public double getPaymentAmount(){
        return getBaseSalary() + super.getPaymentAmount();
    }
}
