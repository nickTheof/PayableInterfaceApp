package gr.nikolaostheofanis.books.javabook.ch10.PayableInterfaceApp;
/**
 * Define concrete subclass HourlyEmployee that inherits from Employee abstract superclass
 */
public class HourlyEmployee extends Employee{
    private double wagePerHour;
    private int workingHours;

    // constructor
    public HourlyEmployee(String firstName, String lastName, String socialSecurityNumber, Date birthDate,
                          double wagePerHour, int workingHours){
        super(firstName, lastName, socialSecurityNumber, birthDate);
        if (wagePerHour < 0.0){ // validate wage per working hour
            throw new IllegalArgumentException("Wage per hour must be >= 0.0");
        }
        if (workingHours < 0){ // validate working hours
            throw new IllegalArgumentException("Working hours must be >= 0");
        }
        this.wagePerHour = wagePerHour;
        this.workingHours = workingHours;
    } // end constructor

    // getter method for wage per hour
    public double getWagePerHour() {
        return wagePerHour;
    }

    // setter method for wage per hour
    public void setWagePerHour(double wagePerHour) {
        if (wagePerHour < 0.0){ // validate wage per working hour
            throw new IllegalArgumentException("Wage per hour must be >= 0.0");
        }
        this.wagePerHour = wagePerHour;
    }

    // getter method for working hours
    public int getWorkingHours(){
        return workingHours;
    }

    // setter method for working hours
    public void setWorkingHours(int workingHours) {
        if (workingHours < 0){ // validate working hours
            throw new IllegalArgumentException("Working hours must be >= 0");
        }
        this.workingHours = workingHours;
    }

    // String representation of HourlyEmployee class
    @Override
    public String toString(){
        return  String.format("Hourly Salaried Employee:\n%s\nWage Per Hour: %.2f\nWorking Hours: %d", super.toString(), getWagePerHour(), getWorkingHours());
    }

    // Implement the Payable Interface
    @Override
    public double getPaymentAmount(){
        return getWagePerHour() * getWorkingHours();
    }
}
