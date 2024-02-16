package lab.exceptions;

public class DivideByZeroException extends Exception{
  public DivideByZeroException() {
    super();
  } // DivideByZeroException()
  public DivideByZeroException(String reason) {
    super(reason);
  } // DIvideByZeriException(reason)
}
