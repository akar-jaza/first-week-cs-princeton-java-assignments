import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Q2 ⚜️
    /* Integers and booleans. Write a program RightTriangle that takes three int
    command-line arguments and determines whether they constitute the side lengths
    of some right triangle.*/


        int c;
        int b;
        int a;
        System.out.print("enter c: ");
        c = scanner.nextInt();

        System.out.print("enter b: ");
        b = scanner.nextInt();

        System.out.print("enter a: ");
        a = scanner.nextInt();

        boolean isTrue = c + b > a && b + a > c && c + a > b;
        System.out.println(isTrue);


        // Q3 ⚜️
        /* Write a program GreatCircle.java that takes four double command-line arguments x1, y1, x2,
         and y2—the latitude and longitude (in degrees) of two points on the surface of the earth—and
         prints the great-circle distance (in kilometers) between them. Use the following Haversine formula
        */
        System.out.print("enter x1: ");
        double x1 = scanner.nextDouble();
        double x1toRadians = Math.toRadians(x1);

        System.out.print("enter y1: ");
        double y1 = scanner.nextDouble();
        double y1toRadians = Math.toRadians(y1);

        System.out.print("enter x2: ");
        double x2 = scanner.nextDouble();
        double x2toRadians = Math.toRadians(x2);

        System.out.print("enter y2: ");
        double y2 = scanner.nextDouble();
        double y2toRadians = Math.toRadians(y2);

        double r = 6371.0;

        double h1 = ((y2toRadians - y1toRadians) / 2);
        double h2 = (Math.cos(x1toRadians)) * (Math.cos(x2toRadians)) * (Math.sin(h1) * Math.sin(h1));
        double h3 = ((x2toRadians - x1toRadians) / 2);
        double h4 = (Math.sin(h3)) * (Math.sin(h3));
        double h5 = Math.sqrt(h4 + h2);
        double distance = ((2 * r) * Math.asin(h5));

        System.out.println(distance + " kilometers");



        // Q4 ⚜️
        // Write a program CMYKtoRGB.java that converts from CMYK format to RGB format

        // CMYk
        System.out.print("enter cyan: ");
        double cyan  = scanner.nextDouble();
        System.out.print("enter magenta: ");
        double magenta = scanner.nextDouble();
        System.out.print("enter yellow: ");
        double yellow  = scanner.nextDouble();
        System.out.print("enter black: ");
        double black = scanner.nextDouble();

        // Formula
        int white = (int) (1 - black);
        int red = (int) (255 * white * (1 - cyan));
        int green = (int) (255 * white * (1 - magenta));
        int blue = (int) (255 * white * (1 - yellow));
        System.out.println("    ");
        System.out.println("red = " + red);
        System.out.println("green = " + green);
        System.out.println("blue = " + blue);

    }
}