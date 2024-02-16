package lab.exceptions;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * A simple experiment to see whether readInt works. (Unit tests are a PITA for
 * I/O.)
 * 
 * @author Samuel A. Rebelsky
 * @author Your Name Here
 */
public class ReadIntExpt1 {
  public static void main(String[] args) throws Exception{
    PrintWriter pen = new PrintWriter(System.out, true);
    BufferedReader eyes = new BufferedReader(new InputStreamReader(System.in));

    Quadratic test1 = new Quadratic(1, 3, -10);
    pen.println(test1.smallerRoot());
    Quadratic test2 = new Quadratic(6, 1, -12);
    pen.println(test2.smallerRoot());

    int i = IOUtils.readInt(pen, eyes, "Please enter an integer: ");
    pen.println(i + " squared is " + (i * i));
  } // main(String[])

} // ReadIntExpt1
