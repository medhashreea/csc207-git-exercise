public class HelloWorld {
  public static void main (String[] args) {
    java.io.PrintWriter pen;

    pen = new java.io.PrintWriter(System.out, true);
    pen.println ("Hello, World!");
    pen.flush();
  } // main(String[])
} // class First
