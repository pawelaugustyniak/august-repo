/**
 * Created by rb21776 on 2016-08-02.
 */
    public class Main {
    public static void main(String[] args) {
        Square square = new Square(100);
        System.out.println("The dimmensions of square are: " + square.getHeigh() + "x" +square.getWidth());
        Rectangle rectangle = square;

        rectangle.setHeigh(150);
        System.out.println("The dimmensions of square are: " + square.getHeigh() + "x" +square.getWidth());



    }
}
