package gr.nikolaostheofanis.books.javabook.ch10.PayableInterfaceApp;

/**
 * Payable interface test program processing Invoices and
 * Employees polymorphically.
 */
public class PayableInterfaceTest {
    public static void main(String[] args) {
        Payable[] payments = new Payable[7];
        payments[0] = new Invoice("444-444-444", "brake", 4, 45.50);
        payments[1] = new Invoice("333-333-333", "tire", 4, 95.00);
        payments[2] = new SalariedEmployee("Nik", "Adams", "121-212-212", new Date(1958, 5, 21), 1500.60);
        payments[3] = new HourlyEmployee("Melina", "Kanan", "131-313-313", new Date(1980, 1, 5), 12.50,160);
        payments[4] = new PieceWorker("Beril", "Johnson", "133-313-314", new Date(1990, 2, 5), 4.50,1600);
        payments[5] = new CommissionEmployee("Adam", "Smith", "222-222-111", new Date(1970, 10, 1),6000.00, 0.3);
        payments[6] = new BasePlusCommissionEmployee("Karen", "Price", "222-223-222", new Date(1999, 11, 7), 5000.00, 0.1, 1250.00);

        System.out.println("Invoices and Employees processed polymorphically:)");
        for (Payable currentPayment: payments){
            System.out.printf("%n%s%nPayment Due: %.2f%n", currentPayment.toString(), currentPayment.getPaymentAmount());
        }
    }
}
