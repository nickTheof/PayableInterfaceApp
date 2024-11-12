package gr.nikolaostheofanis.books.javabook.ch10.PayableInterfaceApp;


/**
 * Define abstract superclass Employee that implements the Payable Interface
 */
public abstract class Employee implements Payable{
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private final Date birthDate;

    // constructor
    public Employee(String firstName, String lastName, String socialSecurityNumber, Date birthDate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.birthDate = birthDate;
    } // end constructor

    // getter method for first Name
    public String getFirstName() {
        return firstName;
    }

    // getter method for Last Name
    public String getLastName() {
        return lastName;
    }

    // getter method for Social Security Number
    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    // getter method for birth Date
    public Date getBirthDate() {
        return birthDate;
    }

    // String representation of Employee class
    @Override
    public String toString(){
        return String.format("First Name: %s\nLast Name: %s\nSocial Security Number: %s\nBirth Date: %s",
                getFirstName(), getLastName(), getSocialSecurityNumber(), getBirthDate());
    }
} // end abstract superclass Employee
