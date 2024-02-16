package lab.exceptions;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class QR {
  public static void main (String[] args) throws Exception{
    PrintWriter pen = new PrintWriter(System.out, true);
    BufferedReader eyes = new BufferedReader(new InputStreamReader(System.in));
    double a = readQuad(pen, eyes, "Please enter the first coefficient: ");
    double b = readQuad(pen, eyes, "Please enter the second coefficient: ");
    double c = readQuad(pen, eyes, "Please enter the third coefficient: ");
    Quadratic q = new Quadratic(a, b, c);
    pen.println(q.smallerRoot());
    pen.println("Sorry, I could not compute a root");



  }

  public static double readQuad(PrintWriter pw, BufferedReader br, String prompt)
  {
    if (!prompt.equals("")) {
      pw.print(prompt);
      pw.flush();
    } // if there is a prompt
    try {
      String response = br.readLine();
      return Double.parseDouble(response);
    } catch (Exception e) {
      return 0;
    }
  } // readInt
}
