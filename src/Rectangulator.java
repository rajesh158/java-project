public class Rectangulator {
  public static void main(String[] args) {
    int length = Integer.parseInt(args[0]);
    int width = Integer.parseInt(args[1]);

    Rectangle myRectangle = new Rectangle (length, width);

    String output = String.format("****Your Rectangle**** \n\nLength: %d\n\nWidth: %d\n\nArea: %d\nPerimeter: %d\n\n", myRectangle.length, myRectangle.width, myRectangle.getArea(), myRectangle.getPerimeter());

    system.out.println(output);
  }
}

