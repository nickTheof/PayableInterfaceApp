package gr.nikolaostheofanis.books.javabook.ch10.PayableInterfaceApp;
/**
 * Define concrete subclass PieceWorker that inherits from Employee abstract superclass
 */
public class PieceWorker extends Employee{
    private double wagePerPiece;
    private int pieces;

    // constructor
    public PieceWorker(String firstName, String lastName, String socialSecurityNumber, Date birthDate,
                       double wagePerPiece, int pieces){
        super(firstName, lastName, socialSecurityNumber, birthDate);
        if (wagePerPiece < 0.0){ // validate wage per piece
            throw new IllegalArgumentException("Wage per piece must be >= 0.0");
        }
        if (pieces < 0){ // validate pieces
            throw new IllegalArgumentException("Pieces must be >= 0");
        }
        this.wagePerPiece = wagePerPiece;
        this.pieces = pieces;
    } // end constructor

    // getter method for wage per piece
    public double getWagePerPiece() {
        return wagePerPiece;
    }

    // setter method for wage per piece
    public void setWagePerPiece(double wagePerPiece) {
        if (wagePerPiece < 0.0){ // validate wage per piece
            throw new IllegalArgumentException("Wage per piece must be >= 0.0");
        }
        this.wagePerPiece = wagePerPiece;
    }

    // getter method for pieces
    public int getPieces(){
        return pieces;
    }

    // setter method for pieces
    public void setPieces(int pieces) {
        if (pieces < 0){ // validate pieces
            throw new IllegalArgumentException("Pieces must be >= 0");
        }
        this.pieces = pieces;
    }

    // String representation of PieceWorker class
    @Override
    public String toString(){
        return  String.format("PieceWorker Employee:\n%s\nWage Per Piece: %.2f\nPieces: %d", super.toString(), getWagePerPiece(), getPieces());
    }

    // Implement the Payable Interface
    @Override
    public double getPaymentAmount(){
        return getWagePerPiece() * getPieces();
    }
}
