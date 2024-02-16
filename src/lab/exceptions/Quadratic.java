package lab.exceptions;

/**
 * Quadratic expressions (of the form ax^2 + bx + c).
 * 
 * @author Samuel A. Rebelsky
 * @author YOUR NAME HERE
 */
public class Quadratic {
  // +--------+------------------------------------------------------
  // | Fields |
  // +--------+
  
  /**
   * The coefficient of the x^2 component.
   */
  double a;

  /**
   * The coefficient of the x component.
   */
  double b;

  /**
   * The constant.
   */
  double c;

  // +--------------+------------------------------------------------
  // | Constructors |
  // +--------------+

  /**
   * Create a new quadratic.
   */
  public Quadratic(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  } // Quadratic(double, double, double)

  // +------------------+--------------------------------------------
  // | Standard Methods |
  // +------------------+

  /**
   * Convert to a string.
   */
  public String toString() {
    return a + "x^2 + " + b + "x + " + c;
  } // toString()

  // +---------+-----------------------------------------------------
  // | Methods |
  // +---------+

  /**
   * Build a string that shows the expression with a particular value.
   */
  public String toString(double val) {
    return a + "*" + val + "^2" + "+" + b + "*" + val + "+" + c;
  } // toString(double)
  
  /**
   * Evaluate the quadratic on a value.
   */
  public double evaluate(double x) {
    return this.a*x*x  + this.b*x + this.c;
  } // evaluate(double)

  /**
   * Find the smaller of the two roots.
   */
  public double smallerRoot() throws Exception{
    if (a == 0) {
      throw new DivideByZeroException("Cannot compute quadratic roots of linear functions.");
    } else if (Math.pow(this.b, 2) - (4 * this.a * this.c) < 0){
      throw new Exception("Imaginary root");
    }
    double root1 = (- this.b - Math.sqrt(Math.pow(this.b, 2) - (4 * this.a * this.c))) / (2 * this.a);
    double root2 = (- this.b + Math.sqrt(Math.pow(this.b, 2) - (4 * this.a * this.c))) / (2 * this.a);
    return Math.min(root1, root2);
  } // smallerRoot

  /**
   * Find the larger of the two roots.
   */
  public double largerRoot() {
    return 0;   // STUB
  } // largerRoot
} // class Quadratic
